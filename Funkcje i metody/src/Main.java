public class Main {
    public static void main(String[] args) {      //metoda główna od której progrma zaczyna. Każda funkca (metoda) jest podzbiorem klasy

        //TYP ZWRACANY - VOID
        System.out.println("1. Typ zwracany VOID");
        wyswietl(); //wywołanie metody z lini 11
        System.out.println(" ");

        //Metoda zwracająca Typ danych String
        System.out.println("2. Metoda zwracająca typ danych String");
        String komunikat = wyswietl2(); //przypisanie do zmiennej rezultatu zwracanego przez metodę wyswietl2;
        System.out.println(komunikat);
        System.out.println(" ");

        //Przeciążanie funkcji
        //1 argument (przypisanie do zmiennych a.b,c tylko po to, ay sie liepiej na konsoli wyświetlało)
        int a;
        a= dodaj(5);
        System.out.println("5 zwięksozne o 1 to: "+a);
        //2 argumenty dodane do siebie
        int b;
        b=dodaj(4, 6);
        System.out.println("Dodawanie 2+4= "+b);
        //Bez argumentów ze zwróceniem 0
        int c;
        c=dodaj();
        System.out.println(c);
        //2 argumenty dodane do siebie ale zapisane w innych zmiennych
        int d;
        int wypłata =3000;
        int premia = 2500;
        d=dodaj(wypłata,premia);
        System.out.println("Wynagrodzenie za styczeń, składowe: "+ wypłata+ " + "+premia+ " = "+ d);

    }

    //TYP ZWRACANY - VOID
    //Void czyli pustka.
    //Taka metoda nic nie zwraca po wykonaniu swojej zawartoći (ciała metody).

    static void wyswietl() {  //metoda z małej - wedle konwencji. Przed nazwą metdy typ zwracany (tutaj; void). Void znaczy - pustka
        System.out.println("Hello wrold!");
    } //Ta metoda tylko drukuje coś na ekranie, nic nie zwraca
//--------------------------------------------------------------------------------------------------------

    //Metoda zwracająca Typ danych String

    static String wyswietl2() {
        return "Hello world, second time";
    }
    //Po wykonaniu funkcji ta meroda zostaje na chwilę zapisana w amieci, a potem skasowana.
    //Żeby ją zachoac, trzeba ją przypisać do zmiennej (tak jak wyżej w zmiennej komunikat)

//---------------------------------------------------------------------------------------------------------
    //Przeciążanie funkcji

    //Przeciążenie 1 argumentem
    static int dodaj(int x) {
        return ++x;         //pre-inkrementacja --> czyli zwiększenie wartości przed wywołąniem funckji
    }
    //W nawiasach określamy jaki typ danych ma by przyjęty - i ten typ będzie wymagany w nawiasach (argumenty o takim typie trzeba będzie przyjąć)
    // Nazwa argumentu - x - nie musi być taka sama jak ta przekazana w konkretnym wywołaniu funckji. Zamiast x może bć np. y albo dupa, ale musi przechowywać int

    // Przeciążenie 2 argumentami

    static int dodaj(int x, int y) {
        return x + y;
    } //zamiast x i y można przekazać liczby albo zmienne o innej nazwie przechowujące liczby

    //Przeciążenie bez argumentów

    static int dodaj() {
        return 0;
    } // nie ma argumentów, ale musi coś zwracać

    //Każdy z powżyszych typów zadziałał. Ale nie można przeciążyć funckcji(metody) poprzez typ danych
    //static String dodaj(){  --> przeciążenie nie zajdzie, bo mamy taką funkcj e tylko że int i koniec, nie mozna tak (chyba że sie poda arguemnt w nawiasach.
        //return "AA";
   // }

}
