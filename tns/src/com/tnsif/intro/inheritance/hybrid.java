package com.tnsif.intro.inheritance;

import java.util.Scanner;

// Parent class
class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// Interface 1
interface Sports {
    void playSports();
}

// Interface 2
interface Cultural {
    void participateCultural();
}

// Child class (Hybrid inheritance)
class AllRoundStudent extends Student implements Sports, Cultural {

    public void playSports() {
        System.out.println(name + " is playing sports in school");
    }

    public void participateCultural() {
        System.out.println(name + " is participating in cultural activities");
    }
}

// Main class
public class hybrid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        AllRoundStudent s = new AllRoundStudent();
        s.setName(studentName);

        s.playSports();
        s.participateCultural();

        sc.close();
    }
}
