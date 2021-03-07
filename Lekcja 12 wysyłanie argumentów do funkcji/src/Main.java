public class Main {
    public static void main(String[] args) {
        //Case1
        System.out.println("Case1");
        int y = 5;
        zmien(y);
        System.out.println("'Y' poza metodą to ciągle tylko: " + y);
        //Chcesz aby funkcja zmien() przypisała na stałe 5 do jakiejś zmiennej? Zrób metodę zwracającą i przypisz return do zmiennej y.
        System.out.println(" ");

        //Case2
        System.out.println("Case2");
        int z = 5;
        z= zmien2(z);
        System.out.println("Poza metodą: "+z);
        System.out.println(" ");

        //Case3
        System.out.println("Case3");
        int[] h = {5};
        zmien3(h);
        System.out.println("Poza metodą: "+h[0]);


    }

    //Case1
    public static void zmien(int x) {
        x += 5;
        System.out.println("'Y'=5 przekazane do wewnątrz metody równa się: " + x + " bo tylko w ciele metody zachodzi równianie x+=5;");
    }

    //Case2 zapisywanie do zmiennej argumentu
    public static int zmien2(int x) {
        x += 5;
        System.out.println("Wewnątrz metody: " + x);
        return x;
    }

    //Case3 typ złożony - tablica - inne zachowanie
    public static void zmien3(int[] x){
        x[0]+=5;
        System.out.println("Wewnątrz metody: " + x[0]);
    }
    //Tablica kopiuje referencje do 

}
