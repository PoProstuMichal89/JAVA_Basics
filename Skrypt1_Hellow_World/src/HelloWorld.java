import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        System.out.println("Hello world! ");
        Scanner scanner = new Scanner(System.in); //Utworzenie nowego obiektu skaner o nazwie skaner
        String name; //zdeklarowanie zmiennej
        System.out.print("Podaj swoje imię: ");
        name= scanner.next(); //przypisanie zmiennej do imienia
        System.out.print("Hello " + name +"!"); //wydrukowanie wyniku, łączenie -> konktenacja
    }
}
