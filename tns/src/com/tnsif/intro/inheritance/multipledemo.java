package com.tnsif.intro.inheritance;

import java.util.Scanner;

// First interface
interface Batsman {
    void batting(String name);
}

// Second interface
interface Bowler {
    void bowling(String name);
}

// Class implementing multiple interfaces
class AllRounder implements Batsman, Bowler {

    public void batting(String name) {
        System.out.println(name + " is batting for IPL team");
    }

    public void bowling(String name) {
        System.out.println(name + " is bowling for IPL team");
    }
}

public class multipledemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking player name from user
        System.out.print("Enter player name: ");
        String playerName = sc.nextLine();

        AllRounder player = new AllRounder();

        player.batting(playerName);
        player.bowling(playerName);

        sc.close();
    }
}
