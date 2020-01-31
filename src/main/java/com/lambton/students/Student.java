package com.lambton.students;

import com.lambton.person.Person;

public class Student extends Person
{

    String courseName;
    String collegeName;
    int totalMarks;

    public Student(int id, String name, String gender, String courseName, String collegeName, int totalMarks) {
        super(id, name, gender);
        this.courseName = courseName;
        this.collegeName = collegeName;
        this.totalMarks = totalMarks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public void display()
    {
        System.out.println("I am from Student");
    }
}
