package com.zhukdi.epam.lab1.service;

import com.zhukdi.epam.lab1.entity.Faculty;
import com.zhukdi.epam.lab1.entity.Group;
import com.zhukdi.epam.lab1.entity.Student;
import com.zhukdi.epam.lab1.entity.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AverageCalculator {

    private static double CalculateSubjectAverageScore(String subject, List<Student> studentList) {
        double sum = 0;
        int studentCount = 0;
        for (Student student : studentList) {
            Object value = student.getSubjectRatingsMap().get(subject);
            if (value != null) {
                sum += (int) value;
                studentCount++;
            }
        }
        return studentCount == 0 ? 0 : sum / studentCount;
    }

    public static double CalculateSubjectAverageScore(String subject, Group group) {
        List<Student> studentList = group.getStudentList();
        return CalculateSubjectAverageScore(subject, studentList);
    }

    public static double CalculateSubjectAverageScore(String subject, Faculty faculty) {
        List<Group> groupList = faculty.getGroupList();
        List<Student> studentList = Initializer.initializeStudents(groupList);
        return CalculateSubjectAverageScore(subject, studentList);
    }

    public static double CalculateSubjectAverageScore(String subject, University university) {
        List<Faculty> facultyList = university.getFacultyList();
        List<Group> groupList = Initializer.initializeGroups(facultyList);
        List<Student> studentList = Initializer.initializeStudents(groupList);
        return CalculateSubjectAverageScore(subject, studentList);
    }

    public static double CalculateAverageScore(Student student) {
        Map<String, Integer> map = student.getSubjectRatingsMap();
        double result = 0;
        for (Integer mark : map.values()) {
            result += mark;
        }
        return result / map.size();
    }

    private static double CalculateAverageScore(List<Student> studentList) {
        double sum = 0;
        for (Student student : studentList) {
            sum += CalculateAverageScore(student);
        }
        return sum / studentList.size();
    }

    public static double CalculateAverageScore(Group group) {
        List<Student> studentList = group.getStudentList();
        return CalculateAverageScore(studentList);
    }

    public static double CalculateAverageScore(Faculty faculty) {
        List<Group> groupList = faculty.getGroupList();
        List<Student> studentList = Initializer.initializeStudents(groupList);
        return CalculateAverageScore(studentList);
    }

    public static double CalculateAverageScore(University university) {
        List<Faculty> facultyList = university.getFacultyList();
        List<Group> groupList = Initializer.initializeGroups(facultyList);
        List<Student> studentList = Initializer.initializeStudents(groupList);
        return CalculateAverageScore(studentList);
    }

}
