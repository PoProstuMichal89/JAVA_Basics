package com.company;

public class Main {

    public static void main(String[] args){
        Zwierze kot = new Zwierze(); //konstruktur domyślny
        kot.glos ="Meeeow";
        kot.imie = "Milka";

        kot.przedstawSie();
        kot.dajGlos(3);

        Zwierze pies = new Zwierze();

    }

}
