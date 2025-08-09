// Actividad 4
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        texto.useDelimiter(";\\s");

        System.out.print("Ingresar tres numeros dobles (double): ");
        double a = texto.nextDouble();
        double b = texto.nextDouble();
        double c = texto.nextDouble();

        double semiperimetro = (a + b + c) / 2;

        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + (Math.sqrt(
                semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c))));
    }
}
