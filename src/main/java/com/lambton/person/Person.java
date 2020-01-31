package com.lambton.person;

import com.lambton.IDisplay;

public class Person implements IDisplay
 {

     private int id;
     private String name;
     protected String gender;

     public Person(int id, String name, String gender) {
         this.id = id;
         this.name = name;
         this.gender = gender;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getGender() {
         return gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
     }

     @Override
     public void display() {
         System.out.println("I am from Person");
     }
 }
