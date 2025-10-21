/**
 * TP 5 - Act 8
 * Clase abstracta base para un Artefacto del Hogar.
 * Define atributos y metodos comunes para calculo de creditos.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public abstract class ArtefactoHogar {
    private String marca;
    private float precio;
    private int stock;

    /**
     * Constructor de ArtefactoHogar.
     *
     * @param p_marca  Marca del artefacto.
     * @param p_precio Precio del artefacto.
     * @param p_stock  Stock disponible.
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock) {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    /**
     * Obtiene la marca.
     * @return La marca.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca.
     * @param p_marca La marca.
     */
    private void setMarca(String p_marca) {
        this.marca = p_marca;
    }

    /**
     * Obtiene el precio.
     * @return El precio.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio.
     * @param p_precio El precio.
     */
    private void setPrecio(float p_precio) {
        this.precio = p_precio;
    }

    /**
     * Obtiene el stock.
     * @return El stock.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock.
     * @param p_stock El stock.
     */
    private void setStock(int p_stock) {
        this.stock = p_stock;
    }

    /**
     * Imprime los datos comunes del artefacto.
     */
    public void imprimir() {
        // Formato segun el ejemplo del PDF
        System.out.println("Marca: " + this.getMarca() +
                " - Precio: " + this.getPrecio() +
                " - Stock: " + this.getStock());
    }

    /**
     * Calcula el valor de la cuota base (sin adicionales).
     * El interes es simple: (Precio + (Precio * (Tasa/100) * Cuotas)) / Cuotas
     *
     * @param p_cuota   Cantidad de cuotas.
     * @param p_interes Tasa de interes (ej: 2.53).
     * @return El valor de la cuota.
     */
    public float cuotaCredito(int p_cuota, float p_interes) {
        float interesTotal = this.getPrecio() * (p_interes / 100) * p_cuota;
        return (this.getPrecio() + interesTotal) / p_cuota;
    }

    /**
     * Metodo abstracto para calcular la cuota con adicionales.
     *
     * @param p_cuota   Cantidad de cuotas.
     * @param p_interes Tasa de interes.
     * @return El valor de la cuota con adicional.
     */
    abstract public float creditoConAdicional(int p_cuota, float p_interes);
}