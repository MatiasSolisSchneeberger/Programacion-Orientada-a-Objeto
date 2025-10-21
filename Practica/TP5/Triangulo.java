/**
 * TP 5 - Act 7
 * Representa una figura Triangulo.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Constructor de Triangulo en origen (0,0).
     * @param p_base   Base del triangulo.
     * @param p_altura Altura del triangulo.
     */
    public Triangulo(double p_base, double p_altura) {
        super(new Punto(0.0, 0.0));
        this.setAltura(p_altura);
        this.setBase(p_base);
    }

    /**
     * Constructor de Triangulo con origen.
     * @param p_base   Base del triangulo.
     * @param p_altura Altura del triangulo.
     * @param p_origen Punto de origen.
     */
    public Triangulo(double p_base, double p_altura, Punto p_origen) {
        super(p_origen);
        this.setAltura(p_altura);
        this.setBase(p_base);
    }

    /**
     * Obtiene la altura.
     * @return La altura.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura.
     * @param p_altura La altura.
     */
    private void setAltura(double p_altura) {
        this.altura = p_altura;
    }

    /**
     * Obtiene la base.
     * @return La base.
     */
    public double getBase() {
        return base;
    }

    /**
     * Establece la base.
     * @param p_base La base.
     */
    private void setBase(double p_base) {
        this.base = p_base;
    }

    /**
     * Devuelve el nombre de la figura.
     * @return "Triangulo"
     */
    @Override
    String nombreFigura() {
        return "Triangulo";
    }

    /**
     * Calcula la superficie (base * altura / 2).
     * @return La superficie.
     */
    @Override
    double superficie() {
        return (this.getBase() * this.getAltura()) / 2.0;
    }
}