public class Main {
    public static void main(String[] args) {

        System.out.println("ĆWICZENIE 1");

        // Ćwiczenie 1 - Firma odzieżowa

        //Pracujesz dla firmy odzieżowej, której celem jest wypromowanie nowej kolekcji ubrań.
        // Firma ogłosiła konkurs, który ma na celu zdobywanie "lajków" i "udostępnień" na Facebooku.
        // Jeśli strona firmy otrzyma danego dnia co najmniej 500 "lajków" i co najmniej 100 "udostępnień",
        // to ceny spadną o 10%. Na razie masz napisać fragment programu,
        // który rozstrzygnie czy warunki promocji są spełnione czy nie.

        //Data
        int likeNumber = 500;
        int shareNumber = 100;
        boolean discount;

        //Conditional statement if -checked if promotion rules are completed
        if (likeNumber >= 500 && shareNumber >= 100) {
            discount = true;
        } else {
            discount=false;
        }

        // Checked if discount should be charged
        if(discount){ //nie musisz pisać if(discount==true). Wystarczy samo if(discount) bo boolean ma domyślną wartość true.
            System.out.println("Promo ok");
        }
        else{
            System.out.println("Promo canceled");
        }
//---------------------------------------------------------------------------------
        System.out.println(" ");
        System.out.println("ĆWICZENIE 2");

        //Ćwiczenie2
        //Pracujesz dla restauracji, która chce nagrodzić klientów zamawiających w dni robocze (poza weekendem)
        // pizze lub duży napój. Klienci spełniający warunki promocji dostaną kupon na darmowego burgera.
        // Na razie piszesz polecenie decydujące o spełnieniu warunków promocji. Do dyspozycji masz zmienne.

        boolean isWeekend = false;
        boolean bigSoda = true;
        boolean pizza = false;

        if(isWeekend==false && (pizza == true || bigSoda == true)){
            System.out.println("Here your's cuppon!");
        }
        else if (pizza==false && bigSoda==false){
            System.out.println("Sorry, the discount can't be charged! Order Soda or Pizza");
        }
        else{
            System.out.println("Sorry, the discount can't be charged! Is weekend! Come back in monday!");
        }
        //-------------------------------------------------------------------------------------------------
        //Ćwiczenie3
        System.out.println(" ");
        System.out.println("ĆWICZENIE 3");

        //Tym razem pracujesz w LOT i masz za zadanie rozpocząć programowanie rozkładu miejsc w samolocie. (Patrz https://www.lot.com/pl/pl/boeing-737-800-rozklad-miejsc lub ilustracja na końcu tego laboratorium)
        //Należy wyświetlić napisy:
        //Row number 1
        //Row number 2
        //...
        //Row number 30
        //Row number 31
        //W tym celu:
        //zadeklaruj zmienną firstRow i przypisz jej wartość 1
        //zadeklaruj zmienną lastRow i przypisz jej wartość  31
        //zadeklaruj zmienną currentRow i przypisz jej wartość  firstRow
        //Dopóki currentRow jest mniejsze równe lastRow:
        //wyświetlaj napis "Row number...."
        //po wyświetleniu napisu zwiększaj currentRow o 1

        int firstRow=1;
        int lastRow= 31;
        int currentRow= firstRow;

        while(currentRow<=lastRow){
            System.out.println("Your place is: "+ currentRow);
            currentRow+=1;
        }

        //----------------------------------------------------------------------------------------------------------
        //Ćwiczenie 4 SILNIA
      /*  W tym zadaniu obliczysz silnię. Silnia  to działanie matematyczne, które dla liczby n wyznacza wartość mnożąc przez siebie wszystkie liczby naturalne mniejsze lub równe n. Symbol oznaczający silnię to wykrzyknik, np.:

        2! = 1*2 =2
        3! = 1*2*3 = 6
        4! = 1*2*3*4 = 24
        https://pl.wikipedia.org/wiki/Silnia
        Zmienna i ma wartość 10. Korzystając z pętli for wyznacz wartość silnia i*/

           System.out.println(silnia(5));

        }

        public static int silnia(int n){
        int iloczyn=1;
        for (int i=1;i<=n;i++){
            iloczyn*=i;
        }

        return iloczyn;
        }
    }


