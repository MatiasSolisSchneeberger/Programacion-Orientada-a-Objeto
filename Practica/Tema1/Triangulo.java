/**
 * TP 1 - Act 4
 *
 */
public class Triangulo {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double semiperimetro = (a + b + c) / 2;
		System.out.println("Semiperimetro: " + semiperimetro);
		System.out.println("Area: " + (Math.sqrt(
				semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c))));
	}
}
