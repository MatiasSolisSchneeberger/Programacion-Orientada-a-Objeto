/**
 * TP 5 - Act 6
 * Clase abstracta que generaliza las caracteristicas comunes
 * de una cuenta bancaria.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public abstract class Cuenta {
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
     * Constructor de Cuenta con saldo inicial.
     *
     * @param p_nroCuenta Numero de cuenta.
     * @param p_saldo     Saldo inicial.
     * @param p_titular   Titular (Persona).
     */
    Cuenta(int p_nroCuenta, double p_saldo, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
    }

    /**
     * Constructor de Cuenta sin saldo inicial (asume 0).
     *
     * @param p_nroCuenta Numero de cuenta.
     * @param p_titular   Titular (Persona).
     */
    Cuenta(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0); // Asigna 0 explicitamente
    }

    /**
     * Obtiene el numero de cuenta.
     *
     * @return El numero de cuenta.
     */
    public int getNroCuenta() {
        return nroCuenta;
    }

    /**
     * Establece el numero de cuenta.
     *
     * @param p_nroCuenta El numero de cuenta.
     */
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    /**
     * Obtiene el saldo actual.
     *
     * @return El saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo.
     * Protegido para que las subclases puedan modificarlo.
     *
     * @param p_saldo El nuevo saldo.
     */
    protected void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    /**
     * Obtiene el titular de la cuenta.
     *
     * @return El titular (Persona).
     */
    public Persona getTitular() {
        return titular;
    }

    /**
     * Establece el titular de la cuenta.
     *
     * @param p_titular El titular (Persona).
     */
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    // --- Metodos Abstractos ---

    /**
     * Verifica si se puede realizar la extraccion.
     *
     * @param p_importe Monto a extraer.
     * @return true si es posible, false si no.
     */
    abstract boolean puedeExtraer(double p_importe);

    /**
     * Metodo publico para iniciar una extraccion.
     * Contiene la logica de control (mensajes de error, etc.).
     *
     * @param p_importe Monto a extraer.
     */
    abstract void extraer(double p_importe);

    /**
     * Metodo interno que ejecuta la extraccion (actualiza saldos).
     *
     * @param p_importe Monto a extraer.
     */
    abstract void extraccion(double p_importe);

    /**
     * Muestra la informacion de la cuenta.
     */
    abstract void mostrar();

    /**
     * Aniade un importe al saldo.
     *
     * @param p_importe Monto a depositar.
     */
    abstract void depositar(double p_importe);
}