/**
 * TP 5 - Act 11
 * Clase que representa un renglon (linea) dentro de un Pedido.
 * Contiene una cantidad y una referencia a una Etiqueta.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Renglon {
    private int cantidad;
    private Etiqueta item;

    /**
     * Constructor de Renglon.
     *
     * @param p_cantidad cantidad de etiquetas para este renglon
     * @param p_item     la etiqueta asociada a este renglon
     */
    public Renglon(int p_cantidad, Etiqueta p_item) {
        this.setCantidad(p_cantidad);
        this.setItem(p_item);
    }

    /**
     * Establece la cantidad.
     * @param p_cantidad La cantidad.
     */
    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }

    /**
     * Establece la etiqueta (item).
     * @param p_item La etiqueta.
     */
    private void setItem(Etiqueta p_item) {
        this.item = p_item;
    }

    /**
     * Obtiene la cantidad.
     * @return La cantidad.
     */
    public int getCantidad() {
        return this.cantidad;
    }

    /**
     * Obtiene la etiqueta (item).
     * @return La etiqueta.
     */
    public Etiqueta getItem() {
        return this.item;
    }

    /**
     * Calcula el precio total del renglon (delega a la etiqueta).
     *
     * @return precio total del renglon (cantidad * precio unitario calculado)
     */
    public double precio() {
        // Llama al metodo polimorfico precio() de Comun o Premium
        return this.getItem().precio(this.getCantidad());
    }

    /**
     * Muestra el renglon segun el formato del PDF .
     * Formato: [cantidad] Etiquetas de [toString de Etiqueta] \n Precio: $ [precio]
     */
    public void mostrar() {
        System.out.println(this.getCantidad() + " Etiquetas de " +
                this.getItem().toString()); // Llama al toString() polimorfico
        System.out.println("Precio: $ " + this.precio());
    }
}