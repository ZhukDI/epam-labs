package com.zhukdi.epam.lab1.entity;

import java.util.Map;

public class Student {

    String name;
    Map<String, Integer> subjectRatingsMap;

    public Student(String name, Map<String, Integer> subjectRatingsMap) {
        this.name = name;
        this.subjectRatingsMap = subjectRatingsMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getSubjectRatingsMap() {
        return subjectRatingsMap;
    }

    public void setSubjectRatingsMap(Map<String, Integer> subjectRatingsMap) {
        this.subjectRatingsMap = subjectRatingsMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjectRatingsMap=" + subjectRatingsMap +
                '}';
    }
}
