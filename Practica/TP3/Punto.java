/**
 * TP 3 - Act 2
 * Representa un punto en el plano cartesiano con coordenadas (x, y).
 * Permite modificar y obtener sus valores, desplazar el punto, calcular distancias y mostrar información.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0
 */
public class Punto {
	private double x;
	private double y;

	/**
	 * Constructor por defecto.
	 * Crea un punto en el origen de coordenadas (0.0, 0.0).
	 */
	Punto() {
		this.setX(0.0);
		this.setY(0.0);
	}

	/**
	 * Constructor con parámetros.
	 * Crea un punto con las coordenadas especificadas.
	 *
	 * @param p_x valor de la coordenada X
	 * @param p_y valor de la coordenada Y
	 */
	Punto(double p_x, double p_y) {
		this.setX(p_x);
		this.setY(p_y);
	}

	/**
	 * Obtiene la coordenada X del punto.
	 *
	 * @return valor actual de X
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * Establece el valor de la coordenada X.
	 *
	 * @param p_x nuevo valor para X
	 */
	public void setX(double p_x) {
		this.x = p_x;
	}

	/**
	 * Obtiene la coordenada Y del punto.
	 *
	 * @return valor actual de Y
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * Establece el valor de la coordenada Y.
	 *
	 * @param p_y nuevo valor para Y
	 */
	public void setY(double p_y) {
		this.y = p_y;
	}

	/**
	 * Desplaza el punto sumando valores a sus coordenadas.
	 *
	 * @param p_dx incremento en el eje X
	 * @param p_dy incremento en el eje Y
	 */
	public void desplazar(double p_dx, double p_dy) {
		this.setX(this.getX() + p_dx);
		this.setY(this.getY() + p_dy);
	}

	/**
	 * Calcula la distancia euclidiana entre este punto y otro punto pasado como parámetro.
	 *
	 * @param p_ptoDistante punto respecto al cual se calcula la distancia
	 * @return distancia entre los dos puntos
	 */
	public double distanciaA(Punto p_ptoDistante) {
		return Math.sqrt(
				(Math.pow(p_ptoDistante.getX() - this.getX(), 2)) + // p1
				(Math.pow(p_ptoDistante.getY() - this.getY(), 2)) // p2
		);
	}

	/**
	 * Devuelve las coordenadas del punto en formato textual.
	 *
	 * @return una cadena con la forma "(x, y)"
	 */
	public String coordenadas() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}

	/**
	 * Muestra las coordenadas del punto por consola.
	 */
	public void mostrar() {
		System.out.println("Punto. X: " + this.getX() + ", Y:" + this.getY());
	}
}
