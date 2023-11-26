package org.example.interfaces;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.exception.StudentEnrolledException;

public interface ServicesAcademicsI {
   void enrollStudent(Student student);
   void addCourse(Course course);
   void enrollStudentCourse(Student student, Course course) throws StudentEnrolledException;
   void unsubscribe (int idStudent,int idCourse);

}
