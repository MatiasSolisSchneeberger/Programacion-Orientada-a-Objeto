/**
 * TP 5 - Act 11
 * Clase que representa una etiqueta premium.
 * Aplica adicionales por cantidad de colores.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Premium extends Etiqueta {
    private int colores;

    /**
     * Constructor de Premium.
     *
     * @param p_costo   costo base de la etiqueta
     * @param p_colores cantidad de colores
     */
    // CORRECCION: Constructor publico
    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }

    /**
     * Establece la cantidad de colores.
     * @param p_colores La cantidad.
     */
    private void setColores(int p_colores) {
        this.colores = p_colores;
    }

    /**
     * Obtiene la cantidad de colores.
     * @return La cantidad.
     */
    public int getColores() {
        return this.colores;
    }

    /**
     * Calcula el adicional por color
     *
     * @return porcentaje adicional (como decimal, ej: 0.05 para 5%)
     */
    private double adicionalPorColor() {
        if (this.getColores() <= 1) { // 1 color
            return 0.0;
        } else if (this.getColores() == 2) { // 2 colores
            return 0.05;
        } else if (this.getColores() == 3) { // 3 colores
            return 0.07;
        } else {
            // +3 colores: 3% por cada color individual
            return 0.03 * this.getColores();
        }
    }

    /**
     * Calcula el precio de las etiquetas premium.
     * (Costo * (1 + AdicionalColor)) * Cantidad
     *
     * @param p_cantidad cantidad de etiquetas
     * @return precio total
     */
    @Override
    public double precio(int p_cantidad) {
        double costoConAdicional = this.getCosto() * (1.0 + this.adicionalPorColor());
        return costoConAdicional * p_cantidad;
    }

    /**
     * Retorna la representacion en String de la etiqueta premium.
     * Formato: "tipo Premiun - Costo: $[costo] - Colores: [colores]"
     *
     * @return cadena con formato especifico
     */
    @Override
    public String toString() {
        return "tipo Premiun - Costo: $" + this.getCosto() + " - Colores: " + this.getColores();
    }
}