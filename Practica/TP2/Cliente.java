/**
 * Clase que representa a un Cliente de un banco o sistema financiero.
 * Se almacenan sus datos personales (DNI, nombre, apellido) y el saldo de su cuenta.
 * Permite consultar y modificar estos datos, además de actualizar el saldo.
 *
 * TP 2 - Act 3
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Cliente {
	private int nroDNI;
	private String apellido;
	private String nombre;
	private double saldo;

	/**
	 * Constructor de la clase Cliente.
	 * Crea un cliente con todos sus datos cargados.
	 *
	 * @param p_nroDNI número de documento del cliente
	 * @param p_apellido apellido del cliente
	 * @param p_nombre nombre del cliente
	 * @param p_saldo saldo inicial de la cuenta
	 */
	public Cliente(int p_nroDNI, String p_apellido, String p_nombre, double p_saldo) {
		setNroDNI(p_nroDNI);
		setApellido(p_apellido);
		setNombre(p_nombre);
		setSaldo(p_saldo);
	}

	/**
	 * Cambia el DNI del cliente.
	 * @param p_nroDNI nuevo DNI
	 */
	public void setNroDNI(int p_nroDNI) {
		this.nroDNI = p_nroDNI;
	}

	/**
	 * Devuelve el DNI del cliente.
	 * @return número de documento
	 */
	public int getNroDNI() {
		return nroDNI;
	}

	/**
	 * Cambia el apellido del cliente.
	 * @param p_apellido nuevo apellido
	 */
	public void setApellido(String p_apellido) {
		this.apellido = p_apellido;
	}

	/**
	 * Devuelve el apellido del cliente.
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Cambia el nombre del cliente.
	 * @param p_nombre nuevo nombre
	 */
	public void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	/**
	 * Devuelve el nombre del cliente.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el saldo de la cuenta del cliente.
	 * @param p_saldo nuevo saldo
	 */
	public void setSaldo(double p_saldo) {
		this.saldo = p_saldo;
	}

	/**
	 * Devuelve el saldo actual del cliente.
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Muestra por consola la información principal del cliente:
	 * Nombre, Apellido, DNI y saldo actual.
	 */
	public void mostrar() {
		System.out.println("- Cliente -");
		System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido() + " (" + getNroDNI() + ")");
		System.out.println("Saldo: $" + getSaldo());
	}

	/**
	 * Suma un importe al saldo actual del cliente.
	 *
	 * @param p_importe importe a agregar
	 * @return nuevo saldo después de la operación
	 */
	public double agregarSaldo(double p_importe) {
		double nuevoSaldo = p_importe + getSaldo();
		setSaldo(nuevoSaldo);
		return nuevoSaldo;
	}

	/**
	 * Reemplaza el saldo actual del cliente por un nuevo importe.
	 *
	 * @param p_importe nuevo saldo
	 * @return el nuevo saldo
	 */
	public double nuevoSaldo(double p_importe) {
		setSaldo(p_importe);
		return getSaldo();
	}
}
