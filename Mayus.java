import java.util.Scanner;

public class Mayus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una palabra:");
            String palabra = scanner.nextLine();
            if (palabra.equals("")) {
                break;
            }
            System.out.println(palabra.toUpperCase());
        }
    }
}
