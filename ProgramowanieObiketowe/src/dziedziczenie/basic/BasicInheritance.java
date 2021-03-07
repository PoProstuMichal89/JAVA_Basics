package dziedziczenie.basic;

public class BasicInheritance {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle bazowy");
        vehicle.printInfo(); //info o klasie bazowej Vehicle

        //nowy obiekt klasy Bike zbudowanej na bazie klasy Vehicle, z pustym konstruktorem
        System.out.println("Obiekt Bike na bazie Vehicle z pustym konstruktorem:");
        Bicycle rower = new Bicycle();
        rower.printInfo();

        //nowy obiekt klasy Car zbudowanej na klasie Vehicle z zamienionymi wartościami pól w konstruktorze
        System.out.println("Obiekt Car na bazie klasy Vehicle z nadpisanymi polami w konstruktorze:");
        Car samochód = new Car();
        samochód.printInfo();

        //nowy obiekt klasy Car zbudowanej na klasie nadrzędenej Vehicle z przeciążonym konstruktorem (do uzupełnienia)
        System.out.println("Z przeciążeniem type i topSpeed. Manufacturer zostaje ten sam co w pustym konstruktorze");
        Car samochód2 = new Car(230,"Dodge");
        samochód2.printInfo();

        //nowy obiekt Bike
        System.out.println("Nowy obiekt bike: ");
        Bike bike = new Bike();
        bike.printInfo();

        //nowy obiekt SuperCar
        System.out.println("Nowy obiket super car: ");
        SuperCar superCar1= new SuperCar();
        superCar1.printInfo();
        superCar1.setSportMode();

    }


}
