package org.example.exception;

public class StudentEnrolledException extends Exception{
    public StudentEnrolledException() {
        super("The student is enrolled");
    }
}
