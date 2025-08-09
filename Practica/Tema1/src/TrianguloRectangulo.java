import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar h: ");
        double h = teclado.nextDouble();
        System.out.print("Ingresar c1: ");
        double c1 = teclado.nextDouble();
        System.out.print("Ingresar c2: ");
        double c2 = teclado.nextDouble();

        if (Math.pow(h, 2) == Math.pow(c1, 2) + Math.pow(c2, 2)) {
            System.out.println("Es un triangulo rectangulo");
        } else {
            System.out.println("No es un triangulo rectangulo");
        }
    }
}
