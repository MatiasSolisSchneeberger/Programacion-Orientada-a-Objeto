/**
 * TP 3 - Act 1
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class GestionStock {
	public static void main(String[] args) {
		Laboratorio lab1 = new Laboratorio("Colgate S.A", "Ituzaingó 1504", "+54 11 5474 0668");
		Laboratorio lab2 = new Laboratorio("Sancor", "Independecia 1800", "+54 7894 4587", 754, 7);

		Producto prod1 = new Producto(7894, "Perfumería", "Perfume BienCopado", 784.41, lab1);
		Producto prod2 = new Producto(135, "Comida", "Fideos", 7548.1005, 7, 79, lab2);

		prod1.ajuste(10987243);
		prod2.ajuste(124087);

		prod1.ajustarExistMin(123);
		prod2.ajustarPtoRepo(1233.9);
		System.out.println("Producto 1");
		prod1.mostrar();

		System.out.println();
		System.out.println();
		System.out.println("Producto 2");
		prod2.mostrarLinea();
	}
}
