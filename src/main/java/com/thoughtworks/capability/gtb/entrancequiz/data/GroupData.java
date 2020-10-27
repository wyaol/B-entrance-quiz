package com.thoughtworks.capability.gtb.entrancequiz.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupData {
    private List<Group> groups;
    private static GroupData instance;
    private static Integer groupNum = 6;

    public static GroupData getInstance() {
        if (instance == null) {
            instance = new GroupData();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    public void reset() {
        groups = new ArrayList<>();
        for (int i = 0; i < groupNum; ++i) {
            groups.add(new Group(String.format("%d 组", i + 1)));
        }
    }

    public static Integer getGroupNum() {
        return groupNum;
    }

    public Group findGroupByIndex(Integer index) {
        return groups.get(index);
    }

    public void addStudentByIndex(Student student, Integer index) {
        groups.get(index).addStudent(student);
    }
}
