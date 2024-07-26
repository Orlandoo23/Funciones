import java.util.Scanner;

public class Caden_tex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String cadena = scanner.nextLine();

        System.out.println(esPalindromo(cadena));
    }

    public static String esPalindromo(String cadena) {
        String cadenaLimpia = cadena.toLowerCase().replace(" ", "");
        StringBuilder reverse = new StringBuilder(cadenaLimpia).reverse();
        if (cadenaLimpia.equals(reverse.toString())) {
            return "Es un palíndromo";
        } else {
            return "No es un palíndromo";
        }
    }
}
