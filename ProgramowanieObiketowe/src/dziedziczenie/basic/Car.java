package dziedziczenie.basic;

public class Car extends Vehicle {

    //nowy konstruktor z przypisaniami nadpisze nam przypisania z klasy nadrżedniej Vehicle
    Car() {
        this.manufacturer = "Ford";
        this.topSpeed = 130.00f;
        this.type = "Hatchback";
    }
  /*   nowy konstruktor z przeciążeniem - manufacturer będzie z pustego konstruktora (bo słówko kluczowe this, natomiast
     pozostałe dwa będą wywołane w konstruktorze do uzupełnienia */

    Car(float topSpeed, String type){
        this();
        this.topSpeed=topSpeed;
        this.type=type;
    }

}