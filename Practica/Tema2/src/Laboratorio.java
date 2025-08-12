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
	 * @param p_nombre
	 * @param p_domicilio
	 * @param p_telefono
	 * @param p_compraMinima
	 * @param p_diaEntrega
	 */
	Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega) {
		nombre = p_nombre;
		domicilio = p_domicilio;
		telefono = p_telefono;
		compraMinima = p_compraMinima;
		diaEntrega = p_diaEntrega;
	}
	/**
	 * Constructor
	 * @param p_nombre
	 * @param p_domicilio
	 * @param p_telefono
	 * */
	Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
		nombre = p_nombre;
		domicilio = p_domicilio;
		telefono = p_telefono;
	}

	/**
	 * @param p_compraMin Nuevo valor para la compra minima
	 * */
	public void nuevaCompraMinima(int p_compraMin) {
		compraMinima = p_compraMin;
	}

	/**
	 * @param p_diaEntrega Nuevo valor para la entrega del dia
	 * */
	public void nuevoDiaEntrega(int p_diaEntrega) {
		diaEntrega = p_diaEntrega;
	}

	/**
	 * Devuelve la informacion del objeto. Nombre, domicilio, telefono.
	 * @return String
	 * */
	public String mostrar() {
		return "Laboratorio: " + nombre + "\n" +
				"Domicilio: " + domicilio + " - Telefono: " + telefono;
	}
}
