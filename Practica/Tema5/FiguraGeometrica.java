/**
 * TP 5 - Act 7
 * Clase abstracta base para todas las figuras geometricas.
 * Define un punto de origen y un contrato para nombre y superficie.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public abstract class FiguraGeometrica {
    private Punto origen;

    /**
     * Constructor de la figura.
     * @param p_origen El punto de origen.
     */
    public FiguraGeometrica(Punto p_origen) {
        this.setOrigen(p_origen);
    }

    /**
     * Obtiene el punto de origen.
     * @return El punto de origen.
     */
    public Punto getOrigen() {
        return origen;
    }

    /**
     * Establece el punto de origen.
     * @param p_origen El punto de origen.
     */
    protected void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }

    /**
     * Metodo abstracto para obtener el nombre de la figura.
     * @return El nombre (ej: "Circulo").
     */
    abstract String nombreFigura();

    /**
     * Metodo abstracto para calcular la superficie.
     * @return La superficie.
     */
    abstract double superficie();

    /**
     * Muestra el nombre y la superficie de la figura.
     */
    public void mostrarSuperficie() {
        System.out.println("****** " + this.nombreFigura() + " ******");
        System.out.println("Superficie: " + this.superficie());
    }
}