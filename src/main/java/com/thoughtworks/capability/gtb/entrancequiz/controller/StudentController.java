package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentDTO;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Resource
    StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody String name) {
        studentService.addStudent(new StudentDTO(name));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentDTO> getStudents() {
        return studentService.getStudents();
    }
}
