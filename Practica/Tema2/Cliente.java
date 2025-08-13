/**
 * TP 2 - Act 3
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Cliente {
	private int nroDNI;
	private String apellido;
	private String nombre;
	private double saldo;

	/**
	 * @param p_nroDNI
	 * @param p_apellido
	 * @param p_nombre
	 * @param p_saldo
	 */
	public Cliente(int p_nroDNI, String p_apellido, String p_nombre, double p_saldo) {
		setNroDNI(p_nroDNI);
		setApellido(p_apellido);
		setNombre(p_nombre);
		setSaldo(p_saldo);
	}    /* Setters y Getters */

	/**
	 * @param p_nroDNI
	 */
	public void setNroDNI(int p_nroDNI) {
		this.nroDNI = p_nroDNI;
	}

	/**
	 * @return el atributo nroDNI del objeto
	 */
	public int getNroDNI() {
		return nroDNI;
	}

	/**
	 * @param p_apellido
	 */
	public void setApellido(String p_apellido) {
		this.apellido = p_apellido;
	}

	/**
	 * @return el atributo apellido del objeto
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param p_nombre
	 */
	public void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	/**
	 * @return el atributo nombre del objeto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param p_saldo
	 */
	public void setSaldo(double p_saldo) {
		this.saldo = p_saldo;
	}

	/**
	 * @return el atributo saldo del objeto
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * muestra la informacion final del objeto. Nombre, apellido, DNI, saldo
	 */
	public void mostrar() {
		System.out.println("- Practica.Tema2.Cliente -");
		System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido() + " (" + getNroDNI() + ")");
		System.out.println("Saldo: " + getSaldo());
	}

	/**
	 * @param p_importe
	 * @return nuevoSaldo (saldoActual + importe)
	 */
	public double agregarSaldo(double p_importe) {
		double nuevoSaldo = p_importe + getSaldo();
		setSaldo(nuevoSaldo);
		return nuevoSaldo;
	}

	/**
	 * @param p_importe
	 * @return nuevoSaldo (nuevoImporte)
	 */
	public double nuevoSaldo(double p_importe) {
		setSaldo(p_importe);
		return getSaldo();
	}
}