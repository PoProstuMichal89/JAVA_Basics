public class Main {
    public static void main(String[] atrgs){
        //Case1 typ referencyjny
        int a = 15;
        int b = a;
        b=10;
        //typ referencyjny. po przypisaniu b=a, zmieniając a(sic!) zmieniasz także b
        System.out.println(b);
        System.out.println(" ");

        //case2 przypisanie do większego typu danych mniejszego typu
        short c =25;
        int d = c;
        System.out.print(d);
        //nie mam problemu z przekazaniem. Zachodzi rzutowanie niejawne (kompilator sam dodaje rzutowanie na int-a.
        System.out.println(" ");

        //case3 przypisanie do mniejszego typu danych większego
        int e = 25;
        // short f = e; --> to się nawet nie skompiluje! bo nie odpowiada wielkość!! Potrzebne rzutowanie jawne
        short f = (short)e; //-->rzutowanie jawne

        //case3 zmiennoprzecinkowa do pełnej
        float g = 5.8f; //f na końcu dla typu float
        int h = (int)g; //musi się odbyc rzutowanie jawne!
        System.out.println(h); // obetnie nam 8 z 5.8 --> będzie tylko 5!!

        //case 4 konwertowanie typu prostego int na typ złożony string
        int i = 115;
        String liczba = Integer.toString(i);
        System.out.println(liczba);

        //case5 typ zlożony na typ proty (String na int)
        int j = Integer.parseInt(liczba);
        System.out.println(j+2); //liczba dodana do liczby --> ok
        
    }
}
