public class Switch_2 {

    enum CarVariant {SEDAN, COMBO, SPORT}; //przed blokiem należy zdefiniować!

    public static void main(String[] args) {

        int num=1;

        switch (num) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 10:
                System.out.println("ok");
                break;
            default:
                System.out.println("Nie wiem");
        }

                //Switch + enum

                CarVariant car = CarVariant.SEDAN; //przy tworzeniu tego typu obiketu nie potrzeba konstruktora i słówka new
        //enum zdefiniowany przed głównym blokiem!!!

                switch (car){
                    case COMBO:
                        System.out.println(CarVariant.COMBO);
                        break;
                    case SEDAN:
                        System.out.println("Sedan");
                        break;
                    case SPORT:
                        System.out.println("Sport");
                        break;
                    default:
                        System.out.println("No to ja już nie wiem!!");

                }






    }

}
