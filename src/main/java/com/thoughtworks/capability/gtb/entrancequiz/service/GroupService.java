package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.data.Group;
import com.thoughtworks.capability.gtb.entrancequiz.data.GroupData;
import com.thoughtworks.capability.gtb.entrancequiz.data.Student;
import com.thoughtworks.capability.gtb.entrancequiz.data.StudentData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GroupService {

    private GroupData groupData = GroupData.getInstance();
    private StudentData studentData = StudentData.getInstance();

    public void group() {
        groupData.reset();
        List<Student> students = studentData.findAll();
        int index = 0;
        while (students.size() != 0) {
            Random random = new Random();
            int n = random.nextInt(students.size());
            Student student = students.get(n);
            groupData.addStudentByIndex(student, index);
            students.remove(n);
            index ++;
            if (index == 6) index = 0;
        }
    }

    public List<Group> getGroups() {
        return groupData.getGroups();
    }
}
