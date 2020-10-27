package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.data.Student;
import com.thoughtworks.capability.gtb.entrancequiz.data.StudentData;
import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentData studentData = StudentData.getInstance();

    private StudentDTO studentToStudentDTO(Student student) {
        return new StudentDTO(student.getId(), student.getName());
    }

    public void addStudent(StudentDTO studentDTO) {
        studentData.insert(new Student(studentDTO.getName()));
    }

    public List<StudentDTO> getStudents() {
        List<Student> students = studentData.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        students.forEach(student -> studentDTOS.add(studentToStudentDTO(student)));
        return studentDTOS;
    }
}
