package org.example.service;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.exception.CourseAddException;
import org.example.exception.StudentEnrolledException;
import org.example.interfaces.ServicesAcademicsI;

import java.util.*;

public class AcademicManager implements ServicesAcademicsI {

    private List<Student>studentList = new ArrayList<>();

    private List <Course> courseList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, List<Course>> courseHashMap = new HashMap<>();


    public AcademicManager() {

    }



    @Override
    public void enrollStudent(Student student) {
            System.out.println("------ENROLL STUDENT------------");
            try {
                System.out.println("Please enter the Id Student");
                Integer id = scanner.nextInt();
                scanner.nextLine();

                for (Student existingStudent : studentList) {
                    if (existingStudent.getId().equals(id)) {
                        throw new StudentEnrolledException();
                    }
                }

                System.out.println("Please enter the name");
                String name = scanner.next();
                scanner.nextLine();
                System.out.println("Please enter the last name");
                String lastName = scanner.next();
                scanner.nextLine();
                System.out.println("Please enter the birthday YYYY-YY-YY");
                String birthday = scanner.next();
                scanner.nextLine();
                System.out.println("Please enter the Status");
                String status = scanner.next();
                scanner.nextLine();

                student = new Student(id, name, lastName, birthday, status);
                studentList.add(student);
                System.out.println(studentList.toString());
                System.out.println("------ENROLL COMPLETED-------------------");
                System.out.println("--------PLEASE ENTER----------------------------");
            } catch (StudentEnrolledException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                // Handle other exceptions
                e.printStackTrace();
            }
    }

    @Override
    public void addCourse(Course course) {
        scanner.nextLine();

            System.out.println("------ADD COURSE ------------");
            System.out.println("Please enter the Id Course");
            Integer id = scanner.nextInt();


            scanner.nextLine();
            System.out.println("Please enter the name Course");
            String name = scanner.next();
            scanner.nextLine();
            System.out.println("Please enter the description ");
            String description = scanner.next();
            scanner.nextLine();
            System.out.println("Please enter the numberCredits");
            Integer numberCredits = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please enter the version");
            String version = scanner.next();
            scanner.nextLine();


            course = new Course(id,name,description,numberCredits,version);
            courseList.add(course);
            System.out.println(courseList.toString());

        }

    @Override
    public void enrollStudentCourse(Student student,Course course) throws StudentEnrolledException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student id");
        student.setId(scanner.nextInt());

        System.out.println("Enter the Course code");
        course.setIdCourse(scanner.nextInt());


        // Verificar si el estudiante ya está en el HashMap
        List<Course> enrolledCourses = courseHashMap.getOrDefault(student.getId(), new ArrayList<>());


        // Agregar el nuevo curso a la lista de cursos del estudiante
        enrolledCourses.add(course);


        // Actualizar el HashMap con la lista de cursos del estudiante
        courseHashMap.put(student.getId(), enrolledCourses);

        System.out.println(courseHashMap);
        System.out.println("" +
                ".");

}




    @Override
    public void unsubscribe(int idStudent, int idCourse) {

    }
    public Optional<Student> findStudentById(String id) {
        return studentList.stream()
                .filter(student -> student.getId().equals(id))
                .findAny();
    }

    public Optional<Course> findCourseByCode(String code) {
        return courseList.stream()
                .filter(course -> course.getIdCourse().equals(code))
                .findAny();
    }

}
