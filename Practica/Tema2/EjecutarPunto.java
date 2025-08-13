import java.util.Scanner;
public class EjecutarPunto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingresar valor de X: ");
		double x = teclado.nextDouble();

		System.out.print("Ingresar valor de Y: ");
		double y = teclado.nextDouble();

		Punto punto1 = new Punto(x, y);

		punto1.mostrar();
	}
}
