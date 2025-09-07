/**
 * TP 2 - Act 2
 * Clase que representa un Laboratorio.
 * Guarda información como nombre, domicilio, teléfono, compra mínima y día de entrega.
 * Sirve para gestionar datos de un laboratorio proveedor.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Laboratorio {
	private String nombre;
	private String domicilio;
	private String telefono;
	private int compraMinima;
	private int diaEntrega;

	/**
	 * Constructor completo del Laboratorio.
	 * Se inicializan todos los atributos.
	 *
	 * @param p_nombre       nombre del laboratorio
	 * @param p_domicilio    domicilio del laboratorio
	 * @param p_telefono     teléfono de contacto
	 * @param p_compraMinima valor mínimo de compra
	 * @param p_diaEntrega   día de entrega
	 */
	Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega) {
		setNombre(p_nombre);
		setDomicilio(p_domicilio);
		setTelefono(p_telefono);
		setCompraMinima(p_compraMinima);
		setDiaEntrega(p_diaEntrega);
	}

	/**
	 * Constructor reducido del Laboratorio.
	 * No recibe compra mínima ni día de entrega, solo datos básicos.
	 *
	 * @param p_nombre    nombre del laboratorio
	 * @param p_domicilio domicilio del laboratorio
	 * @param p_telefono  teléfono de contacto
	 */
	Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
		setNombre(p_nombre);
		setDomicilio(p_domicilio);
		setTelefono(p_telefono);
	}

	/**
	 * Devuelve el nombre del laboratorio.
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del laboratorio.
	 *
	 * @param p_nombre nuevo nombre
	 */
	public void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	/**
	 * Devuelve el domicilio del laboratorio.
	 *
	 * @return domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * Cambia el domicilio del laboratorio.
	 *
	 * @param p_domicilio nuevo domicilio
	 */
	public void setDomicilio(String p_domicilio) {
		this.domicilio = p_domicilio;
	}

	/**
	 * Cambia el teléfono del laboratorio.
	 *
	 * @param p_telefono nuevo teléfono
	 */
	public void setTelefono(String p_telefono) {
		this.telefono = p_telefono;
	}

	/**
	 * Devuelve el teléfono del laboratorio.
	 *
	 * @return teléfono
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * Devuelve el valor de compra mínima.
	 *
	 * @return compra mínima
	 */
	public int getCompraMinima() {
		return compraMinima;
	}

	/**
	 * Cambia la compra mínima.
	 *
	 * @param compraMinima nuevo valor de compra mínima
	 */
	public void setCompraMinima(int compraMinima) {
		this.compraMinima = compraMinima;
	}

	/**
	 * Devuelve el día de entrega.
	 *
	 * @return día de entrega
	 */
	public int getDiaEntrega() {
		return diaEntrega;
	}

	/**
	 * Cambia el día de entrega.
	 *
	 * @param diaEntrega nuevo día de entrega
	 */
	public void setDiaEntrega(int diaEntrega) {
		this.diaEntrega = diaEntrega;
	}

	/**
	 * Actualiza el valor de la compra mínima.
	 *
	 * @param p_compraMin nuevo valor
	 */
	public void nuevaCompraMinima(int p_compraMin) {
		compraMinima = p_compraMin;
	}

	/**
	 * Actualiza el valor del día de entrega.
	 *
	 * @param p_diaEntrega nuevo valor
	 */
	public void nuevoDiaEntrega(int p_diaEntrega) {
		diaEntrega = p_diaEntrega;
	}

	/**
	 * Devuelve la información básica del laboratorio
	 * en formato String: nombre, domicilio y teléfono.
	 *
	 * @return datos del laboratorio
	 */
	public String mostrar() {
		return "Laboratorio: " + getNombre() + "\n" + "Domicilio: " + getDomicilio() + " - Teléfono: " + getTelefono();
	}
}
