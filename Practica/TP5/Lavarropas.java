/**
 * TP 5 - Act 8
 * Representa un artefacto de tipo Lavarropas.
 * Aplica un descuento si no es automatico.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Lavarropas extends ArtefactoHogar {
    private int programas;
    private float kilos;
    private boolean automatico;

    /**
     * Constructor de Lavarropas.
     *
     * @param p_programas Cantidad de programas.
     * @param p_kilos     Capacidad en kilos.
     * @param p_automatico Si es automatico.
     * @param p_marca     Marca.
     * @param p_precio    Precio.
     * @param p_stock     Stock.
     */
    public Lavarropas(int p_programas, float p_kilos, boolean p_automatico, String p_marca, float p_precio, int p_stock) {
        super(p_marca, p_precio, p_stock);
        this.setAutomatico(p_automatico);
        this.setKilos(p_kilos);
        this.setProgramas(p_programas);
    }

    /**
     * Obtiene la cantidad de programas.
     * @return La cantidad de programas.
     */
    public int getProgramas() {
        return programas;
    }

    /**
     * Establece la cantidad de programas.
     * @param p_programas La cantidad de programas.
     */
    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    /**
     * Obtiene la capacidad en kilos.
     * @return La capacidad en kilos.
     */
    public float getKilos() {
        return kilos;
    }

    /**
     * Establece la capacidad en kilos.
     * @param p_kilos La capacidad en kilos.
     */
    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    /**
     * Verifica si es automatico.
     * @return true si es automatico.
     */
    public boolean isAutomatico() {
        return automatico;
    }

    /**
     * Establece si es automatico.
     * @param p_automatico true si es automatico.
     */
    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }

    /**
     * Imprime los datos completos del Lavarropas.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Lavarropas ****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        System.out.println("Automatico: " + (this.isAutomatico() ? "Si" : "No"));
    }

    /**
     * Calcula la cuota con adicional.
     * Aplica 2% de descuento si NO es automatico.
     *
     * @param p_cuota   Cantidad de cuotas.
     * @param p_interes Tasa de interes.
     * @return El valor de la cuota con descuento (si aplica).
     */
    @Override
    public float creditoConAdicional(int p_cuota, float p_interes) {
        float cuotaBase = super.cuotaCredito(p_cuota, p_interes);
        // Aplica descuento del 2% si NO es automatico
        return (!this.isAutomatico())
                ? (float) (cuotaBase - (cuotaBase * 0.02))
                : cuotaBase;
    }
}