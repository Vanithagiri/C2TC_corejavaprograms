package com.tnsif.dayone;

public class Student {
    int sid;
    String sname;
    float avg;

    public static void main(String[] args) {
        
        Student s1 = new Student();

        System.out.println("Student name: " + s1.sname); // default = null
        System.out.println("Student Id: " + s1.sid);     // default = 0
        System.out.println("Student Average: " + s1.avg); // default = 0.0
    }
}
