public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner in =new java.util.Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String name = in.nextLine();
        System.out.println("Twoje imię to: "+name);
    }

}
