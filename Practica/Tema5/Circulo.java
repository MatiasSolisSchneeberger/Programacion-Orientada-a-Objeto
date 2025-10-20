/**
 * TP 3 - Act 3
 * TP 5 - Act 4
 * TP 5 - Act 7
 * Representa a un circulo en un plano cartesiano de dos dimensiones.
 * Es una especializacion de Elipse.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0.0
 */
public class Circulo extends Elipse {

    /**
     * Constructor de circulo, pasando un radio y un centro.
     * Llama al constructor de Elipse con ambos ejes iguales al radio.
     *
     * @param p_radio  radio del circulo
     * @param p_origen centro del circulo (Punto)
     */
    Circulo(double p_radio, Punto p_origen) {
        // Un circulo es una elipse con EjeMayor = EjeMenor = radio
        super(p_radio, p_radio, p_origen);
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return "Circulo"
     */
    @Override
    String nombreFigura() {
        return "Circulo";
    }

    /**
     * Muestra por pantalla las caracteristicas del circulo
     * Centro - Radio - Superficie - Perimetro
     */
    @Override
    public void caracteristicas() {
        System.out.println("****** " + this.nombreFigura() + " ******");
        System.out.println(
                "Centro: " + super.getOrigen().coordenadas() +
                        "\t- Radio: " + super.getsEjeMayor() // Usa el semieje heredado como radio
        );
        // CORRECCION: Acento
        System.out.println(
                "Superficie: " + super.superficie() +
                        "\t- Perimetro: " + this.perimetro());
    }

    /**
     * Devuelve el perimetro del circulo (2 * PI * radio).
     *
     * @return perimetro (double)
     */
    public double perimetro() {
        // radio es getsEjeMayor()
        return Math.PI * super.getsEjeMayor() * 2;
    }
}