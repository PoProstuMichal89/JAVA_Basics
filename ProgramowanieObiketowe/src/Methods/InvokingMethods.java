package Methods;

 class Triangle{
    float base; //długość podstawy
    float height; //wysokość
    float surfaceArea=11; //pole powierzchni

    Triangle(float base, float height){
        this.base=base;
        this.height=height;
    }

        public float surface(float base, float height){

            surfaceArea=0.5f*base*height;
            System.out.println("Pole w metodzie: "+surfaceArea);
            return surfaceArea;
        }

        public void printT(){
            System.out.println("pole w obiekcie: "+this.surfaceArea); //metoda pomocnicza do wyświetlania na konsoli
        }
}

class Calculator{

    public void add(int a, int b){ //typ prosty,w metodzie przekazanie wartości poprzez wartość call by value
                                    //Int-a "a" ani "b" w tej metodzie nie można zmienić u źródła, czyli np. w  metodzie main
        a=100; //a przyjmnie wartość 100 tylko w obrębie tej funkcji
        int result = a+b;
        System.out.println("result : "+result);

    }
}

public class InvokingMethods {

    public static void main(String[] args) {

        //dodawanie
        int a = 10; //to a nie ulegnie zmianie po przekazaniu do
        int b = 20;
        Calculator calc = new Calculator();
        calc.add(a, b); //w tym miejscu przekazane a=10 zostaje zmienione na a=10 i dodoane do b=20, którego nie zmieniliśmy
        //
        System.out.println("a wewnątrz metody main: " + a);

        //trójkąt
        Triangle trójkąt = new Triangle(10.5f, 12);
        trójkąt.printT();
        trójkąt.surface(10.5f, 12.0f);
        trójkąt.printT();

    }
}

    //Typy poroste są przekaznywane jako kopie, jako wartość (call by value). I nie można nimi manipulować poza
    //metodą, dla któej są wywołane - tutaj add.

/*    Stworzyłem kalsę Calculator i metodę add dla tej klasy. Metoda add przyjmuje dwa parametry typu int.
    Następnie zadeklarowałem, zeby przekazany aprametr a zawsze miał wartość 100. A potem obliczenie matemaryczne a+b
    Następnie wywyołałem metodę add w funkcji main i jako parametry przekazałem argumenty a i b. W main te argumenty mają wartość
    a=10 i b=20. Po przekazaniu do metody add a ma nową wartość 100 a b dalej 20. Po dodaniu wynik jest 120
    ALE! poza medotdą add a nadal ma wartość 10, bo nie została zmieniona, w metodzie add jest kopia a.
    Tak naprawdę a i b w main mogą mieć zupelnie inne nazwy, np. num1 i num2

    Metoda nie ma dostępu do zmeinnych a i b w main*/

//parametry - zmienne podstawione do metod podczas deklaracji tej metody w klasie.
// argumenty - przekazane zmienne (wartości) podczas działąnia programu


//Dla trójkąta

  /*  Stworzyłem klasę Triangle, zdefiniowałem dla tej klasy wysokość, długość podstawy i pole. Dodałem metodę
            obliczającą pole trojkąta. Na start przypisałem do zmiennej surfaceArea wartosć 11 (dla testu).
    Następnie w klasie main stworzyłem nowy obiekt Triangle "trójkąt" i na bazie tego obiektu wywołałem metodę obliczającą
    pole. Po przekazaniu do metody argumentów, została obliczona  powierzchnia i UWAGA wynik ptzypisaney d zmoennej
    został przypisany do obiektu i go zmeinił (odtąd w obiekcie pole/powierzcnia wynosi to co zostało oblicozne a nie 11).
    I to jest odwołanie poprzez referencję!!!

    Przekazanie przez referencje sprawia, że metoda ma dostęp do obiektu i może zmieniać jego wartości!!
    Typy złożone przekazywane są przez referencje!
}*/
