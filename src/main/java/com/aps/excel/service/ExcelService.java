package com.aps.excel.service;

import com.aps.excel.model.StudentDTO;

import java.io.IOException;
import java.util.List;

public interface ExcelService {
    List<StudentDTO> readExcel(String path) throws IOException;
}
