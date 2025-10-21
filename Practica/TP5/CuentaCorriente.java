/**
 * TP 3 - Act 7
 * TP 5 - Act 6
 * Esta clase representa una cuenta corriente bancaria.
 * Hereda de Cuenta y anade un limite de descubierto.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0.0
 */
public class CuentaCorriente extends Cuenta {

    private double limiteDescubierto;

    /**
     * Construye una nueva cuenta corriente con saldo inicial de 0.
     *
     * @param p_nroCuenta numero de cuenta
     * @param p_titular   titular de la cuenta (de tipo Persona)
     */
    CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500);
    }

    /**
     * Construye una nueva cuenta corriente con saldo inicial.
     *
     * @param p_nroCuenta numero de cuenta
     * @param p_titular   titular de la cuenta (de tipo Persona)
     * @param p_saldo     saldo inicial
     */
    CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_saldo, p_titular);
        this.setLimiteDescubierto(500);
    }

    /**
     * Obtiene el limite de descubierto.
     *
     * @return limite de descubierto
     */
    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    /**
     * Establece el limite de descubierto.
     *
     * @param p_limiteDescubierto limite de descubierto
     */
    private void setLimiteDescubierto(double p_limiteDescubierto) {
        this.limiteDescubierto = p_limiteDescubierto;
    }

    /**
     * Evalua si se puede extraer un importe dado.
     * (Saldo + Descubierto >= Importe).
     *
     * @param p_importe importe a extraer
     * @return true si se puede extraer, false en caso contrario
     */
    @Override
    boolean puedeExtraer(double p_importe) {
        return (this.getSaldo() + this.getLimiteDescubierto() >= p_importe);
    }

    /**
     * Realiza la extraccion de un importe dado (solo actualiza saldo).
     *
     * @param p_importe importe a extraer
     */
    @Override
    void extraccion(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
    }

    /**
     * Realiza la extraccion de un importe si es posible.
     * Si no es posible, muestra un mensaje de error.
     *
     * @param p_importe importe a extraer
     */
    @Override
    void extraer(double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            this.extraccion(p_importe);
        } else {
            System.out.println("El importe de extraccion sobrepasa el limite de descubierto!");
        }
    }

    /**
     * Realiza un deposito de un importe dado.
     *
     * @param p_importe importe a depositar
     */
    @Override
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }

    /**
     * Muestra por pantalla los datos de la cuenta corriente.
     */
    @Override
    void mostrar() {
        System.out.println("-\tCuenta Corriente\t-");
        System.out.println(
                "Nro. Cuenta: " +
                        this.getNroCuenta() +
                        "\t-\tSaldo: " +
                        this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}