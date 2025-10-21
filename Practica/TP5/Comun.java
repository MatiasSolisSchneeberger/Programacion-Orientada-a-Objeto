/**
 * TP 5 - Act 11
 * Clase que representa una etiqueta comun.
 * Aplica un plus por disenio y descuentos por cantidad.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Comun extends Etiqueta {
    private double plus;

    /**
     * Constructor de Comun.
     *
     * @param p_costo costo base de la etiqueta
     * @param p_plus  plus por disenio
     */
    // CORRECCION: Constructor publico
    public Comun(double p_costo, double p_plus) {
        super(p_costo);
        this.setPlus(p_plus);
    }

    /**
     * Establece el plus por disenio.
     * @param p_plus El plus.
     */
    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    /**
     * Obtiene el plus por disenio.
     * @return El plus.
     */
    public double getPlus() {
        return this.plus;
    }

    /**
     * Calcula el descuento por cantidad
     *
     * @param p_cantidad cantidad de etiquetas
     * @return porcentaje de descuento (como decimal, ej: 0.02 para 2%)
     */
    private double descuentoPorCantidad(int p_cantidad) {
        if (p_cantidad <= 10) { // 1 a 10
            return 0.0;
        } else if (p_cantidad <= 50) { // 11 a 50
            return 0.02;
        } else if (p_cantidad <= 100) { // 51 a 100
            return 0.05;
        } else {
            // +100: 1% cada 10 unidades completas
            return 0.01 * (p_cantidad / 10);
        }
    }

    /**
     * Calcula el precio de las etiquetas comunes.
     * (Costo * Cantidad * (1 - Descuento)) + Plus
     *
     * @param p_cantidad cantidad de etiquetas
     * @return precio total
     */
    @Override
    public double precio(int p_cantidad) {
        double costoTotal = this.getCosto() * p_cantidad;
        double descuento = this.descuentoPorCantidad(p_cantidad);
        double precioConDescuento = costoTotal * (1.0 - descuento);
        return precioConDescuento + this.getPlus();
    }

    /**
     * Retorna la representacion en String de la etiqueta comun.
     * Formato: "tipo Comun - Costo: $[costo] - Disenio: $[plus]"
     *
     * @return cadena con formato especifico
     */
    @Override
    public String toString() {
        return "tipo Comun - Costo: $" + this.getCosto() + " - Disenio: $" + this.getPlus();
    }
}