package dziedziczenie.shop;

public class Shop {
    public static void main(String[] args) {
        Product produkt = new Product();
        Keyboard klawiatura = new Keyboard();
        Mouse mysz = new Mouse();
        VerticalMouse mysz2=new VerticalMouse();
        Monitor monitor = new Monitor();
        monitor.printInfo();

        Computer computer = new Computer();
        System.out.println(computer.mysz.numButtons);
        System.out.println(computer.name);
        System.out.println(klawiatura.price);
    }
}
