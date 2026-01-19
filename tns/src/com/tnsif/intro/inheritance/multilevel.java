package com.tnsif.intro.inheritance;

class Player {
    void country() {
        System.out.println("Represents India");
    }
}

class Cricketer extends Player {
    void game() {
        System.out.println("Plays Cricket");
    }
}

class Captain extends Cricketer {
    void lead() {
        System.out.println("Leads Indian Team");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Captain c = new Captain();
        c.country();
        c.game();
        c.lead();
    }
}
