package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit;
        int sum = 0;
        while(true){
            String s = scanner.nextLine();
            isExit = s.equals("ENTER");
            if (isExit){
                break;
            }
            sum = sum + Integer.parseInt(s);
        }
        System.out.println(sum);


    }
}