package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello!");
        //Singleton singleton1 = Singleton.getInstance("Bye bye!");

        System.out.println(singleton.returnWord);
        //System.out.println(singleton1.returnWord);


    }
}
