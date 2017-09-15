package com.zhukdi.epam.lab1.entity;

import java.util.List;

public class Faculty {

    private String name;
    List<Group> groupList;

    public Faculty(String name, List<Group> groupList) {
        this.name = name;
        this.groupList = groupList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", groupList=" + groupList +
                '}';
    }
}
