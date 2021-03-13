class Towar{
    public String nazwa;
    public float cena;

    Towar(String nazwa,float cena){
        this.nazwa=nazwa;
        this.cena=cena;
    }

    Towar(){
        nazwa="brak";
        cena=0.0f;
    }

    public void zmiencene(float cena){ //bez tego przypisania nie zmieni sę cena w obiekcie!
        this.cena=cena;
    }

    public float dajCene(){
        return cena;
    }

    public void zmiennazwe(String nazwa){
        this.nazwa=nazwa;
    }

    public String dajNazwe(){
        return nazwa;
    }

    public void odcz(){
        System.out.format("\ttowar:%s, cena:%.2f\n", nazwa, cena);
    }
}

    class ElemZam{
        private Towar towar;
        private int ile;

        ElemZam(Towar towar, int ile){
            this.towar=towar;
            this.ile=ile;
        }

         ElemZam(Towar towar){
            this.towar=towar;
            ile=1;
        }

        public float kosztZamow(){
            return ile * towar.dajCene();
        }

        public void odcz(){
            System.out.format("\tnazwa: %s, cena:%.2f, liczba sztuk:%d, łącznie:%.2f \n", towar.dajNazwe(),towar.dajCene(),ile,kosztZamow());
        }
    }

        class Zamówienie{

            private int liczPozZ;
            private ElemZam[] tab;

            public Zamówienie(){
                tab=new ElemZam[100];
                liczPozZ=0;
            }

            public void dodaj(ElemZam el){
                tab[liczPozZ]=el;
                liczPozZ++;
            }


            public float kosztCalegoZamow(){
                float suma=0;
                for(int i =0;i<liczPozZ;i++){
                    suma+=tab[i].kosztZamow();
                }
            return suma;
        }

        public void odcz(){
            System.out.format("Koszt całego zamówienia wynosi: %.2f zł, a na jego poszczególne części skąłda się:\n",kosztCalegoZamow());
            for(int i=0; i<liczPozZ; i++){
                tab[i].odcz();
            }
             }
        }



public class Sklep {

    public static void main(String[] args) {

        //Stworzenie słuchawek!
        Towar słuchawki = new Towar();
        słuchawki.odcz();
        słuchawki.zmiencene(160.00f);
        słuchawki.odcz();
        słuchawki.zmiennazwe("Marshal Monitor II");
        String nowaNazwa=słuchawki.dajNazwe();
        System.out.println(nowaNazwa);

        //Stworzenie nowego elementu zamówienia na bazie towaru
        ElemZam element1 =new ElemZam(słuchawki,2);
        float koszt = element1.kosztZamow();
        System.out.println(koszt);

        //Stworzenie nowego towaru
        Towar głosnikMarshal = new Towar("Głośnik Marshal",500.89f);
        głosnikMarshal.odcz();
        Towar kabelMniJack = new Towar("Mini-Jack",59.99f);
        Towar etui = new Towar();

        //Stworzenie nowego elementu zamówienia
        ElemZam element2 = new ElemZam(głosnikMarshal);
        ElemZam element3= new ElemZam(kabelMniJack);
        ElemZam element4= new ElemZam(etui);
        


         Zamówienie zamówienie1 = new Zamówienie();
         zamówienie1.dodaj(element1);
         zamówienie1.dodaj(element2);
         zamówienie1.dodaj(element3);
         zamówienie1.dodaj(element4);
         zamówienie1.odcz();
         etui.zmiennazwe("etui");
         /*zamówienie1.odcz();*/


    }

}
