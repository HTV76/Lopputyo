package com.lopputyo.kurssit.data;

public class Course {
    private int id;       // Tällä erotellaan kurssisuoritukset opiskelija ja kurssikohtaisesti
    private String course;
    private String student;
    private int credits;
    private int grade;

    public Course() {
    }

    public Course(int id, String course, String student, int credits, int grade) {
        this.id = id;
        this.course = course;
        this.student = student;
        this.credits = credits;
        this.grade = grade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudent() {
        return this.student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    

    

}
