/**
 * TP 2 - Act 2
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class EjecutableLaboratorio {
	public static void main(String[] args) {
		Laboratorio lab1 = new Laboratorio("Colgate S.A.", "Junín 1800", "+54 3794 651667", 2, 19);
		Laboratorio lab2 = new Laboratorio("Farmar", "Av. Cazadores 1100", "+54 3794 809667");
		lab2.nuevaCompraMinima(5);
		lab1.nuevoDiaEntrega(25);

		System.out.println("--- Laboratorio 1 ---");
		System.out.println(lab1.mostrar());
		System.out.println(lab1.getDiaEntrega());
		System.out.println(lab1.getCompraMinima());

		System.out.println("--- Laboratorio 2 ---");
		System.out.println(lab2.mostrar());
		System.out.println(lab2.getDiaEntrega());
		System.out.println(lab2.getCompraMinima());
	}
}
