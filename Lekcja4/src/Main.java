
//OPERATORY PORONANIA LOGICZNE

public class Main {
    public static void main(String[] args){
        //boolean logiczna = true;
        int a = 5, b=6;  //zmienne można tak podawać jeśli są tego samego typu - raz int i w tej samej linii po przecink zmienne
        boolean logiczna = a<b;
        boolean logiczna2 =a==b && 5>1; //operator logicnzy & - złączenie
        boolean logiczna3 = a==b || a>b; //operator logiczny  lub
        boolean logiczna4 = !(a>5);

        System.out.println("Operator porównania: " + logiczna);
        System.out.println("Operator logiczny 'i': " + logiczna2);
        System.out.println("Operator logiczny 'lub': " + logiczna3);
        System.out.println("Operator negacji: " + logiczna4);
    }
}
