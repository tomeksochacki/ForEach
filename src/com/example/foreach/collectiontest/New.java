package com.example.foreach.collectiontest;

import java.util.LinkedList;
import java.util.List;

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



    }
}
