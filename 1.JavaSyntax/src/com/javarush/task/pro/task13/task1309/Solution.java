package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {

        grades.put("Селицкий", 5.0);
        grades.put("Баженков", 4.5);
        grades.put("Нагайник", 4.7);
        grades.put("Артюхов", 4.8);
        grades.put("Колпащиков", 4.9);

    }
}



