package org.example;


import org.example.entity.Course;
import org.example.entity.Student;
import org.example.service.AcademicManager;
import org.example.exception.StudentEnrolledException;


public class Main {
    public static void main(String[] args) throws StudentEnrolledException {

        Student student= new Student();
        Course course = new Course();
        AcademicManager academicManager = new AcademicManager();
        academicManager.enrollStudent(student);
        academicManager.addCourse(course);
        //academicManager.enrollStudent(student);
        academicManager.enrollStudentCourse(student,course);


        //academicManager.enrollStudentCourse();


    }
}