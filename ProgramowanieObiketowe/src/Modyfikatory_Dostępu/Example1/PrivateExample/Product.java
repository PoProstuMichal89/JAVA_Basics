package Modyfikatory_Dostępu.Example1.PrivateExample;

public class Product {

    private String name;
    public String another;

    public Product(){
        this.name="unknown";
        this.another="ble";
    }


    public Product(String name){
        this.name=name;
    }

}
