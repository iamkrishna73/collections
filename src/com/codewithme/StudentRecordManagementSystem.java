package com.codewithme;

import java.util.*;

public class StudentRecordManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Object> studentRecord = new LinkedList<>();
        System.out.println("Insert Student Record");
        studentRecord.add("Steve");
        studentRecord.add(14);
        studentRecord.add("Computer Science");
        studentRecord.add(75);

        //show Student record
        System.out.println("show Student record");

        System.out.println(studentRecord);

        Iterator it = studentRecord.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // delete student record
        System.out.println("delete student record");
        //studentRecord.clear();
        System.out.println(studentRecord);

        HashMap<Integer, String> studentRecord1 = new HashMap<>();
        studentRecord1.put(1, "Kevin");
        studentRecord1.put(2, "14");
        studentRecord1.put(3, "Mathematics");
        studentRecord1.put(4, "78");

        for (HashMap.Entry<Integer, String> entry : studentRecord1.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        int nums;
        do {
            System.out.print("Enter a key : ");
            nums = sc.nextByte();
            String values;
            switch (nums) {
                case 1:
                    values = studentRecord1.get(1);
                    break;

                case 2:
                    values = studentRecord1.get(2);
                    break;

                case 3:
                    values = studentRecord1.get(3);
                    break;

                case 4:
                    values = studentRecord1.get(4);
                    break;
                default:
                    values = "Unknown";
            }
            System.out.println(values);
        }while(nums <= 4);
    }

}
