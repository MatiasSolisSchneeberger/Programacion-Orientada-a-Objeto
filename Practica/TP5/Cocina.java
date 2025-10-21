/**
 * TP 5 - Act 8
 * Representa un artefacto de tipo Cocina.
 * No tiene calculos adicionales para el credito.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Cocina extends ArtefactoHogar {
    private int hornallas;
    private int calorias;
    private String dimensiones;

    /**
     * Constructor de Cocina.
     *
     * @param p_hornallas   Cantidad de hornallas.
     * @param p_calorias    Calorias.
     * @param p_dimensiones Dimensiones.
     * @param p_marca       Marca.
     * @param p_precio      Precio.
     * @param p_stock       Stock.
     */
    public Cocina(int p_hornallas, int p_calorias, String p_dimensiones, String p_marca, float p_precio, int p_stock) {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }

    /**
     * Obtiene las dimensiones.
     * @return Las dimensiones.
     */
    public String getDimensiones() {
        return dimensiones;
    }

    /**
     * Establece las dimensiones.
     * @param p_dimensiones Las dimensiones.
     */
    private void setDimensiones(String p_dimensiones) {
        this.dimensiones = p_dimensiones;
    }

    /**
     * Obtiene la cantidad de hornallas.
     * @return La cantidad de hornallas.
     */
    public int getHornallas() {
        return hornallas;
    }

    /**
     * Establece la cantidad de hornallas.
     * @param p_hornallas La cantidad de hornallas.
     */
    private void setHornallas(int p_hornallas) {
        this.hornallas = p_hornallas;
    }

    /**
     * Obtiene las calorias.
     * @return Las calorias.
     */
    public int getCalorias() {
        return calorias;
    }

    /**
     * Establece las calorias.
     * @param p_calorias Las calorias.
     */
    private void setCalorias(int p_calorias) {
        this.calorias = p_calorias;
    }

    /**
     * Calcula la cuota con adicional (ninguno para Cocina).
     *
     * @param p_cuota   Cantidad de cuotas.
     * @param p_interes Tasa de interes.
     * @return El valor de la cuota base.
     */
    @Override
    public float creditoConAdicional(int p_cuota, float p_interes) {
        return super.cuotaCredito(p_cuota, p_interes);
    }

    /**
     * Imprime los datos completos de la Cocina.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
    }
}