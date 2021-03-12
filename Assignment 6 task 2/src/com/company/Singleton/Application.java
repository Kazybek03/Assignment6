package com.company.Singleton;

public class Application {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello");
        System.out.println(singleton.returnWord);
    }
}
