
/*stworzenie klas do tworzenia:
kwadrarów, kół, prostokątów, trójkątów.
Następnie stworzenie klasy "figureOf" zawierającej metody robienia fgiur.
Następnie zrobienie metody, któa będzie sprawdzała czy pole figury mieści sie w przedziale 0>100*/

//KLASY FIGUR
//do naprawienia klasa CIRCLE!!!
//kwadrat
class Square {
    float side; //długość boku
    float SquareSurface; //pole powierzchni
    Square(float side) {
        this.side = side;
    }
}

//koło
class Circle{
        private float radius; //promień
        private float LenghtCircle; //obwód
        Circle(float radius){
            this.radius=radius;
        }

        void setRadius(float radius){
            if(radius>0&&radius<=1200)
            this.radius=radius;
        }

        float getRadius(){
            return this.radius;
        }

        void setLenghtCircle(float LenghtCircle){
            if(LenghtCircle>=0)
            this.LenghtCircle=LenghtCircle;
        }
        float getLenghtCircle(){
            return this.LenghtCircle;
        }
}

//prostokąt
class Rectangle{
    float side1;
    float side2;
    float RectangleArea;
    Rectangle(float side1, float side2){
        this.side1=side1;
        this.side2=side2;
    }
}

//trójkąt
    class Triangle {
        float height;
        float side;
        float TriangleArea = 0;

    Triangle(float height, float side) {
        this.height=height;
        this.side=side;
    }

    public float InnercalculateSurfaceTriangle() { //nie może być metoda static
        TriangleArea = 0.5f * this.height * this.side; //raz przypisanw w konstruktorze - można się odwoływać w każdej metodzie! xD
        return TriangleArea;
    }
}


    //klasy dla metod tworzących figury
    class FigureCreator {

        //metoda tworząca kwadrat na podstawie klasy Square
        public Square squareOf(float SquareSide) {
            Square square = new Square(SquareSide);
            return square;
        }

        //metoda tworząca koło na podstawie klasy Circle
        public Circle circleOf(float CircleRadius) {//to co poda nam użytkownik
            Circle circle = new Circle(CircleRadius); //Przekazane CircleRadius zastępuje tak naprawdę radius z konstruktora
            return circle;
        }

        //metoda tworząca prostokąt na podstawie klasy Rectangle
        public Rectangle rectangleOf(float bok1, float bok2) {
            Rectangle rectangle = new Rectangle(bok1, bok2);
            return rectangle;
        }

        //metoda tworząca trójkąt

        public Triangle triangleOf(int height, int side) {

            Triangle triangle = new Triangle(height, side);
            return triangle;

        }
    }


    //klasy dla metod obliczających pola figur

    //Metoda obliczająca obwód koła stworzonego na bazie klasy
    class CalculateSurface {

        public static float calculateSurfaceCircle(Circle koło) {
            koło.setLenghtCircle() = Math.round(2 * (float) Math.PI * koło.getRadius());//liczba PI jest typu duble
            return koło.getLenghtCircle();
        }

        public static float calculateSurfaceSquare(Square kwadrat) {
            kwadrat.SquareSurface = (float) Math.pow(kwadrat.side, 2);
            return kwadrat.SquareSurface;
        }

        public static float calculateSurfaceRectangle(Rectangle prostokąt) {
            prostokąt.RectangleArea = prostokąt.side1 * prostokąt.side2;
            return prostokąt.RectangleArea;

        }

        public static float calculateSurfaceTriangle(Triangle trójkąt) {
            trójkąt.TriangleArea = 0.5f * trójkąt.height * trójkąt.side;
            return trójkąt.TriangleArea;
        }

    }
    
    public class MathMethods {

        public static void main(String[] args) {

            FigureCreator creator = new FigureCreator(); //powołanie nowego obiektu do tworzenia figur;

            Circle koło1 = creator.circleOf(20.5f); //stworzenie nowego koła za pomocą powołanego wczesniej kreatora
            Square kwadrat1 = creator.squareOf(4.0f);//stworzenie nowego kwadratu za pomocą
            CalculateSurface calc = new CalculateSurface();
            System.out.println("before: " + koło1.getLenghtCircle());
            float wynik = calc.calculateSurfaceCircle(koło1);
            System.out.println("after: " + koło1.getLenghtCircle());

            Circle koło3= new Circle(15000f);
            System.out.println("Koło 3: "+koło3.getRadius());

            System.out.println("Przed: " + kwadrat1.SquareSurface);
            calc.calculateSurfaceSquare(kwadrat1);
            System.out.println("po: " + kwadrat1.SquareSurface);

            Rectangle prostokąt1 = creator.rectangleOf(20, 15);
            System.out.println("prostokąt przed: " + prostokąt1.RectangleArea);
            calc.calculateSurfaceRectangle(prostokąt1);
            System.out.println("prostokąt po: " + prostokąt1.RectangleArea);

            Triangle trójkąt1 = new Triangle(4, 4);
            trójkąt1.InnercalculateSurfaceTriangle(); //obliczenie z metody wewnątrz klasy
            System.out.println("Trójkąt: "+trójkąt1.TriangleArea);

            calc.calculateSurfaceTriangle(trójkąt1); //obliczenie wywołane przez obiekt klasy CalculateSurface = calc, z obiektem klasy Triangle (trójkąt) jako argument(parametr)
            System.out.println(trójkąt1.TriangleArea);

            //dla metody  circeleOf możemy odwołać się tylko poprzez stworzenie obiektu klasy FigureCreator
            //ponieważ nie jest to metdoa statyczna. Do metod statycznych można się odwołać za pośrednictwem klas, nez tworzenia obiektu.

            CalculateSurface.calculateSurfaceCircle(koło1);//do calculateSurfaceCircle odwołujemy się po klasie,
           /* bo metoda jest statyczna, więc działa w obebie klasy, więc można się powołać na kalsę, a nie tworzyć nowy obiekt*/

        }


    }


// dorobić jeszcze trójkąt i coś tam
// dorobic metodę, która sprawdza czy jest ok i mieści sie w przedziale