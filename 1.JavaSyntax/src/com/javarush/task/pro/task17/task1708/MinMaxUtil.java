package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxUtil {

    public static int min(int a, int b) {

        List<Integer> min = new ArrayList<>();
        min.add(a);
        min.add(b);
        return Collections.min(min);

    }

    public static int min(int a, int b, int c) {
       List<Integer> min = new ArrayList<>();
       min.add(a);
       min.add(b);
       min.add(c);
        return Collections.min(min);
    }

    public static int min(int a, int b, int c, int d) {
        List<Integer> min = new ArrayList<>();
        min.add(a);
        min.add(b);
        min.add(c);
        min.add(d);
        return Collections.min(min);
    }
    public static int min(int a, int b, int c, int d, int e ) {
        List<Integer> min = new ArrayList<>();
        min.add(a);
        min.add(b);
        min.add(c);
        min.add(d);
        min.add(e);
        return Collections.min(min);
    }
    public static int max (int a, int b) {

        List<Integer> max = new ArrayList<>();
        max.add(a);
        max.add(b);
        return Collections.max(max);

    }

    public static int max (int a, int b, int c) {
        List<Integer> max = new ArrayList<>();
        max.add(a);
        max.add(b);
        max.add(c);
        return Collections.max(max);
    }

    public static int max (int a, int b, int c, int d) {
        List<Integer> max = new ArrayList<>();
        max.add(a);
        max.add(b);
        max.add(c);
        max.add(d);
        return Collections.max(max);
    }
    public static int max(int a, int b, int c, int d, int e ) {
        List<Integer> max = new ArrayList<>();
        max.add(a);
        max.add(b);
        max.add(c);
        max.add(d);
        max.add(e);
        return Collections.max(max);
    }
}
