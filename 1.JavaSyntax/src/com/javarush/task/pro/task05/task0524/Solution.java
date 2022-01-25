package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

public class Solution {
    public static int[] coordinates ;

    public static void main(String[] args) {
        coordinates = new int[200];

        for (int i = 0; i < coordinates.length; i++) {
            if (i % 2 == 0){// i = 0,2,4,6
                coordinates[i] = (i/2) * 10;
            } else {
                coordinates[i] = (i/2) * 10 + 1;
            }
            System.out.print(coordinates[i] + ", ");
        }
    }
}