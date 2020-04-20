package com.example.foreach.collectiontest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class New {
    public static void main(String[] args) {

        int[] numbersEven = new int[]{2,4,6,8,10,12,14,16,};

        List<Integer> numbersEvenList = new LinkedList<>();
        numbersEvenList.add(2);
        numbersEvenList.add(4);
        numbersEvenList.add(6);
        numbersEvenList.add(8);
        numbersEvenList.add(10);

        for (int numberEvenN:numbersEven) {
            System.out.println("Numbers even in array are: " + numberEvenN);
        }
        for (Integer numbersEvenListN: numbersEvenList) {
            System.out.println("Numbers even in list are: " + numbersEvenListN);
        }

        Set<Integer> numberSet = new HashSet<>();
        System.out.println("What is size set numberSet? Size is = " + numberSet.size());
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(5);
        numberSet.add(5);
        System.out.println("What is size set numberSet? Size is = " + numberSet.size());
        System.out.println("Is set numberSet empty? " + numberSet.isEmpty());
        System.out.println("Set numberSet contains variable number 2? " + numberSet.contains(2));
        System.out.println("Set numberSet contains variable number 8? " + numberSet.contains(8));


        for (Integer numberSetS: numberSet) {
            System.out.println("Variables number in set are: " + numberSetS);
        }
        System.out.println();
        numberSet.add(4);
        for (Integer numberSetS: numberSet) {
            System.out.println("Variables number in set are: " + numberSetS);
        }
        Set<Integer> numbersSet2 = new HashSet<>();
        numbersSet2.add(1);
        numbersSet2.add(2);
        numbersSet2.add(3);
        numbersSet2.add(4);
        numbersSet2.add(5);

        numbersSet2.removeAll(numberSet);
        System.out.println("size is: " + numbersSet2.size());
        for (Integer numberSetS: numbersSet2) {
            System.out.println("Variables number in set are: " + numbersSet2);
        }

    }
}
