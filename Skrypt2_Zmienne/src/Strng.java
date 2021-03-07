public class Strng {

    public static void main(String[] args) {
        String s1 = "Przykładowy tekst ";
        String s2 = new String("kolejny tekst"); //bo to jest klasa, typ złożony. I można wywołać w konstruktorze
        System.out.println(s2);
        System.out.println(s2.repeat(3)); //powtarzanie

        //tablica znaków
        char arr[] ={'P','A','N'};
        String strX= new String(arr);
        System.out.println(strX); //złączenie znaków w string za pomocą Stringa

        //konkatenacja
        String car = "Mustang";
        int year = 1979;
        // z operatorem +
        String txt = car + year;
        System.out.println(txt);

        //albo konkatencacja
        String txt2 = car.concat(Integer.toString(year)); //ale na typie integer aby połąćzyć trzeba ręcznie przekonwertować
        solution2("AGIFI MA KOTA");

    }
//StringBuilder
    public static String solution2(String str){ //Rozwiązanie z użyciem klasy StringBuilder i metody reverse

        //StringBuilder --> odwracanie słów
        StringBuilder word = new StringBuilder(str);
        word.reverse();
        String newWord= new String(word);
        System.out.println(newWord);
        StringBuilder newWord2=word.append(" i psa"); //dodanie nowego wyrazu
        System.out.println(newWord2);
        word.append("AAAA");
        System.out.println(word.toString());
        word.insert(5,",");
        System.out.println(word.toString());
        return newWord;

        //StringBulider --> dodawanie do zmiennych



    }
}
