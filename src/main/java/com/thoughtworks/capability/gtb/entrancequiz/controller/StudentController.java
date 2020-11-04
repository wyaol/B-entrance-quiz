package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentDTO;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    // TODO GTB-知识点: - 建议使用构造方法注入bean
    // TODO GTB-工程实践: - 建议private，遵循最小访问原则
    @Resource
    StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody StudentDTO studentDTO) {
        studentService.addStudent(studentDTO);
    }

    // TODO GTB-知识点: - 状态码默认为200，可以省略@ResponseStatus注解
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentDTO> getStudents() {
        return studentService.getStudents();
    }
}
