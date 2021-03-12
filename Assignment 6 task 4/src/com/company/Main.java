package com.company;

public class Main {

    public static void main(String[] args) {
        Home1 h1 = new Home1();
        Home2 h2 = new Home2();

        System.out.println(h1.getDoor() + ". " + h1.getWindow() + ". " + h1.numberRooms() + ". " + h1.specialThing());
        System.out.println(h2.getDoor() + " " + h2.getWindow() + " " + h2.numberRooms() + " " + h2.specialThing());
    }
}

