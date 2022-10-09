package com.muskan;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        System.out.println(SI(23,545,77));;
    }

    private static float SI(int p, int r, int t) {
                return (p * r * t) / 100;
    }


}
