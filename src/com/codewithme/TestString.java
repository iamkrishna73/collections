package com.codewithme;


import java.util.Scanner;

public class TestString {
    public static boolean areRotations(String s1, String s2 ) {
        StringBuffer sb1 = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer(s2);

        for(int i = 0; i < sb1.length(); i++) {
            sb1.append(sb1.charAt(0));
            sb1.deleteCharAt(0);
            if(sb2.compareTo(sb1) == 0)
                return true;
        }

        return false;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String1: ");
        String firstString = sc.nextLine();
        System.out.print("Enter a String2: ");
        String secondString = sc.nextLine();
        if (areRotations(firstString, secondString)) {
            System.out.println("Given Strings are rotations of each other.");
        }
        else {
            System.out.println("Given Strings are not rotations of each other.");
        }
    }
}
