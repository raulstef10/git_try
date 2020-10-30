package com.company;

public class SammysMotto2 {

    public static void main(String[] args) {
        surround("Sammy’s  makes  it  fun  in  the  sun");
    }

    public static void surround(String s) {

        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("S");
        }
        System.out.println("");
        System.out.println("S " + s + " S");
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("S");
        }

    }

}
