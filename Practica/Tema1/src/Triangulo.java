// Actividad 4
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter(";\\s");

        System.out.print("Ingresar tres numeros dobles (double): ");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        double semiperimetro = (a + b + c) / 2;

        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + (Math.sqrt(
                semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c))));
    }
}
