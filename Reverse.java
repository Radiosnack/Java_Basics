package com.muskan;



public class Reverse {
    public static void main(String[] args) {


        System.out.println(reverse(374837));
    }

     public static int reverse(int number){
        int reverse = 0;
        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            reverse =  (reverse * 10) + rem;
        }
         return reverse;
     }


}
