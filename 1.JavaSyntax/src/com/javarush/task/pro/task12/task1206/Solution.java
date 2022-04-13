package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int charcount = 0;
        char temp;

        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);

            if (Character.isDigit(temp)) {
                charcount++;
            }
        }
        return charcount;
    }

    public static int countLetters(String string) {
        int charcount = 0;
        char temp;

        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);

            if (Character.isLetter(temp)) {
                charcount++;
            }
        }
        return charcount;

    }

    public static int countSpaces(String string) {
        int charcount = 0;
        char temp;

        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);

            if (Character.isSpaceChar(temp)) {
                charcount++;
            }
        }
        return charcount;
    }
}
