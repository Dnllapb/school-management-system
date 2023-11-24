package org.example.entity;

public class Student {

    private Integer id_student;
    private String name_student;
    private String last_name;
    private String birthday;

    private String status;

    public Student(Integer id_student, String name_student, String last_name, String birthday, String status) {
        this.id_student = id_student;
        this.name_student = name_student;
        this.last_name = last_name;
        this.birthday = birthday;
        this.status = status;
    }

    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(Integer id_student) {
        this.id_student = id_student;
    }

    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", name_student='" + name_student + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
