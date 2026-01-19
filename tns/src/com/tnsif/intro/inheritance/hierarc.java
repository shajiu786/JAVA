package com.tnsif.intro.inheritance;

import java.util.Scanner;

// Parent class
class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// Child class 1
class SchoolStudent extends Student {
    void attendClass() {
        System.out.println(name + " is attending school classes");
    }
}

// Child class 2
class SportsStudent extends Student {
    void playSports() {
        System.out.println(name + " is playing school sports");
    }
}

// Main class
public class hierarc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        SchoolStudent s1 = new SchoolStudent();
        s1.setName(studentName);
        s1.attendClass();

        SportsStudent s2 = new SportsStudent();
        s2.setName(studentName);
        s2.playSports();

        sc.close();
    }
}
