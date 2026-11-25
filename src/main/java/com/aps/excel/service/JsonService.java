package com.aps.excel.service;

import com.aps.excel.model.StudentDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface JsonService {
    String transformJson(List<StudentDTO> studentList) throws JsonProcessingException;
}
