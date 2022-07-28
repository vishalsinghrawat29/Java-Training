package com.example.javafxapp2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp {

    public static void main(String[] args) {

        // WAP to create an array for Range of values from 0,1,2,3....100
        int[] numArray = new int[101];

        for (int i = 0; i <= 100; i++) {
            numArray[i] = i;
        }

        // Using Java8 Feature: IntStream
        int[] numbersArray = IntStream.rangeClosed(0, 100).toArray();


        // WAP to create a ArrayList<Integer> that contains 0,1,2,3......100 Integer numbers.
        List<Integer> numList = new ArrayList();

        for (int i = 0; i <= 100; i++) {
            numList.add(new Integer(i));
        }

        // Using Java 8 Feature: IntStream
        List<Integer> numbersList =  IntStream.rangeClosed(0, 100)      // 0,1,2,3,4,.....100
                .mapToObj(i -> new Integer(i))  // Integer Objects: 0,1,2,3,4....100
                .collect(Collectors.toList());  // Add all integer objects to ArrayList<Integer>

        // Write code further...
    }
}

