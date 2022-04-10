package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        SouthAmerica southAmerica = new SouthAmerica(17840000);
        NorthAmerica northAmerica = new NorthAmerica(24710000);
        Eurasia eurasia = new Eurasia(54760000);
        Australia australia =new Australia(7692000);
        Antarctica antarctica = new Antarctica(14200000);
        Africa africa = new Africa(30370000);
    }
}
