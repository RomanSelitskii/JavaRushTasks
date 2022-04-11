package com.javarush.task.pro.task01.task0103;

public class Money {
    int money;
    int tee;
    int water;
    int cofe;

    public void q(){
       if ((money < tee) && (money < water) && (money < cofe)){
           System.out.println("Недостаточно средтств");
       } else {
           System.out.println("Выбирите позицию");
       }
    }
}

