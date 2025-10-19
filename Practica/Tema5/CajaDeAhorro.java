/**
 * TP 3 - Act 7
 * TP 5 - Act 6
 * Esta clase representa una caja de ahorro bancaria.
 * Hereda de Cuenta y anade un limite de extracciones.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0.0
 */
public class CajaDeAhorro extends Cuenta {
    private int extraccionesPosibles;

    /**
     * Construye una nueva caja de ahorro con saldo inicial.
     *
     * @param p_nroCuenta numero de cuenta
     * @param p_titular   titular de la cuenta (de tipo Persona)
     * @param p_saldo     saldo inicial
     */
    CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_saldo, p_titular);
        this.setExtraccionesPosibles(10);
    }

    /**
     * Construye una nueva caja de ahorro con saldo inicial de 0.
     *
     * @param p_nroCuenta numero de cuenta
     * @param p_titular   titular de la cuenta (de tipo Persona)
     */
    CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    }

    /**
     * Obtiene la cantidad de extracciones posibles restantes.
     *
     * @return cantidad de extracciones posibles
     */
    public int getExtraccionesPosibles() {
        return extraccionesPosibles;
    }

    /**
     * Establece la cantidad de extracciones posibles restantes.
     *
     * @param p_extraccionesPosibles nueva cantidad de extracciones posibles
     */
    private void setExtraccionesPosibles(int p_extraccionesPosibles) {
        this.extraccionesPosibles = p_extraccionesPosibles;
    }

    /**
     * Verifica si es posible realizar una extraccion.
     * (Saldo suficiente Y extracciones restantes).
     *
     * @param p_importe importe a extraer
     * @return true si se puede extraer, false en caso contrario
     */
    @Override
    boolean puedeExtraer(double p_importe) {
        return p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0;
    }

    /**
     * Realiza una extraccion si es posible.
     * Muestra un mensaje indicando la razon si no es posible.
     *
     * @param p_importe importe a extraer
     */
    @Override
    public void extraer(double p_importe) {
        if (!this.puedeExtraer(p_importe)) {
            if (this.getExtraccionesPosibles() <= 0) {
                System.out.println("No tiene habilitadas mas extracciones!");
            } else {
                System.out.println("No puede extraer mas que el saldo!");
            }
        } else {
            this.extraccion(p_importe);
        }
    }

    /**
     * Realiza la extraccion (actualiza saldo y contador).
     *
     * @param p_importe importe a extraer
     */
    @Override
    void extraccion(double p_importe) {
        super.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }

    /**
     * Realiza un deposito.
     *
     * @param p_importe importe a depositar
     */
    @Override
    void depositar(double p_importe) {
        super.setSaldo(this.getSaldo() + p_importe);
    }

    /**
     * Muestra los datos de la Caja de Ahorro.
     */
    @Override
    void mostrar() {
        System.out.println("-\tCaja de Ahorro\t-");
        System.out.println(
                "Nro. Cuenta: " + this.getNroCuenta() +
                        "\t-\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}