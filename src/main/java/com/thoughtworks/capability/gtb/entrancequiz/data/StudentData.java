package com.thoughtworks.capability.gtb.entrancequiz.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    private List<Student> students = new ArrayList<>();

    public void insert(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student {
    private Integer id;
    private String name;
}
