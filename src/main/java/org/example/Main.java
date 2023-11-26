package org.example;


import org.example.entity.Course;
import org.example.entity.Student;
import org.example.menu.Menu;
import org.example.service.AcademicManager;
import org.example.exception.StudentEnrolledException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws StudentEnrolledException
    {
        Scanner scanner = new Scanner(System.in);
        AcademicManager academicManager = new AcademicManager();
        Student student= new Student();
        Course course = new Course();

        public void Menu(){
        int selection = subMenu();
        while (selection != 4)
        {
            switch (selection) {

                case 1:
                    academicManager.enrollStudent(student);
                    break;
                case 2:
                    academicManager.addCourse(course);
                    break;
                case 3:
                    academicManager.enrollStudentCourse(student,course);
                    break;
                case 4:
                    academicManager.unsubscribe(student,course);
                    break;

            }
            selection = submenu();
        }
    }

     private int subMenu()
        {
            System.out.println(" Select an option");
            System.out.println(" 1. Enroll Student");
            System.out.println(" 2. Add Course");
            System.out.println(" 3. Enrolled Student to Course");
            System.out.println(" 4. Unscribe Student to Course");
            System.out.println("Enter the option");
            int selection =6;
            try {
                selection = scanner.nextInt();
                if (selection < 1 || selection > 6) {
                    System.out.println("invalid option try again");
                    subMenu();
                }
            } catch (Exception e) {
                System.out.println("invalid option try again");
                subMenu;
            }
            return selection;


        }



        }

    }

}