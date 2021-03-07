public class Main {
    public static void main(String[] args){

        char letter; //znak i zawsze w łapkach a nie cudzysłowach
        letter= 's';

        String zmString; //jedyny typ będący klasą!
        zmString = "michał";

        //Boolean -prawda fałsz
        boolean zmBoolen = true;

        //byte
        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE; //Max i i Min to klasy osłonowe
        System.out.println("Byte: " + zmByte +" " + zmByte2);

        //short
        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("Short: " + zmShort + " - " + zmShort2);

        //int --> Njaczęściej używany!! nawet do małych liczb
        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Int: "+ " "+ zmInt+ " " + zmInt2);

        //long
        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("Long: " + " " + zmLong + " " + zmLong2);

        //float zmiennoprzecinkowa
        float zmFloat0 = 22.33f;//musi być dodane na koniec f!!
        float zmFloat1 = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println("Float: " +zmFloat1 + " "  + zmFloat2);

        //double -> dokłądniejsza do różnych operacji!! Też zmienno przecinkowo ale nie trzeba dodawać na koniec "d" lub "D"

        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("Double: " + " " + zmDouble + " "+ zmDouble2);

        //Deklaracja zmiennej która będzie STAłĄ!

        final int liczba = 22;
       // liczba =20; -> teraz nie można przypisać innej wartości!!! w trakcie trwania całego programu!!




    }
}
