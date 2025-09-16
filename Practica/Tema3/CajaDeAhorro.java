/**
 * TP 3 - Act 7
 * Esta clase representa una caja de ahorro bancaria.
 * Cada caja de ahorro tiene un número de cuenta, un saldo,
 * un titular (de tipo Persona) y un número limitado de extracciones posibles.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class CajaDeAhorro {
	private int nroCuenta;
	private double saldo;
	private int extraccionesPosibles;
	private Persona titular;

	/**
	 * Construye una nueva caja de ahorro con un número de cuenta,
	 * un titular y un saldo inicial.
	 * La cantidad de extracciones posibles se inicializa en 10.
	 *
	 * @param p_nroCuenta número de cuenta
	 * @param p_titular   titular de la cuenta(de tipo Persona)
	 * @param p_saldo     saldo inicial
	 *
	 */
	CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo) {
		this.setNroCuenta(p_nroCuenta);
		this.setTitular(p_titular);
		this.setSaldo(p_saldo);
		this.setExtraccionesPosibles(10);
	}

	/**
	 * Construye una nueva caja de ahorro con un número de cuenta,
	 * un titular y un saldo inicial de 0.
	 * La cantidad de extracciones posibles se inicializa en 10.
	 *
	 * @param p_nroCuenta número de cuenta
	 * @param p_titular   titular de la cuenta(de tipo Persona)
	 *
	 */
	CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
		this.setNroCuenta(p_nroCuenta);
		this.setTitular(p_titular);
		this.setExtraccionesPosibles(10);
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
	 * Obtiene el saldo actual de la caja de ahorro.
	 *
	 * @return saldo actual
	 *
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la caja de ahorro.
	 *
	 * @param saldo nuevo saldo
	 *
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene la cantidad de extracciones posibles restantes.
	 *
	 * @return cantidad de extracciones posibles
	 *
	 */
	public int getExtraccionesPosibles() {
		return extraccionesPosibles;
	}

	/**
	 * Establece la cantidad de extracciones posibles restantes.
	 *
	 * @param extraccionesPosibles nueva cantidad de extracciones posibles
	 *
	 */
	public void setExtraccionesPosibles(int extraccionesPosibles) {
		this.extraccionesPosibles = extraccionesPosibles;
	}

	/**
	 * Obtiene el titular de la caja de ahorro.
	 *
	 * @return titular (de tipo Persona)
	 *
	 */
	public Persona getTitular() {
		return titular;
	}

	/**
	 * Establece el titular de la caja de ahorro.
	 *
	 * @param titular nuevo titular (de tipo Persona)
	 *
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	/**
	 * Verifica si es posible realizar una extracción
	 * del importe especificado.
	 * @param p_importe importe a extraer
	 * @return true si se puede extraer, false en caso contrario
	 */
	private boolean puedeExtraer(double p_importe) {
		return p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0;
	}

	/**
	 * Realiza una extracción del importe especificado
	 * si es posible. Si no es posible, muestra un mensaje
	 * indicando la razón (saldo insuficiente o
	 * extracciones agotadas).
	 * @param p_importe importe a extraer
	 */
	public void extraer(double p_importe) {
		if (!puedeExtraer(p_importe)) {
			if (this.getExtraccionesPosibles() == 0) {
				System.out.println("No tiene habilitadas más extracciones!");
			} else {
				System.out.println("No puede extraer más que el saldo!");
			}
		} else {
			extraccion(p_importe);
		}
	}

	/**
	 * Realiza la extracción del importe especificado.
	 * @param p_importe importe a extraer
	 */
	private void extraccion(double p_importe) {
		this.setSaldo(this.getSaldo() - p_importe);
		this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
	}

	public void depositar(double p_importe) {
		this.setSaldo(this.getSaldo() + p_importe);
	}

	public void mostrar() {
		System.out.println("-\tCaja de Ahorro\t-");
		System.out.println(
				"Nro. Cuenta: " + this.getNroCuenta() +
						"\t-\tSaldo: " + this.getSaldo()
		);
		System.out.println("Titular: " + this.getTitular().nomYApe());
		System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
	}


}
