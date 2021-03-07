package singleton_pakiety;

//dowołuje sę do jednego miejsca w pamięci dla różnych ziennych
class DBConnection{

    private static DBConnection instance; //statyczna zmienna DB connection

    public static DBConnection getInstance(){ //pobieranie jedynej instancji jako obiektu klasy DBConnection. Tylko do tej klasy sie programersi moga odwoływać
        if(instance==null){
            instance= new DBConnection();
        }
        return instance;
    }

    public void getFromDB(){
        System.out.println("Pbrane dane z bazy");
    }
}

public class Singleton {
    public static void main(String[] args) {

        DBConnection coonection = DBConnection.getInstance();  //odwołujemy się tak naprawdę do tej samej instancji
        DBConnection coonection2 = DBConnection.getInstance(); //nie tworzymy dwóch różnych DB Connection
                                                                //czyli dwóch obiektów klas
                                                                //DBConection to jest ta sama instancja i każdy obiekt DBCOnnection odwołuje się do tego amego meijsca w pamieci

        System.out.println(coonection==coonection2);// czy donosz sie  do tego samego miejsca w pamięci?!
        //TAK

        coonection2.getFromDB();
    }


}
