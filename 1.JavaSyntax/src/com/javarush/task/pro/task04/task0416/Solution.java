package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int cola = scanner.nextInt();
       int human = scanner.nextInt();
        System.out.println(cola/(human * 1.0) );

    }
}