public class Main {
    public static void main(String[] args){

        //Declaration of new array
    //Wskazanie typu danych - String, wskazanie że to zbiór danych tablica -[] i po prawej stworzenie nowej instancji (obiketu) tablicy z przypisaniem ilości elementów (to jest konieczne)
    String[] tab = new String[20]; //kniecznie w nowym obiekcie ile powinnno być elementów! Tablica nie jest modyfikowalna pod względem ilości danych Inne zbiory danych są modyfikowalne i rozszerzalne!

        //Create the object assigned to the array "tab"

        tab[0] = "Ania";
        tab[1] = "Michał";
        tab[2] = "Bartek";
        tab[3] = "Zosia";
        // Wartość w nawiasie kwadratowym - indeks (numer szufladki w tablicy). Zawsze zaczynamy od 0 (a nie od 1).

        //Wywołanie konkretnego elementu z tablicy - wywołanie po nazwie tablicy ("tab") a następnie po wiodącym indeksie ([0])
        System.out.println("Wywołanie konkretnego elementu z tablicy: ");
        System.out.println(tab[0]);
        //Sprawdzenie długości tablicy poprzez wywołanie na niej funkcji lenght
        System.out.println("Sprawdzenie długości tablicy: ");
        System.out.println(tab.length);
        //----------------------------------------------------------------------------

        System.out.println(" ");
        System.out.println("Pętla dla tablicy z typami złożonymi String: ");
        //Set a loop(type=for), display in console elements of array. Tablica z typami złożonymi

        for(int i = 0; i < tab.length;i++){
            System.out.println(tab[i]); // wyświetlaj kolejne indexy tab, tak długo jak inkremntator ijest mniejszy od długości tablicy (mniejszy niż 20)
        }
        //Domyślną wartością tablicy dla typów złożonych jest null!! String jest typem złożonym - więc jego pusta wartość jest null czyli brakiem referencji
        System.out.println("Domyślną wartością tablicy dla typów złożonych jest null!!");

        //-------------------------------------------------------------------
        //Tablica z typami prostymi
        int[] tab2 = new int[5];
        tab2[0] = 2;

        System.out.println(" ");
        System.out.println("Pętla dla tablicy z typami prostymi: ");

        for(int j=0; j<tab2.length;j++){
            System.out.println(tab2[j]);
            //Dla typów prostych domyślna wartość w tablicy to 0 a nie null
        }
        System.out.println("Dla typów prostych domyślna wartość w tablicy to 0 a nie null");
        //-------------------------------------------------------------------------------------------------------
        //Pętla For Each
        System.out.println(" ");
        System.out.println("Pętla For Each: ");

        //Tablica z wypełnionymi elementami od razu:
        String[] tab3 = {"Ania", "Bartek", "Adam", "Asia"};
        //Po tej tablicy będziemy iterować.
        //Stworzenie sygnatury pętli for each, gdzie - podajemy typ po któym będziemy iterować (String, bo tab3 ma typ złożony string);
        // Podajemu zmienną tymczasową "item" (może być dowolna nazwa). Dwukropek i obiekt kolekcji po którym będziemy iterować (czyli tablica tab3)

        for (String item:
             tab3) {
            System.out.println(item);
        }

    }
}
