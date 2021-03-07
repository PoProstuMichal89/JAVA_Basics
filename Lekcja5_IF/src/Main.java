public class Main {
    public static void main( String[] args){
        int wiek =19;

        if(wiek>= 18){
            System.out.println("Pełnoletnia");
        }
        else{
            if(wiek>=16){
            System.out.println("Możesz pracować");
        }
                else{
                System.out.println("Nie możesz nic");
                }
            }
        //Warunek 2 na sprawdzenie wagi, bez zagniżdżania
        int waga =66;
        if (waga<=60 && waga>49){
            System.out.print("Jesteś w normie");
        }
        else if(waga>60){
            System.out.println("Grubas!!");
        }
        else{
            System.out.println("Anorektyk!");
        }
        //Warunek trójargumentowy. Przypisanie odpowiedniej wartości zachodzi wtedy, gdy wartośc po lewej stronie znaku zapytania jest true

        String pozowlenie = wiek>=18 ? "Pełnoletni" : "Niepełnoletni";
        System.out.println(pozowlenie);

        //trójargumentowy - inaczej ternar

        //Uwaga ! do porównywania stringów używamy funkcji equals, gdyż == porównuje tylko referencje!!
    }
}
