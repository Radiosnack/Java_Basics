package com.muskan;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        String naam = null;
        System.out.println(greet(naam));
    }

    private static String greet(String name) {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        return "Namaste" + " " + name;

    }

}
