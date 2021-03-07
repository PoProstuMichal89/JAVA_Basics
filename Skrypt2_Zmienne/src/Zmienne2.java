public class Zmienne2 {

    public static void main(String[] args) {
        int number = 1;
        Integer number2 = 3; // klasa osłonowa. obprócz wartości int zaiwra w sobie metody do przetwarzania tego inta

        System.out.println(number2); // wywołanie z klasy 3

        Integer obj1 = Integer.valueOf(110);
        String obj2;
        obj2 = obj1.toString();
        System.out.println(obj2+ 11); //zamiania typu int na string i zaisanie go do drugiej zmiennej i wydrukowania

        //Typ Integer mozna łatwo przekonwertowac na inny typ
                //Integer - typ złożon, klasa osłonowa, przechowująca int ale także można na niej ronić inne rzeczy

    }
}
