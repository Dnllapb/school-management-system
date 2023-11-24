package org.example.entity;

public class Course {
    private Integer idCourse;
    private String nameCourse;
    private String description;
    private Integer numberCredits;
    private String version;

    public Course(Integer idCourse, String nameCourse, String description, Integer numberCredits, String version) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.description = description;
        this.numberCredits = numberCredits;
        this.version = version;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberCredits() {
        return numberCredits;
    }

    public void setNumberCredits(Integer numberCredits) {
        this.numberCredits = numberCredits;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", nameCourse='" + nameCourse + '\'' +
                ", description='" + description + '\'' +
                ", numberCredits=" + numberCredits +
                ", version='" + version + '\'' +
                '}';
    }
}
