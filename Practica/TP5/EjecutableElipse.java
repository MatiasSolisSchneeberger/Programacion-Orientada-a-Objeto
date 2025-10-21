public class EjecutableElipse {
	public static void main(String[] args) {
		Elipse Elipse1 = new Elipse(4, 2, new Punto(1, 1));
		Elipse1.caracteristicas();

		Elipse Elipse2 = new Elipse(5, 3, new Punto(2, 2));
		Elipse2.caracteristicas();

		System.out.println("Distancia entre Elipses: " + Elipse1.distanciaA(Elipse2));


		Circulo circulo1 = new Circulo(3, new Punto(0, 0));
		circulo1.caracteristicas();

		Circulo circulo2 = new Circulo(4, new Punto(5, 5));
		circulo2.caracteristicas();

		System.out.println("Distancia entre círculos: " + circulo1.distanciaA(circulo2));
	}
}
