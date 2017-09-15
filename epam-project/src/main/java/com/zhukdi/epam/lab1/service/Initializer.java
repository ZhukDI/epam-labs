package com.zhukdi.epam.lab1.service;

import com.google.gson.Gson;
import com.zhukdi.epam.lab1.entity.Faculty;
import com.zhukdi.epam.lab1.entity.Group;
import com.zhukdi.epam.lab1.entity.Student;
import com.zhukdi.epam.lab1.entity.University;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Initializer {
    private static File file = new File("src/main/resources/university.json");

    public static void serialize(String json) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter.write(json);
            } finally {
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University deserializeUniversity() {
        Gson gson = new Gson();
        BufferedReader br = null;
        University university = null;
        try {
            br = new BufferedReader(new FileReader(file));
            university = gson.fromJson(br, University.class);

            if (university != null) {
                System.out.println(university);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return university;
    }

    public static List<Faculty> initializeFaculties(University university) {
        return university.getFacultyList();
    }

    public static List<Group> initializeGroups(List<Faculty> facultyList) {
        List<Group> groupList = new ArrayList<>();
        for (Faculty faculty : facultyList) {
            groupList.addAll(faculty.getGroupList());
        }
        return groupList;
    }

    public static List<Student> initializeStudents(List<Group> groupList) {
        List<Student> studentList = new ArrayList<>();
        for (Group group : groupList) {
            studentList.addAll(group.getStudentList());
        }
        return studentList;
    }


}
