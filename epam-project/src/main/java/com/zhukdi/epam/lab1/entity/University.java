package com.zhukdi.epam.lab1.entity;


import java.util.List;

public class University {

    private String name;
    private List<Faculty> facultyList;

    public University(String name, List<Faculty> facultyList) {
        this.name = name;
        this.facultyList = facultyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", facultyList=" + facultyList +
                '}';
    }
}
