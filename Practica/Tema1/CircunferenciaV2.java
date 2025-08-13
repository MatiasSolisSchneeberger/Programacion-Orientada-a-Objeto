// Actividad 7
import java.util.Scanner;public class CircunferenciaV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio;
        do {
            System.out.print("Ingresar circunferencia (0 salir): ");
            radio = teclado.nextDouble();
            System.out.println("Perímetro: " + (Math.PI * Math.pow(radio, 2)));
        } while (radio != 0);
    }
}
