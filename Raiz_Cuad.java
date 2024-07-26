import java.util.Scanner;

public class Raiz_Cuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        double num = scanner.nextDouble();

        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada del numero es: " + raiz);
    }
}
