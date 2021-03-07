package com.company;

public class Zwierze { //klasy piszemy z dużej litetry
    //zamienne & atrybuty -> to samo.
    String imie;
    String glos = "Grrr";
    public void dajGlos(int x){
            for(int i=0; i<x; i++){
                System.out.println(glos);
                System.out.println(" ");
            }
            System.out.println();
    }
    public void przedstawSie(){
        System.out.println("Nazywam się "+ imie);
    }

}
