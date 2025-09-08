/**
 * TP 3 - Act 7
 * Esta clase representa una cuenta corriente bancaria.
 * Cada cuenta corriente tiene un número de cuenta, un saldo,
 * un límite de descubierto y un titular (de tipo Persona).
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class CuentaCorriente {
	private int nroCuenta;
	private double saldo;
	private double limiteDescubierto;
	private Persona titular;

	/**
	 * Construye una nueva cuenta corriente con un número de cuenta,
	 * un titular y un saldo inicial de 0.
	 *
	 * @param p_nroCuenta número de cuenta
	 * @param p_titular   titular de la cuenta(de tipo Persona)
	 *
	 */
	CuentaCorriente(int p_nroCuenta, Persona p_titular) {
		this.setLimiteDescubierto(500);
		this.setSaldo(0);
		this.setTitular(p_titular);
		this.setNroCuenta(p_nroCuenta);
	}

	/**
	 * Construye una nueva cuenta corriente con un número de cuenta,
	 * un titular y un saldo inicial.
	 *
	 * @param p_nroCuenta número de cuenta
	 * @param p_titular   titular de la cuenta(de tipo Persona)
	 * @param p_saldo     saldo inicial
	 *
	 */
	CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
		this.setLimiteDescubierto(500);
		this.setSaldo(p_saldo);
		this.setTitular(p_titular);
		this.setNroCuenta(p_nroCuenta);
	}

	/**
	 * Obtiene el número de cuenta.
	 *
	 * @return número de cuenta
	 *
	 */
	public int getNroCuenta() {
		return nroCuenta;
	}

	/**
	 * Establece el número de cuenta.
	 *
	 * @param nroCuenta número de cuenta
	 *
	 */
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	/**
	 * Obtiene el saldo de la cuenta.
	 *
	 * @return saldo de la cuenta
	 *
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la cuenta.
	 *
	 * @param saldo saldo de la cuenta
	 *
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene el límite de descubierto.
	 *
	 * @return límite de descubierto
	 *
	 */
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}


	/**
	 * Establece el límite de descubierto.
	 *
	 * @param limiteDescubierto límite de descubierto
	 *
	 */
	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

	/**
	 * Obtiene el titular de la cuenta.
	 *
	 * @return titular de la cuenta (de tipo Persona)
	 *
	 */
	public Persona getTitular() {
		return titular;
	}

	/**
	 * Establece el titular de la cuenta.
	 *
	 * @param titular titular de la cuenta (de tipo Persona)
	 *
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	/**
	 * Evalúa si se puede extraer un importe dado.
	 * Se puede extraer si el importe es menor o igual al saldo
	 * más el límite de descubierto.
	 *
	 * @param p_importe importe a extraer
	 * @return true si se puede extraer, false en caso contrario
	 *
	 */
	private boolean puedeExtraer(double p_importe) {
		return (this.getSaldo() + this.getLimiteDescubierto() >= p_importe);
	}

	/**
	 * Realiza la extracción de un importe dado.
	 *
	 * @param p_importe importe a extraer
	 *
	 */
	private void extraccion(double p_importe) {
		this.setSaldo(this.getSaldo() - p_importe);
	}

	/**
	 * Realiza la extracción de un importe dado si es posible.
	 * Si no es posible, muestra un mensaje de error.
	 *
	 * @param p_importe importe a extraer
	 *
	 */
	public void extraer(double p_importe) {
		if (puedeExtraer(p_importe)) {
			this.extraccion(p_importe);
		} else {
			System.out.println("El importe de extracción sobrepasa el límite de descubierto!");
		}
	}

	/**
	 * Realiza un depósito de un importe dado.
	 *
	 * @param p_importe importe a depositar
	 *
	 */
	public void depositar(double p_importe) {
		this.setSaldo(this.getSaldo() + p_importe);

	}

	/**
	 * Muestra por pantalla los datos de la cuenta corriente.
	 *
	 */
	public void mostrar() {
		System.out.println("-\tCuenta Corriente\t-");
		System.out.println(
				"Nro. Cuenta: " +
						this.getNroCuenta() +
						"\t-\tSaldo: " +
						this.getSaldo()
		);
		System.out.println("Titular: " + this.getTitular().nomYApe());
		System.out.println("Descubierto: " + this.getLimiteDescubierto());
	}
}
