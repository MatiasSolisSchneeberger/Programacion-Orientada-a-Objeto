/**
 * TP 2 - Act 3
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class EjecutableCliente {
	public static void main(String[] args) {
		int nroDNI = Integer.valueOf(args[0]);
		String apellido = args[1];
		String nombre = args[2];
		double saldo = Double.parseDouble(args[3]);

		Cliente cliente1 = new Cliente(nroDNI, apellido, nombre, saldo);
		System.out.println("--- Cliente inicial ---");
		cliente1.mostrar();

		System.out.println("--- Cliente con saldo agregado ---");
		cliente1.agregarSaldo(1000);
		cliente1.mostrar();

		System.out.println("--- Cliente con nuevo saldo (negativo) ---");
		cliente1.nuevoSaldo(-100);
		cliente1.mostrar();

	}
}
