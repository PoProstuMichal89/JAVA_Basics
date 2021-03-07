import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Definitions of variables
        int i = 0;
        int los;
        int odp;

        //Set a value in a "los" variable (random number)
        Random rnd = new Random(); //nowa klasa Random i obiekt rnd
        los = rnd.nextInt(10) + 1; //przypisanie do zmiennej los wartości losowej liczby

        //Created a new scanner object based on the Scanner class
        Scanner scanner = new Scanner(System.in);

    // The first communication to the user - an invitation to the game
        System.out.println("Zgadnij liczbę od 1 do 10!");

        // Set a do-while loop. Use the set variables
        do {
            i++;
            System.out.println("Podaj liczbę: ");
            odp = scanner.nextInt();
            if (odp > los) {
                System.out.println("Niestety nie zgadłeś, moja liczba jest mniejsza");
            } else if (odp < los) {
                System.out.println("Niestety nie zgadłeś, moja liczba jest większa");
            }
        }while (odp != los);
        System.out.println("Gratulacje, zgadłeś za "+ i + " "+" razem");
    }
}