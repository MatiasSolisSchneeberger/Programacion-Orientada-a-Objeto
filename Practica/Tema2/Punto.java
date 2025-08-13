/**
 * TP 2 - Act 6
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class Punto {
	private double x;
	private double y;

	Punto() {
		setX(0.0);
		setY(0.0);
	}

	Punto(double p_x, double p_y) {
		setX(p_x);
		setY(p_y);
	}

	public double getX() {
		return x;
	}

	public void setX(double p_x) {
		this.x = p_x;
	}

	public double getY() {
		return y;
	}

	public void setY(double p_y) {
		this.y = p_y;
	}

	public void desplazar(double p_dx, double p_dy) {
		setX(getX() + p_dx);
		setY(getY() + p_dy);
	}

	public String coordenadas() {
		return "(" + getX() + ", " + getY() + ")";
	}

	public void mostrar() {
		System.out.println("Punto. X: " + getX() + ", Y:" + getY());
	}
}
