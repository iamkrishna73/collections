package com.codewithme;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> studentRecord = new LinkedList<>();
        studentRecord.add(2);
        studentRecord.add(3);
        studentRecord.add(4);
        studentRecord.add(5);
        studentRecord.add(6);
        studentRecord.add(7);

        System.out.print("Before reverse the list: " + studentRecord);
        Collections.reverse(studentRecord);
        System.out.print("After reverse the list: " + studentRecord);

    }
}
