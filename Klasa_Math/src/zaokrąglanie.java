public class zaokrąglanie {

    public static void main(String[] args) {

        //zaokrąglanie do najbliższej liczy całkowitej - Math round
        System.out.println(Math.round(5.51)); //6
        System.out.println(5.49); //5

        //jeszcze pweniejsze jest rzutowanie jawne double.float na int - zawsze utracumy część ułamkową
        System.out.println((int)5.45d);

        //Math celil() - największa możliwa liczba całkowita
        System.out.println(Math.ceil(6.11)); //7.0
        System.out.println(Math.ceil(6.8)); //7.0

        //Math.floor - najmniejsza możliwa całkowita liczba
        System.out.println("Floor "+Math.floor(7.90)); //6
        System.out.println(Math.floor(9.76)); //9
        System.out.println(Math.floor(4.0));



    }

}
