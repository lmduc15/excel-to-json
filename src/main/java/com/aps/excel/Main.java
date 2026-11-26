package com.aps.excel;

import com.aps.excel.model.StudentDTO;
import com.aps.excel.service.ExcelService;
import com.aps.excel.service.ExcelServiceImpl;
import com.aps.excel.service.JsonService;
import com.aps.excel.service.JsonServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, JsonProcessingException {
        ExcelService excelService = new ExcelServiceImpl();
        JsonService jsonService = new JsonServiceImpl();

        List<StudentDTO> studentList = excelService.readExcel("src/main/java/com/aps/excel/resources/excel_transform.xlsx");
        System.out.println("danh sach sinh vien JSON: ");
        System.out.println(jsonService.transformJson(studentList));
    }
}
