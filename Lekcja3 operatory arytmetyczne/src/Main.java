public class Main {
    public static void main(String[] args){
        int a =20;
        int b= 10;
        int wynik1 = a+b;
        int wynik2 = a-b;
        int wynik3 = a*b;
        double wynik4 = a/b;

        int dzielna=14;
        int dzielnik=8;
        double wynik5= (double)dzielna/dzielnik; //rzutowanie niejawne - ponieważ zmienne są jako int, trzeba zrobić rzutowanie na double aby wyszła zienno przecinkowa

        //Modulo - reszta z dzielenia

        double liczba1=12;
        double liczba2=5;
        double modulo = liczba1%liczba2;

        // skrócony operator
        int c =1;
        int d =2;
        c+=d;

        //potega
        double potega = Math.pow(2, 3);

        //pierwiastek
        double pierwiastek = Math.sqrt(9);

        //inkrementacja --> zwiększanie watości o 1
        int f =1;
        f++; //po inkremntacji f=2
        //dekremntacje - zmniejszanie o 1
        int e =10;
        e--; //zmniejsza się o 1



        System.out.println(wynik1);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(wynik4);
        System.out.println(wynik5);
        System.out.println("modulo: " + " " + modulo);
        System.out.println(c);
        System.out.println("potega: " + " " + potega);
        System.out.println("pierwiastek: " + " " + pierwiastek);

//Operatory przypisania mają wiązania prawostronne - są obliczan od prawej do lewej
        int g = 10;
        int h, i;
        h= i = g+5;
        System.out.println(" h:"+h+" i:"+i);

//inkrementcja przyrostkowa i przedrostkowa

        System.out.println(" ");
        //Przyrostkowa, po argumencie zmiennej
        int num =3;
        int value =4+num++; //najpiew dodawanie, potem zwiększenie num o jeden
        System.out.println("value: "+value);
        System.out.println("num: "+num);
        //Ikrementacja przedrostkowa - przed argumentem - najpierw zwiększenie/zmniejszenia a potem działanie
        int num2=3;
        int value2=4+ ++num2;
        System.out.println("value2: "+value2);
        System.out.println("num2: "+num2);


    }
}
