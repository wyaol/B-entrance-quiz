package com.thoughtworks.capability.gtb.entrancequiz.data;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

    private static StudentData instance;
    private List<Student> students = new ArrayList<>();

    public static StudentData getInstance() {
        if (instance == null) {
            instance = new StudentData();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    public void insert(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }
}

