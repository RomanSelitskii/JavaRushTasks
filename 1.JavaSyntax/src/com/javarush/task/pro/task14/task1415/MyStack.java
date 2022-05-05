package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        var a = storage.get(0);
        storage.remove(a);
        return a;
    }

    public String peek() {
        var a = storage.get(0);
        return a;
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        if (!storage.contains(s)) {
            return -1;
        } else {
           return storage.indexOf(s);
        }
    }
}