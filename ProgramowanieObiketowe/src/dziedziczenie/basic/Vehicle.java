package dziedziczenie.basic;

//to jest nasza klasa bazowa. Na jej podstawie będziemy budować klasy innych pojazdów.
// Kolejne klasy pojazdów będą rozszerzeniem klasy bazowej Vehicle

public class Vehicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    public void printInfo(){
        System.out.println("type: "+type+
                " manufacturer: "+manufacturer+
                " top speed: "+topSpeed+"\n");
    }

    //pusty konstruktor, który wywołuje
    Vehicle(){
        type="unknow";
        manufacturer="uknonown";
        topSpeed= 0;
    }
}
