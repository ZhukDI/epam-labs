package com.zhukdi.epam.lab1.entity;

import java.util.List;

public class Group {

    String number;
    List<Student> studentList;

    public Group(String number, List<Student> studentList) {
        this.number = number;
        this.studentList = studentList;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "number='" + number + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
