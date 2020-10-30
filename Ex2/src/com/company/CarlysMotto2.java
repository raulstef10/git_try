package com.company;

public class CarlysMotto2 {

    public static void main(String[] args) {
        surround("Carly’s makes the food that makes it a party");
    }

    public static void surround(String s) {

        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("* " + s + " *");
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("*");
        }

    }

}
