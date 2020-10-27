package com.thoughtworks.capability.gtb.entrancequiz.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentData {

    private static StudentData instance;
    private List<Student> students = new ArrayList<>();

    public static StudentData getInstance() {
        if (instance == null) {
            instance = new StudentData();
            instance.init();
        }
        return instance;
    }

    private void init() {
        String[] studentNames = {"大乔", "派克", "剑圣", "皇子"};
        Arrays.stream(studentNames).forEach(studentName -> this.insert(new Student(studentName)));
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

