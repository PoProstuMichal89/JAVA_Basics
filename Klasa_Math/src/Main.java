public class Main {

    public static void main(String[] args) {

        //kalsa Math nie doczekała się własnych operatorów jak np. + - / *
        //dlatego dla potęgowania i pierwiatkowania oraz zaokrąglania - klasa Math
        // Aby poczytać o klasie Math to ctr+najechanie na nazwę Math i się wyświetlą info

        double d= 16.0;
        double sqrt = Math.sqrt(d); //pierwiastek (od square root). Tylko kwadratowy
        System.out.println(sqrt);

        int e=2;
        double power = Math.pow(e,2); //potęga
        System.out.println(power);

        //porównianie dwóch wartości, co jest większe - 6 czy 11?
        int a = 6;
        int b = 12;
        System.out.println("Max (porównanie) :"+Math.max(a,b));
        //porównanie - co jest mniejsze? - zwraca wartość mniejszą
        System.out.println("Min (porównanie) :"+Math.min(a,b));

        //Wartość absolutna abs --> zwraca zawsze wartość dodatnią
        int f = -9;
        float g = -8.99f;
        System.out.println("Absolut int = "+Math.abs(f));
        System.out.println("Absolut int= "+Math.abs(g));

        //PI
        System.out.println("Liczba PI "+Math.PI);




    }

}
