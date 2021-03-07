public class Konwersje_Danych {

    public static void main(String[] args) {

        int i = 3;
        double a = 10.0d;

        //jawna (zwężająca) komwersja - konwersja między typem int a double
        double b= a /(double)i; //i zostaje skonwertowane na typ double
        System.out.println("jawna: "+b);
        //niejawna (rozszerzająca) - i przypisane przez double poprzez kompilator
        double c= a/i;
        System.out.println("niejawna: "+ c);

        //drugi przykład
        double d = 5.5; //przy konwersji float/double na typ całkowuty, część ułamokowa jest tracona. Tylko konwersja jawna!
        int num = 10*(int)d;
        System.out.println(num);

        //Rrzutowanie -wtedy kiedy wymuszamy konwersję (konwersja jawna) na jakiś zmiennej ale tracimi część danych. Np. typ byte ma tylko do 127 a jak przzegniemy to utnie nam częśc danych
        byte small =(byte)200;
        System.out.println(small);

        //rzitowanie z angielskeigo -casting

    }

}
