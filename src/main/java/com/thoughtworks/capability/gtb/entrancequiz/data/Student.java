package com.thoughtworks.capability.gtb.entrancequiz.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Cloneable {
    private Integer id;
    private String name;
    public static Integer currentId = 1;

    public Student(String name) {
        this.id = currentId;
        currentId += 1;
        this.name = name;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
