import java.util.Random;

/**
 * TP 3 - Act 3
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class CreaFigura {
	public static void main(String[] args) {
		System.out.println("--- Circulos ---");
		Random rnd = new Random();

		Punto pto = new Punto();

		double radio = rnd.nextDouble(100);

		Circulo circulo1 = new Circulo(radio, pto);
		circulo1.desplazar(-240, -230);

		radio = rnd.nextDouble(100);
		pto.desplazar(5.2, 0.5);
		Circulo circulo2 = new Circulo(radio, pto);

		circulo1.caracteristicas();
		circulo2.caracteristicas();

		circulo2.elMayor(circulo1).caracteristicas();

		double distancia = circulo1.distanciaA(circulo2);
		System.out.println("La distancia entre los dos circulos es: " +
				distancia);
	}
}
