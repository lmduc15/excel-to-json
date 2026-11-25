package com.aps.excel.service;

import com.aps.excel.model.StudentDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonServiceImpl implements JsonService {

    @Override
    public String transformJson(List<StudentDTO> studentList) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(studentList);
        return objectMapper.writeValueAsString(studentList);
    }
}
