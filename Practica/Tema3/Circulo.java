/**
 * TP 3 - Act 3
 * Representa a un círculo en un plano cartesiano de dos dimensiones.
 *
 * @author Matias Solis Schneebeger
 * @version 1.0
 */
public class Circulo {
	private double radio;
	private Punto centro;

	/**
	 * Constructor de círculo, pasando un radio y un centro.
	 *
	 * @param p_radio  radio del círculo
	 * @param p_centro centro del círculo
	 */
	Circulo(double p_radio, Punto p_centro) {
		setCentro(p_centro);
		setRadio(p_radio);
	}

	/**
	 * Constructor un círculo de radio 0 centrado en el origen
	 */
	Circulo() {
		Punto punto = new Punto();
		setCentro(punto);
		setRadio(0);
	}


	/**
	 * Devuelve el radio del círculo
	 *
	 * @return radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * Establece el radio
	 *
	 * @param p_radio radio
	 */
	private void setRadio(double p_radio) {
		this.radio = p_radio;
	}

	/**
	 * Devuelve el centro del círculo
	 *
	 * @return centro
	 */
	public Punto getCentro() {
		return centro;
	}


	/**
	 * Establece el centro del círculo
	 *
	 * @param p_centro centro
	 */
	private void setCentro(Punto p_centro) {
		this.centro = p_centro;
	}

	/**
	 * Desplaza el círculo al punto deseado.
	 *
	 * @param p_px coordenada x
	 * @param p_py coordenada y
	 */
	public void desplazar(double p_px, double p_py) {
		Punto punto = new Punto(p_px, p_py);
		setCentro(punto);
	}

	/**
	 * Muestra por pantalla las características del círculo
	 * Centro - Radio - Superficie - Perímetro
	 */
	public void caracteristicas() {
		System.out.println("****** Circulo ******");
		System.out.println("Centro: " + this.getCentro().coordenadas() + "\t- Radio: " + this.getRadio());
		System.out.println("Superficie: " + this.superficie() + "\t- Perímetro: " + this.perimetro());
	}

	/**
	 * Devuelve el perímetro del círculo
	 *
	 * @return perímeter double
	 */
	public double perimetro() {
		return Math.PI * getRadio() * 2;
	}

	/**
	 * Devuelve la superficie del círculo
	 *
	 * @return superficie double
	 */
	public double superficie() {
		return Math.PI * (getRadio() * getRadio());
	}

	/**
	 * Calcula la distancia entre el punto y
	 *
	 * @return distancia double
	 */
	public double distanciaA(Circulo otroCirculo) {
		return this.getCentro().distanciaA(otroCirculo.getCentro());
	}


	/**
	 * Devuelve el mayor de los círculos
	 *
	 * @return círculo
	 */
	public Circulo elMayor(Circulo otroCirculo) {
		if (this.superficie() > otroCirculo.superficie()) {
			return this;
		} else {
			return otroCirculo;
		}
	}
}
