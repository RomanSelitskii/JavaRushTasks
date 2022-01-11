package com.javarush.task.pro.task02.task0218;

import java.util.Scanner;

/* 
Ручное управление
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberA = console.nextInt();
        int numberB = console.nextInt();
        int numberC = console.nextInt();
        int number = numberA * numberB * numberC;
        System.out.println(number);


    }
}
