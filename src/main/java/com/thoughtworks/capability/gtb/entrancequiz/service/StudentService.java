package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.data.Student;
import com.thoughtworks.capability.gtb.entrancequiz.data.StudentData;
import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentData studentData = new StudentData();

    public void addStudent(StudentDTO studentDTO) {
        studentData.insert(new Student(studentDTO.getName()));
    }
}
