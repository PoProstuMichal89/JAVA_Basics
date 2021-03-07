package dziedziczenie.basic;

public class SuperCar extends Car{
  SuperCar(){
      type="SuperCar";
      topSpeed=300f;
  }
  public void setSportMode(){ //metoda dostęna tylko dla obiektu klasy SuperCar!! dla Car już nie!
      System.out.println("Set sport mode");
  }
}
