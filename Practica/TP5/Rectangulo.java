/**
 * TP 3 - Act 4
 * TP 5 - Act 3
 * TP 5 - Act 7
 * Representa un rectangulo en un plano cartesiano.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0.0
 */
public class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    /**
     * Constructor de Rectangulo con origen.
     *
     * @param p_origen Origen del rectangulo (Punto)
     * @param p_ancho  Ancho del rectangulo
     * @param p_alto   Alto del rectangulo
     */
    Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
        super(p_origen);
        this.setAlto(p_alto);
        this.setAncho(p_ancho);
    }

    /**
     * Constructor de Rectangulo en origen (0,0).
     *
     * @param p_ancho Ancho del rectangulo
     * @param p_alto  Alto del rectangulo
     */
    Rectangulo(double p_ancho, double p_alto) {
        super(new Punto(0.0, 0.0));
        this.setAlto(p_alto);
        this.setAncho(p_ancho);
    }

    /**
     * Obtiene el ancho.
     * @return El ancho.
     */
    public double getAncho() {
        return this.ancho;
    }

    /**
     * Establece el ancho.
     *
     * @param p_ancho Ancho del rectangulo
     */
    private void setAncho(double p_ancho) {
        this.ancho = p_ancho;
    }

    /**
     * Obtiene el alto.
     * @return El alto.
     */
    public double getAlto() {
        return this.alto;
    }

    /**
     * Establece el alto.
     *
     * @param p_alto Alto del rectangulo
     */
    private void setAlto(double p_alto) {
        this.alto = p_alto;
    }

    /**
     * Desplaza el rectangulo moviendo su punto de origen.
     *
     * @param p_dx Incremento en X
     * @param p_dy Incremento en Y
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setOrigen(new Punto(p_dx, p_dy));
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return "Rectangulo"
     */
    @Override
    String nombreFigura() {
        return "Rectangulo";
    }

    /**
     * Muestra las caracteristicas del rectangulo.
     */
    public void caracteristicas() {
        System.out.println("****** " + this.nombreFigura() + " ******");
        System.out.println("Centro: " + this.getOrigen().coordenadas() +
                "\t- Alto: " + this.getAlto() +
                "\t- Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() +
                "\t- Perimetro: " + this.perimetro());
    }

    /**
     * Calcula la superficie (ancho * alto).
     *
     * @return la superficie.
     */
    @Override
    public double superficie() {
        return this.getAncho() * this.getAlto();
    }

    /**
     * Calcula el perimetro (2*ancho + 2*alto).
     *
     * @return el perimetro.
     */
    public double perimetro() {
        return (this.getAncho() * 2) + (this.getAlto() * 2);
    }

    /**
     * Calcula la distancia al origen de otro rectangulo.
     *
     * @param p_otroRectangulo El otro rectangulo.
     * @return la distancia.
     */
    public double distanciaA(Rectangulo p_otroRectangulo) {
        return this.getOrigen().distanciaA(p_otroRectangulo.getOrigen());
    }

    /**
     * Devuelve el rectangulo con mayor superficie.
     *
     * @param p_otroRectangulo El otro rectangulo a comparar.
     * @return El rectangulo de mayor tamanio.
     */
    public Rectangulo elMayor(Rectangulo p_otroRectangulo) {
        if (this.superficie() > p_otroRectangulo.superficie()) {
            return this;
        } else {
            return p_otroRectangulo;
        }
    }
}