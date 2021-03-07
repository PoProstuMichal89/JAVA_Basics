import java.util.Scanner;

//procent składanu 100*(1+0.05)^3 --> 0.05 - oprocentowanie roczne, 3 --> lata oszczędzania
public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        double startCapital=0;
        double yearlyInterest=0;
        int numYears=0;

        double finalCapital; //rezultat oszczędzania

        System.out.println("Wpisz kapitał początkowy: ");
        startCapital=Double.valueOf(in.nextLine()).doubleValue(); //wartość scannera to będzie STRING, a zmienna startCapital to DOUBLE!

        System.out.println("Wpisz roczne oprocentowanie: ");
        yearlyInterest=Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczędzania: ");
        numYears=in.nextInt();

        finalCapital= startCapital*Math.pow((1+(yearlyInterest)/100d),numYears);

        System.out.println("Efekt oszczędzania: "+finalCapital);


    }





}
