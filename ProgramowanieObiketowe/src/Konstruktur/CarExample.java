package Konstruktur;

class Computer{
    public String model;
    public int year;

    Computer(String model, int year){
        this.model=model;
        this.year=year;
    }
}
    class Plane{
        String name;
        public void initPlane(String name){
            this.name=name; //to jest nazwa z konstruktora podana przez użytkownika będzie przypisana do arguemtnu w obiekcie
        }                   //this to jest paramert niejawny (implict parameter), przekazywany automatycznie do metody
                            // dzięki czemu możemy go w niej użyć.
        //name - parametr jawny (explictit parameter) zdefiniowany przez rpogramistę
    }

    class Radio{
    int yearProduction;
    int volume;
    String station; //aktuakna stacja

    Radio(){
        this.yearProduction=2000;
        volume=100; //to samo co this.volume=100;
    }
    Radio(int yearProduction){
        this(); //wywołanie konstruktora bezargumentowego
        this.yearProduction=yearProduction;
        this.changeStation("Rock");
    }

        public void changeStation(String newStation){
            this.station=newStation;
        }
        public Radio getRado(){
            return this;
        }
        public void printRadioInfo(Radio radio){
            System.out.println("Radio production year: "+radio.yearProduction);
    }

    }

class Car{
    String manufacter;
    String name;
    int year;
    float topSpeed;
    String color;


    public Car(String marka, int rok, String imię){
        this.manufacter=marka;
        this.year=rok;
        this.name=imię;
    }

    Car(){
        this.color="blue";
    }

    public void printInfo(){
        System.out.println(this.manufacter+" "+this.name+" "+this.year);
    }
}

public class CarExample {

    public static void main(String[] args) {

        Car car1 = new Car("Opel",2020,"Opel");
        car1.manufacter="Opel";
        car1.color="Blue";
        car1.name="Corsa";
        car1.topSpeed=200.00f;
        car1.year=2006;
//        car1.printInfo();

        Car maluch= new Car("Fiat",2020,"Lukas");
        maluch.printInfo();
        Car polonez = new Car("Polonez",1987,"POLDEK");
        polonez.printInfo();

        Car anuś = new Car();
        System.out.println(anuś.color);
        Car miso = new Car("Poldek2",2020,"Inne");
        System.out.println(miso.color);
        miso.printInfo();

        Plane plane =new Plane();
        plane.initPlane("Cessna");
        System.out.println(plane.name);

        Radio radio = new Radio(1998);
        System.out.println(radio.yearProduction);
        System.out.println(radio.volume);

        Radio oldRadio=new Radio(1996);
        Radio newRadio=new Radio();
        newRadio.printRadioInfo(oldRadio);
    }

}

