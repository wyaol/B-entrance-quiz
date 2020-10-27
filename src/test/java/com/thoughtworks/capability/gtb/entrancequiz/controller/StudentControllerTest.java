package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.capability.gtb.entrancequiz.data.Student;
import com.thoughtworks.capability.gtb.entrancequiz.data.StudentData;
import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class StudentControllerTest {

    @Autowired
    MockMvc mockMvc;

    private StudentData studentData = StudentData.getInstance();

    @BeforeEach
    void start() {

    }

    @Test
    void should_add_student() throws Exception {
        StudentDTO studentDTO = new StudentDTO("test");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(studentDTO);

        mockMvc.perform(post("/students").contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isCreated());
        assertEquals(5, studentData.findAll().size());
    }

    @Test
    void should_list_students() throws Exception {
        mockMvc.perform(get("/students"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(studentData.findAll().size())));
    }
}
