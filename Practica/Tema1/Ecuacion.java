/**
 * TP 1 - Act 5
 *
 */
public class Ecuacion {
	public static void main(String[] args) {
		int a, b, c;
		double r1, r2, discriminante;
		a = Integer.valueOf(args[0]);
		b = Integer.valueOf(args[1]);
		c = Integer.valueOf(args[2]);
		discriminante = Math.pow(b, 2) - 4 * a * c;
		r1 = ((-b + Math.sqrt(discriminante)) / (2 * a));
		r2 = ((-b - Math.sqrt(discriminante)) / (2 * a));
		if (discriminante > 0) {
			System.out.println("Raíces :");
			System.out.println("\t- r1 = " + r1);
			System.out.println("\t- r2 = " + r2);
		} else if (discriminante == 0) {
			System.out.println("Raíz :");
			System.out.println("\t- r1 = r2 = " + r1);
		} else {
			System.out.println("Raices Complejas");
		}
	}
}
