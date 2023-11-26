package org.example.exception;

public class CourseAddException extends Exception{
    public CourseAddException(String message) {
        super("The course is already exists");
    }
}
