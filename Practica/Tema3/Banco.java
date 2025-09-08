import java.util.Calendar;

/**
 * TP 3 - Act 7 - Act 9
 * Clase principal para probar las clases CuentaCorriente, CajaDeAhorro y Persona.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Banco {
	public static void main(String[] args) {
		Calendar cumple = Calendar.getInstance();
		cumple.set(1990, Calendar.JUNE, 15);

		Persona titular = new Persona(12345678, "Juan", "Perez", cumple);

		CuentaCorriente cc = new CuentaCorriente(1735, titular, 1500);
		CajaDeAhorro ca = new CajaDeAhorro(2135, titular, 155.25);

		cc.mostrar();
		cc.extraer(2000); // debería fallar
		cc.extraer(1000); // debería andar
		cc.mostrar();

		ca.mostrar();
		ca.extraer(200); // debería fallar
		ca.extraer(100); // debería andar
		ca.mostrar();
		// Act 9
		System.out.println(titular.esCumpleanios());
	}
}
