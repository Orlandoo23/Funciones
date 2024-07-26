import java.util.Scanner;

public class Chang_caracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String text = scanner.nextLine();

        System.out.println("Ingrese la letra a cambiar:");
        String Orig = scanner.nextLine();

        System.out.println("Ingrese la letra de reemplazo:");
        String caracterReemplazo = scanner.nextLine();

        String nuevaCadena = text.replace(Orig, caracterReemplazo);
        System.out.println(nuevaCadena);
    }
}
