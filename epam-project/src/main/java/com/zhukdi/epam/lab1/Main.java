package com.zhukdi.epam.lab1;

import com.zhukdi.epam.lab1.entity.Faculty;
import com.zhukdi.epam.lab1.entity.Group;
import com.zhukdi.epam.lab1.entity.Student;
import com.zhukdi.epam.lab1.entity.University;
import com.zhukdi.epam.lab1.service.AverageCalculator;
import com.zhukdi.epam.lab1.service.Initializer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        University university = Initializer.deserializeUniversity();
        List<Faculty> facultyList = Initializer.initializeFaculties(university);
        List<Group> groupList = Initializer.initializeGroups(facultyList);
        List<Student> studentList = Initializer.initializeStudents(groupList);

        for (Student student : studentList) {
            System.out.println(student);
            System.out.print("Average score of student " + student.getName() + ": ");
            System.out.println(AverageCalculator.CalculateAverageScore(student));
        }
        System.out.println("");
        for (Group group : groupList) {
            System.out.println(group);
            System.out.print("Average score of group number " + group.getNumber() + ": ");
            System.out.println(AverageCalculator.CalculateAverageScore(group));
            System.out.print("By subject Mathematical analysis: ");
            System.out.println(AverageCalculator.CalculateSubjectAverageScore("Mathematical analysis", group));
        }
        System.out.println("");
        for (Faculty faculty : facultyList) {
            System.out.println(faculty);
            System.out.print("Average score of faculty " + faculty.getName() + ": ");
            System.out.println(AverageCalculator.CalculateAverageScore(faculty));
            System.out.print("By subject Mathematical analysis: ");
            System.out.println(AverageCalculator.CalculateSubjectAverageScore("Mathematical analysis", faculty));
        }
        System.out.println("");
        System.out.println(university);
        System.out.print("Average score of university " + university.getName() + ": ");
        System.out.println(AverageCalculator.CalculateAverageScore(university));
        System.out.print("By subject Algebra: ");
        System.out.println(AverageCalculator.CalculateSubjectAverageScore("Algebra", university));
    }
}
