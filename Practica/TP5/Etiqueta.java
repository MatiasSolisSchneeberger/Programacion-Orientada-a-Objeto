/**
 * TP 5 - Act 11
 * Clase abstracta que representa una etiqueta base.
 * Define el costo y el contrato para calcular el precio y mostrarse.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public abstract class Etiqueta {
    private double costo;

    /**
     * Constructor de Etiqueta.
     *
     * @param p_costo costo base de la etiqueta
     */
    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }

    /**
     * Establece el costo base.
     * @param p_costo El costo base.
     */
    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    /**
     * Obtiene el costo base.
     * @return El costo base.
     */
    public double getCosto() {
        return this.costo;
    }

    /**
     * Metodo abstracto para calcular el precio final de una cantidad.
     *
     * @param p_cantidad cantidad de etiquetas
     * @return precio total
     */
    public abstract double precio(int p_cantidad);

    /**
     * Metodo abstracto para obtener la representacion en String.
     *
     * @return cadena con formato especifico segun tipo
     */
    @Override
    public abstract String toString();
}