package org.example.interfaces;

import org.example.entity.Course;
import org.example.entity.Student;

public interface ServicesAcademicsI {
   void enrolledStudent(Student student);
   void addCourse(Course course);
   void enrolledStudentCourse(Student student,int idCourse);
   void unsubscribe (int idStudent,int idCourse);

}
