public class Maiin {
    public static void main(String[] args) {

        int i = 5; //zmienne do inkrementowania zaczynam od i (potem k, j, itd. Inkrementacja - obieg pętli

        //Pętla WHILE
        while (i > 0) { //while --> warunek kontynuuacj pętli
            System.out.println(i);
            i--; //dekremntacja
        }
        System.out.println(i); //tutaj wydrukuje na konsoli 0 bo na końcu pętli tak się zatrzymało

        //PĘTLA DO WHILE (różnie się od WHILE tym, że wykona się ZAWSZE przynajmniej 1 raz

        do{
            System.out.println(i);
            i--;
        }while(i>0);

        //PĘTLA FOR (istnieje także pętla d=for each. W pętli for pierwszy człon to usyalenie warotści inkrementacyjnej, dopiero
        //potem jest warunek i na końcu działąnie (inkrmerntacja lub dekreentacja)

        for(i =9; i>0; i--){
            System.out.println(i+" "+"Pętla");
        }

        //Instrukcja BREAK

        for(i=0; i<20;i++){
            System.out.println("Iterator: "+i);
            if(i==5) break;

        }
        System.out.println("Przerwa w programie!! Osiągnięto pubkt 5!");

        //Instrukcja continue - pomija iteracje w momencie napotkania wymienionych warunków
        for(int j=0; j<10;j++){
            if(j==0||j==2||j==5||j==9) continue;
            System.out.println(j);
        }




    }


}




