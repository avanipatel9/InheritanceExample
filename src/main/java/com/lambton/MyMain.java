package com.lambton;

import com.lambton.faculties.Faculty;
import com.lambton.person.Person;
import com.lambton.students.PartTimeStudent;
import com.lambton.students.Student;

public class MyMain
{
    public static void main(String[] args) {
        Person p1 = new Person(1, "Avani", "Female");
        Student s1 = new Student(1,"Avani Patel","Female","MADT", "Lambton", 90 );
        Faculty f1 = new Faculty(1, "Pritesh Patel", "Male", "Tutor", 2000);
        PartTimeStudent ps1 = new PartTimeStudent(1,"Parth","Male","MADT","Lambton",95,100);

        p1 = s1;
        p1.display();

        p1 = ps1;
        p1.display();

        IDisplay iDisplay;

        iDisplay = p1;
        iDisplay.display();

        iDisplay = s1;
        iDisplay.display();

        iDisplay = ps1;
        iDisplay.display();
    }
}
