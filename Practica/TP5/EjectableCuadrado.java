public class EjectableCuadrado {
	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado(4);
		cuadrado1.setOrigen(new Punto(2, 3));
		cuadrado1.caracteristicas();

		Cuadrado cuadrado2 = new Cuadrado(6);
		cuadrado2.setOrigen(new Punto(5, 7));
		cuadrado2.caracteristicas();

		Rectangulo rectangulo1 = new Rectangulo(3, 5);
		rectangulo1.setOrigen(new Punto(1, 1));
		rectangulo1.caracteristicas();

		Rectangulo rectangulo2 = new Rectangulo(4, 8);
		rectangulo2.setOrigen(new Punto(6, 4));
		rectangulo2.caracteristicas();
	}
}
