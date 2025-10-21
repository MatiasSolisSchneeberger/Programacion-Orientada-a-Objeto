/**
 * TP 3 - Act 5
 * Esta clase representa una cuenta bancaria con un número de cuenta, un saldo y un titular.
 * Permite realizar operaciones de depósito, extracción y mostrar información de la cuenta.
 * Cada cuenta está asociada a un objeto Persona que actúa como titular.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class CuentaBancaria {
	private int nroCuenta;
	private double saldo;
	private Persona titular;

	/**
	 * Constructor completo de CuentaBancaria.
	 *
	 * @param p_nroCuenta número de cuenta de la cuenta bancaria
	 * @param p_titular   objeto Persona que es titular de la cuenta
	 * @param p_saldo     saldo inicial de la cuenta
	 */
	CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
		this.setNroCuenta(p_nroCuenta);
		this.setTitular(p_titular);
		this.setSaldo(p_saldo);
	}

	/**
	 * Constructor sin saldo inicial, se asume 0.
	 *
	 * @param p_nroCuenta número de cuenta
	 * @param p_titular   objeto Persona que es titular de la cuenta
	 */
	CuentaBancaria(int p_nroCuenta, Persona p_titular) {
		this.setNroCuenta(p_nroCuenta);
		this.setTitular(p_titular);
		this.setSaldo(0);
	}

	/**
	 * Devuelve el número de cuenta.
	 *
	 * @return número de cuenta
	 */
	public int getNroCuenta() {
		return this.nroCuenta;
	}

	/**
	 * Establece el número de cuenta.
	 *
	 * @param nroCuenta nuevo número de cuenta
	 */
	private void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	/**
	 * Devuelve el saldo actual de la cuenta.
	 *
	 * @return saldo disponible
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Establece el saldo de la cuenta.
	 *
	 * @param saldo nuevo saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el titular de la cuenta.
	 *
	 * @return objeto Persona titular
	 */
	public Persona getTitular() {
		return this.titular;
	}

	/**
	 * Establece el titular de la cuenta.
	 *
	 * @param titular objeto Persona titular
	 */
	private void setTitular(Persona titular) {
		this.titular = titular;
	}

	/**
	 * Deposita un importe en la cuenta y actualiza el saldo.
	 *
	 * @param p_importe cantidad a depositar
	 * @return nuevo saldo después del depósito
	 */
	public double depositar(double p_importe) {
		double nuevoImporte = this.getSaldo() + p_importe;
		this.setSaldo(nuevoImporte);
		return nuevoImporte;
	}

	/**
	 * Extrae un importe de la cuenta y actualiza el saldo.
	 *
	 * @param p_importe cantidad a extraer
	 * @return nuevo saldo después de la extracción
	 */
	public double extraer(double p_importe) {
		double nuevoImporte = this.getSaldo() - p_importe;
		this.setSaldo(nuevoImporte);
		return nuevoImporte;
	}

	/**
	 * Muestra por consola la información de la cuenta bancaria:
	 * titular y saldo actual.
	 */
	public void mostrar() {
		System.out.println("- Cuenta Bancaria -");
		System.out.println("Titular: " + this.getTitular().nomYApe());
		System.out.println("Saldo: " + this.getSaldo());
	}

	/**
	 * Devuelve una representación de la cuenta como cadena de texto.
	 *
	 * @return cadena con número de cuenta, titular y saldo
	 */
	public String toStrinf() {
		return this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo();
	}
}
