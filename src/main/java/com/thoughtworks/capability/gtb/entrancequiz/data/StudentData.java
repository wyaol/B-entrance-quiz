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
        String[] studentNames = {"大乔", "派克", "剑圣", "皇子", "虚空之眼", "寒冰射手",
                "赏金猎人", "德玛西亚", "狗熊", "蜘蛛", "人马", "光辉"};
        Arrays.stream(studentNames).forEach(studentName -> this.insert(new Student(studentName)));
    }

    private Object readResolve() {
        return instance;
    }

    public void insert(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        List<Student> resStudents = new ArrayList<>();
        students.forEach(student -> {
            try {
                resStudents.add(student.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        });
        return resStudents;
    }
}

