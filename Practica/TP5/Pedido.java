import java.util.*;

/**
 * TP 5 - Act 11
 * Clase que representa un pedido que contiene varios renglones de etiquetas.
 * Calcula totales y muestra el detalle completo.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Pedido {
    private ArrayList<Renglon> renglones;

    /**
     * Constructor de Pedido sin renglones iniciales.
     */
    public Pedido() {
        this.setRenglones(new ArrayList<Renglon>());
    }

    /**
     * Constructor de Pedido con una lista inicial de renglones.
     *
     * @param p_renglones ArrayList de renglones
     */
    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }

    /**
     * Establece la lista de renglones.
     * @param p_renglones La lista.
     */
    private void setRenglones(ArrayList<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    /**
     * Obtiene la lista de renglones.
     * @return La lista.
     */
    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    /**
     * Agrega un renglon al pedido.
     *
     * @param p_renglon renglon a agregar
     * @return true si se agrego correctamente
     */
    public boolean agregarRenglon(Renglon p_renglon) {
        return this.getRenglones().add(p_renglon);
    }

    /**
     * Quita un renglon del pedido.
     *
     * @param p_renglon renglon a quitar
     * @return true si se quito correctamente
     */
    public boolean quitarRenglon(Renglon p_renglon) {
        return this.getRenglones().remove(p_renglon);
    }

    /**
     * Calcula la cantidad total de etiquetas sumando las de cada renglon.
     *
     * @return cantidad total de etiquetas
     */
    private int totalEtiquetas() {
        int total = 0;
        for (Renglon renglon : this.getRenglones()) {
            total += renglon.getCantidad();
        }
        return total;
    }

    /**
     * Calcula el importe total del pedido sumando el precio de cada renglon.
     *
     * @return importe total
     */
    private double totalPedido() {
        double total = 0.0;
        for (Renglon renglon : this.getRenglones()) {
            total += renglon.precio(); // Llama al precio() del renglon
        }
        return total;
    }

    /**
     * Muestra el pedido completo.
     */
    public void mostrar() {
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());

        int itemNum = 1;
        for (Renglon renglon : this.getRenglones()) {
            System.out.print("Item " + itemNum + ": ");
            // Llama al mostrar() del renglon, que ya tiene el formato correcto
            renglon.mostrar();
            itemNum++;
        }

        System.out.println("--- Total pedido: " + this.totalEtiquetas() +
                " Etiquetas por un importe total de: $ " + this.totalPedido());
    }
}