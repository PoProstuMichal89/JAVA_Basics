public class TypVar {
    public static void main(String[] args) {


        System.out.println(add(1,4));

    }

    public static int add(int num1, int num2){
        var result = num1+ num2; //typ zmiennej lokalnej result zostanie automatycznie rozpoznay  przypisany prze zkompilator

        return result;
    }

}
