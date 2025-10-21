/**
 * TP 5 - Act 4
 * TP 5 - Act 7
 * Representa una figura Elipse en un plano cartesiano.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Elipse extends FiguraGeometrica {
    private double sEjeMayor;
    private double sEjeMenor;

    /**
     * Constructor de Elipse con origen.
     *
     * @param p_sEjeMayor Semieje mayor.
     * @param p_sEjeMenor Semieje menor.
     * @param p_origen    Punto de origen (centro).
     */
    Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_origen) {
        super(p_origen);
        this.setsEjeMayor(p_sEjeMayor);
        this.setsEjeMenor(p_sEjeMenor);
    }

    /**
     * Constructor de Elipse en origen (0,0).
     *
     * @param p_sEjeMayor Semieje mayor.
     * @param p_sEjeMenor Semieje menor.
     */
    Elipse(double p_sEjeMayor, double p_sEjeMenor) {
        super(new Punto(0.0, 0.0));
        this.setsEjeMayor(p_sEjeMayor);
        this.setsEjeMenor(p_sEjeMenor);
    }

    /**
     * Obtiene el semieje mayor.
     *
     * @return El semieje mayor.
     */
    public double getsEjeMayor() {
        return sEjeMayor;
    }

    /**
     * Establece el semieje mayor.
     *
     * @param p_sEjeMayor El semieje mayor.
     */
    private void setsEjeMayor(double p_sEjeMayor) {
        this.sEjeMayor = p_sEjeMayor;
    }

    /**
     * Obtiene el semieje menor.
     *
     * @return El semieje menor.
     */
    public double getsEjeMenor() {
        return sEjeMenor;
    }

    /**
     * Establece el semieje menor.
     *
     * @param p_sEjeMenor El semieje menor.
     */
    private void setsEjeMenor(double p_sEjeMenor) {
        this.sEjeMenor = p_sEjeMenor;
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return "Elipse"
     */
    @Override
    String nombreFigura() {
        return "Elipse";
    }

    /**
     * Muestra por pantalla las caracteristicas de la elipse.
     * Centro - Semiejes - Superficie.
     */
    public void caracteristicas() {
        System.out.println("****** " + this.nombreFigura() + " ******");
        System.out.println(
                "Centro: " + this.getOrigen().coordenadas() +
                        " - Semieje Mayor: " + this.getsEjeMayor() +
                        " - Semieje Menor: " + this.getsEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }

    /**
     * Devuelve la superficie de la elipse (PI * EjeMayor * EjeMenor).
     *
     * @return superficie (double).
     */
    @Override
    double superficie() {
        return Math.PI * (this.getsEjeMayor() * this.getsEjeMenor());
    }

    /**
     * Calcula la distancia entre el centro de esta elipse y otra.
     *
     * @param p_otraElipse La otra elipse.
     * @return distancia (double).
     */
    public double distanciaA(Elipse p_otraElipse) {
        return this.getOrigen().distanciaA(p_otraElipse.getOrigen());
    }

    /**
     * Devuelve la elipse de mayor superficie.
     *
     * @param p_otraElipse La otra elipse a comparar.
     * @return La elipse de mayor tamanio.
     */
    public Elipse elMayor(Elipse p_otraElipse) {
        if (this.superficie() > p_otraElipse.superficie()) {
            return this;
        } else {
            return p_otraElipse;
        }
    }
}