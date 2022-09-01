package com.codewithme;

import java.util.Scanner;

class TestString2 {
    static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        //System.out.println(temp);
        if (temp.indexOf(s2) != -1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String1: ");
        String firstString = sc.nextLine();
        System.out.print("Enter a String2: ");
        String secondString = sc.nextLine();
        if (checkRotation(firstString, secondString))
            System.out.println("Given Strings are rotations of each other.");
        else
            System.out.println("Given Strings are not rotations of each other.");
    }
}
//codevillageforcode
//forcodecodevillage

