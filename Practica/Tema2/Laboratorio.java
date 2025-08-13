/**
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class Laboratorio {
	private String nombre;
	private String domicilio;
	private String telefono;
	private int compraMinima;
	private int diaEntrega;

	/**
	 * Constructor
	 *
	 * @param p_nombre
	 * @param p_domicilio
	 * @param p_telefono
	 * @param p_compraMinima
	 * @param p_diaEntrega
	 */
	Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega) {
		setNombre(p_nombre);
		setDomicilio(p_domicilio);
		setTelefono(p_telefono);
		setCompraMinima(p_compraMinima);
		setDiaEntrega(p_diaEntrega);
	}

	/**
	 * Constructor
	 *
	 * @param p_nombre
	 * @param p_domicilio
	 * @param p_telefono
	 *
	 */
	Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
		setNombre(p_nombre);
		setDomicilio(p_domicilio);
		setTelefono(p_telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String p_domicilio) {
		this.domicilio = p_domicilio;
	}

	public void setTelefono(String p_telefono) {
		this.telefono = p_telefono;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public int getCompraMinima() {
		return compraMinima;
	}

	public void setCompraMinima(int compraMinima) {
		this.compraMinima = compraMinima;
	}

	public int getDiaEntrega() {
		return diaEntrega;
	}

	public void setDiaEntrega(int diaEntrega) {
		this.diaEntrega = diaEntrega;
	}

	/**
	 * @param p_compraMin Nuevo valor para la compra minima
	 */
	public void nuevaCompraMinima(int p_compraMin) {
		compraMinima = p_compraMin;
	}

	/**
	 * @param p_diaEntrega Nuevo valor para la entrega del dia
	 */
	public void nuevoDiaEntrega(int p_diaEntrega) {
		diaEntrega = p_diaEntrega;
	}

	/**
	 * Devuelve la informacion del objeto. Nombre, domicilio, telefono.
	 *
	 * @return String
	 */
	public String mostrar() {
		return "Practica.Tema2.Laboratorio: " + nombre + "\n" + "Domicilio: " + domicilio + " - Telefono: " + telefono;
	}
}
