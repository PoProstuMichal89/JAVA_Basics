package Methods;

class Circle {
    float radius; //promień

    Circle(float r){
        radius=r; //w konstruktorze prosimy o podanie promienia dla koła
    }
}

class Square{
    float side;

    Square(float side){
        this.side=side;
    }
}

class MathMethods{
    public int add(int a , int b){
        return a+b;
    }

    public int substract(int a, int b){
        return a-b;
    }

    public Circle getNewcircle(float radius){
        Circle c = new Circle(radius);
        return c;
    }

    public Square getNewSqare(float side){
        Square kwadrat = new Square(12.0f);
        return kwadrat;
    }

}

public class ReturnValueAndObject {

    public static void main(String[] args) {
        MathMethods math =new MathMethods();
        int a =12;
        int b=3;
        int result = math.substract(a,b);
        System.out.println("result: "+result);

        //Powołanie nowego koła na bazie klasy math

        Circle circle =math.getNewcircle(30);
        System.out.println(circle.radius);

        //kwadrat
        Square kwadrat=math.getNewSqare(44);
        System.out.println(kwadrat.side);

    }

}
