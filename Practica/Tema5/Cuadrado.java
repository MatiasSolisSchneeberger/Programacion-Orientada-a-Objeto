/**
 * TP 5 - Act 3
 * TP 5 - Act 7
 * Representa un Cuadrado como un caso especial de Rectangulo.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Cuadrado extends Rectangulo {

    /**
     * Constructor de Cuadrado en origen (0,0).
     *
     * @param p_lado Lado del cuadrado (usado para alto y ancho).
     */
    public Cuadrado(double p_lado) {
        super(p_lado, p_lado);
    }

    /**
     * Constructor de Cuadrado con origen y lado.
     *
     * @param p_lado   El lado del cuadrado.
     * @param p_origen El punto de origen.
     */
    public Cuadrado(double p_lado, Punto p_origen) {
        super(p_origen, p_lado, p_lado);
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return "Cuadrado"
     */
    @Override
    String nombreFigura() {
        return "Cuadrado";
    }

    /**
     * Muestra las caracteristicas del cuadrado.
     */
    @Override
    public void caracteristicas() {
        System.out.println("****** " + this.nombreFigura() + " ******");
        System.out.println("Origen: " + this.getOrigen().coordenadas() +
                " - Lado: " + this.getAlto()); // Lado se obtiene de getAlto()
        System.out.println("Superficie: " + this.superficie() +
                " Perimetro: " + this.perimetro());
    }
}