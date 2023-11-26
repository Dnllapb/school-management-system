package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private String status;
 private Student student;

    public Student(Integer id, String name, String last_name, String birthday, String status) {
        super(id, name, last_name, birthday);
        this.status = status;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return String.format("%-10s| %-10s | %-10s | %-10s |  %s",
                getId(), getName(),getLast_name() ,getBirthday(), getStatus());

    }
    public Student()
    {

    }
}