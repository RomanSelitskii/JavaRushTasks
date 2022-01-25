package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine() + text;
        int a = 1;
        while ( a <= 10){
            System.out.println(text1);
            a++;
        }

    }
}
