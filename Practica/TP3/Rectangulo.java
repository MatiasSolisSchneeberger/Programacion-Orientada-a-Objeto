/**
 * TP 3 - Act 4
 * Representa un rectángulo en un plano cartesiano.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Rectangulo {
	private Punto origen;
	private double ancho;
	private double alto;

	Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
		this.setAlto(p_alto);
		this.setAncho(p_ancho);
		super.setOrigen(p_origen);
	}

	Rectangulo(double p_ancho, double p_alto) {
		this.setAlto(p_alto);
		this.setAncho(p_ancho);
		Punto pto = new Punto(0, 0);
		super.setOrigen(pto);
	}

	public Punto getOrigen() {
		return this.origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getAncho() {
		return this.ancho;
	}

	private void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return this.alto;
	}

	private void setAlto(double alto) {
		this.alto = alto;
	}

	public void desplazar(double p_px, double p_py) {
		Punto punto = new Punto(p_px, p_py);
		super.setOrigen(punto);
	}

	public void caracteristicas() {
		System.out.println("****** Rectangulo ******");
		System.out.println("Centro: " + this.getOrigen().coordenadas() +
				"\t- Alto: " + this.getAlto() +
				"\t- Ancho" + this.getAncho());
		System.out.println("Superficie: " + this.superficie() +
				"\t- Perímetro: " + this.perimetro());
	}

	public double superficie() {
		return this.getAncho() * this.getAlto();
	}

	public double perimetro() {
		return this.getAncho() + this.getAlto();
	}

	public double distanciaA(Rectangulo otroCirculo) {
		return this.getOrigen().distanciaA(otroCirculo.getOrigen());
	}

	public Rectangulo elMayor(Rectangulo otroRectangulo) {
		if (this.superficie() > otroRectangulo.superficie()) {
			return this;
		} else {
			return otroRectangulo;
		}
	}
}
