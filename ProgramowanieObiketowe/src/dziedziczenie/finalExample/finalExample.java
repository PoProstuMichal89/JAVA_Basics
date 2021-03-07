package dziedziczenie.finalExample;

class Employee{
    String name="uknonow";
    String surname="bleBle!";
    String jobTitle;
    float salary;
}

class Manager extends Employee{
    String resposibility;
}

class Director extends Manager{
    String department;
}

class VicePresident extends Director{

}

final class CEO extends VicePresident{
    String companyMan;
}

/*class Something extends CEO{ --NIE MOŻNA ROZSZERZYć KLASY FINALE!!

}*/

public class finalExample {
    public static void main(String[] args) {

        VicePresident michal = new VicePresident();
        System.out.println(michal.surname);

    }


}

