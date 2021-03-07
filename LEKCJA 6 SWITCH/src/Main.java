public class Main {
    public static void main(String[] args){

        int poraRoku=0;

        switch(poraRoku){
            case 1:
                System.out.println("Zima");
                break; //słówko skoku - żeby się wybić z wykonywania insrukcji. Inaczej leci z góry na dół
                        // wyłamanie się ze standardowego przepływu programu
            case 2:
                System.out.println("Wiosna");
                break;
            case 3:
                System.out.println("Lato");
                break;
            case 4:
                System.out.println("Jesień");
                break;
            default: //jeśli podany w sitch zmienna nie odpoiwada żadnemu caseowi (nie jest od 1 do 5)
                System.out.println("Inne");
        }
    }
}
