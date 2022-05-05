package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {


        if (ru.equalsIgnoreCase("понедельник")) {
            ru = "Monday";
        } else if (ru.equalsIgnoreCase("вторник")) {
            ru = "Tuesday";
        } else if (ru.equalsIgnoreCase("среда")) {
            ru = "Wednesday";
        } else if (ru.equalsIgnoreCase("четверг")) {
            ru = "Thursday";
        } else if (ru.equalsIgnoreCase("пятница")) {
            ru = "Friday";
        } else if (ru.equalsIgnoreCase("суббота")) {
            ru = "Saturday";
        } else if (ru.equalsIgnoreCase("воскресенье")) {
            ru = "Sunday";
        } else {
            ru = "Недействительный день недели";
        }
        return ru;

    }
}
