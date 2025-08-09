// Act 5

import java.util.Scanner;

public class Ecuacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;

        double r1, r2, discriminante;

        System.out.print("a: ");
        a = teclado.nextInt();
        System.out.print("b: ");
        b = teclado.nextInt();
        System.out.print("c: ");
        c = teclado.nextInt();

        discriminante = Math.pow(b, 2) - 4 * a * c;
        r1 = ((-b + Math.sqrt(discriminante)) / 2 * a);
        r2 = ((-b - Math.sqrt(discriminante)) / 2 * a);

        if (discriminante > 0) {
            System.out.println("Raíces :");
            System.out.println("\t- r1 = " + r1);
            System.out.println("\t- r2 = " + r2);
        } else if (discriminante == 0) {
            System.out.println("Raíz :");
            System.out.println("\t- r1 = " + r1);
        } else {
            System.out.println("Raices Complejas");
        }
    }
}
