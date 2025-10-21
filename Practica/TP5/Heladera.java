/**
 * TP 5 - Act 8
 * Representa un artefacto de tipo Heladera.
 * Agrega un adicional si tiene compresor.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Heladera extends ArtefactoHogar {
    private int pies;
    private int puertas;
    private boolean compresor;

    /**
     * Constructor de Heladera.
     *
     * @param p_pies      Cantidad de pies.
     * @param p_puertas   Cantidad de puertas.
     * @param p_compresor Si tiene compresor.
     * @param p_marca     Marca.
     * @param p_precio    Precio.
     * @param p_stock     Stock.
     */
    public Heladera(int p_pies, int p_puertas, boolean p_compresor, String p_marca, float p_precio, int p_stock) {
        super(p_marca, p_precio, p_stock);
        this.setCompresor(p_compresor);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
    }

    /**
     * Obtiene la cantidad de pies.
     * @return La cantidad de pies.
     */
    public int getPies() {
        return pies;
    }

    /**
     * Establece la cantidad de pies.
     * @param p_pies La cantidad de pies.
     */
    private void setPies(int p_pies) {
        this.pies = p_pies;
    }

    /**
     * Obtiene la cantidad de puertas.
     * @return La cantidad de puertas.
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * Establece la cantidad de puertas.
     * @param p_puertas La cantidad de puertas.
     */
    private void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }

    /**
     * Verifica si tiene compresor.
     * @return true si tiene compresor.
     */
    public boolean isCompresor() {
        return compresor;
    }

    /**
     * Establece si tiene compresor.
     * @param p_compresor true si tiene compresor.
     */
    private void setCompresor(boolean p_compresor) {
        this.compresor = p_compresor;
    }

    /**
     * Imprime los datos completos de la Heladera.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Compresor: " + (this.isCompresor() ? "Si" : "No"));
    }

    /**
     * Calcula la cuota con adicional.
     * Agrega $50 por cuota si tiene compresor.
     *
     * @param p_cuota   Cantidad de cuotas.
     * @param p_interes Tasa de interes.
     * @return El valor de la cuota con adicional (si aplica).
     */
    @Override
    public float creditoConAdicional(int p_cuota, float p_interes) {
        float cuotaBase = super.cuotaCredito(p_cuota, p_interes);
        return this.isCompresor() ? (cuotaBase + 50) : cuotaBase;
    }
}