package com.codewithme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListRemoveDuplicate{
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 5, 6, 7, 8, 8, 9, 1, 2, 5, 7));

        //1. LinkedHashSet
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        ArrayList<Integer> numberListwithoutduplicates = new ArrayList<>(linkedHashSet);
        System.out.println(numberListwithoutduplicates);

        System.out.println("--------");
        // 2. JDK - stream:
        ArrayList<Integer> makeList = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 5, 6, 7, 8, 8, 9, 1, 2, 5, 7));
        List<Integer> makeListUnique = makeList.stream().distinct().collect(Collectors.toList());
        System.out.println(makeListUnique);
    }
}
