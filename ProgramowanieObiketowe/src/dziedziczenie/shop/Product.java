package dziedziczenie.shop;

public class Product {
    float price;
    String name = "uknown";
    String manufacturer;
    int productionYear;

    Product(){
        this.price=price=1222.0f;
        this.name=name;
        this.manufacturer=manufacturer;
        this.productionYear=productionYear;
    }
    public void printInfo(){
        System.out.println(name+" "+manufacturer+" "+productionYear);
    }
}
