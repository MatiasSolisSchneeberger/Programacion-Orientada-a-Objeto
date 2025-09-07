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



		System.out.println("--- Rectangulo ---");

		double ancho = rnd.nextDouble(100);
		double alto = rnd.nextDouble(100);
		Rectangulo rectangulo1 = new Rectangulo(ancho, alto);

		rectangulo1.desplazar(40, -20);

		rectangulo1.caracteristicas();

		ancho = rnd.nextDouble(100);
		alto = rnd.nextDouble(100);

		pto.desplazar(7.4, 4.5);
		Rectangulo rectangulo2 = new Rectangulo(pto, ancho, alto);

		rectangulo2.elMayor(rectangulo1).caracteristicas();
		distancia = rectangulo1.distanciaA(rectangulo1);
		System.out.println("La distancia entre los dos rectangulos es: " + distancia);
	}
}
