package Modyfikatory_Dostępu.Example1.no_modifier.package2;


import Modyfikatory_Dostępu.Example1.no_modifier.package1.Product;

public class Computer extends Product {

    public  Computer() {
//        name="Computer";      //spowoduje błąd, brak dostępu do zmiennej z innego pakietu, gdy nie ma modyfikatora.
//
//
//    }                     //ponieważ w Product nie ma modyfikatora dla name, to nie możemy zmodyfikoać tej wartości!!
//                           //inaczej niż jest to w package protected - tam w Product String name maił modyfikator protected i dzięki temu
//                              //mogliśmy w klasie roszerzającej Computer z pakage 2 dostęp do "name"

    }
}
