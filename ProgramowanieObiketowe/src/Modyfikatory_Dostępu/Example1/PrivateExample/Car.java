package Modyfikatory_Dostępu.Example1.PrivateExample;

public class Car extends Product {

    public Car(){
//        this.name ="Car unknow"; //nie ma dostępu do zmiennej name, bo jest private w klasie Product
        //jedyna opcja to wywołanie tej opcji przez wywołanie w konstruktorze Car konstruktora nadrzędnego super:

        this.another="blee"; //to jest ok, bo zmienna blee był public
    }

}
