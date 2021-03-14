package Modyfikatory_Dostępu.Example1.Protected;

import Modyfikatory_Dostępu.Example1.Protected.package2.Computer;

public class ProtectedExalple {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //computer.name ="sdsf";// błąd brak dostępu z pozimu innego pakietu. można zrobić getter i settera aby do tego się dotać:

        System.out.println(computer.getName());
        computer.setName("Dell");
        System.out.println(computer.getName());

        //dotęp do protected - albo jeżeli klasy są w tym samym pakiecie! albo jeśli klasa roszerza klasę z protected (jak Computer)
    }
}
