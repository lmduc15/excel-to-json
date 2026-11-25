package com.aps.excel.service;

import com.aps.excel.model.StudentDTO;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelServiceImpl implements ExcelService {

    @Override
    public List<StudentDTO> readExcel(String filePath) throws IOException {
        File file = new File(filePath);
        try (Workbook workbook = WorkbookFactory.create(file)) {
            Sheet sheet = workbook.getSheetAt(0);
            int lastRow = sheet.getLastRowNum(); // vi tri row cuoi dua vao index
            List<StudentDTO> studentList = new ArrayList<>();
            for (int i = 1; i <= lastRow; i++) {
                Row currentRow = sheet.getRow(i);
                Integer idCellVal = (int) currentRow.getCell(0).getNumericCellValue();
                String nameCellVal = currentRow.getCell(1).getStringCellValue();
                Integer ageCellVal = (int) currentRow.getCell(2).getNumericCellValue();
                StudentDTO student = new StudentDTO(idCellVal, nameCellVal, ageCellVal);
                studentList.add(student);
            }
            return studentList;
        }

    }
}
