package dziedziczenie.shop;

public class Computer extends Product {

    public Monitor monitor;
    public Mouse mysz;
    public Keyboard klawiatura;

    Computer(){
        monitor = new Monitor();
        klawiatura = new Keyboard();
        mysz = new Mouse();


    }


    }


