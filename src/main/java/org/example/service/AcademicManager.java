package org.example.service;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.interfaces.ServicesAcademicsI;

import java.util.HashMap;
import java.util.List;

public class AcademicManager implements ServicesAcademicsI {

    private List <Student> studentList;
    private List <Course> courseList;
    HashMap<String, List<String>> studentsAndCourses = new HashMap<>();

    @Override
    public void enrolledStudent(Student student) {

    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public void enrolledStudentCourse(Student student, int idCourse) {

    }

    @Override
    public void unsubscribe(int idStudent, int idCourse) {

    }
}
