import java.util.ArrayList;

/**
 * TP 5 - Act 7
 * Representa un Jardin que contiene una coleccion de figuras geometricas.
 * Calcula la pintura necesaria para cubrir la superficie total.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Jardin {
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;

    /**
     * Constructor con lista de figuras.
     *
     * @param p_nombre  Nombre del jardin.
     * @param p_figuras Lista de figuras existente.
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras) {
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }

    /**
     * Constructor con lista vacia.
     *
     * @param p_nombre Nombre del jardin.
     */
    public Jardin(String p_nombre) {
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<>());
    }

    /**
     * Obtiene el nombre del jardin.
     * @return El nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jardin.
     * @param p_nombre El nombre.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene la lista de figuras.
     * @return La lista de figuras.
     */
    public ArrayList<FiguraGeometrica> getFiguras() {
        return figuras;
    }

    /**
     * Establece la lista de figuras.
     * @param p_figuras La lista de figuras.
     */
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras) {
        this.figuras = p_figuras;
    }

    /**
     * Agrega una figura a la coleccion.
     *
     * @param p_FiguraGeometrica La figura a agregar.
     * @return true si se agrego.
     */
    public boolean agregarFigura(FiguraGeometrica p_FiguraGeometrica) {
        return this.getFiguras().add(p_FiguraGeometrica);
    }

    /**
     * Elimina una figura de la coleccion.
     *
     * @param p_FiguraGeometrica La figura a eliminar.
     * @return true si se elimino.
     */
    public boolean eliminarFigura(FiguraGeometrica p_FiguraGeometrica) {
        return this.getFiguras().remove(p_FiguraGeometrica);
    }

    /**
     * Calcula cuantos litros de pintura se necesitan (4L cada 20m2).
     * @return Total de litros.
     */
    private double cuantosLitros() {
        double totalLitros = 0.0;
        for (FiguraGeometrica figuraGeometrica : this.getFiguras()) {
            // Regla: 4L por cada 20m2 ( ( superficie * 4 ) / 20 )
            totalLitros += (figuraGeometrica.superficie() * 4) / 20;
        }
        return totalLitros;
    }

    /**
     * Calcula cuantas latas de 4L se deben comprar (redondeo hacia arriba).
     * @return Total de latas.
     */
    public int cuantasLatas() {
        // Se divide el total de litros por 4 (capacidad de la lata)
        return (int) Math.ceil(this.cuantosLitros() / 4);
    }

    /**
     * Calcula la superficie total (m2) a cubrir.
     * @return Total de metros cuadrados.
     */
    public double cuantosMetros() {
        double totalMetros = 0.0;
        for (FiguraGeometrica figuraGeometrica : this.getFiguras()) {
            totalMetros += figuraGeometrica.superficie();
        }
        return totalMetros;
    }

    /**
     * Muestra el presupuesto detallado con figuras, total de m2 y latas.
     */
    public void detalleFiguras() {
        System.out.println("Presupuesto: " +
                this.getNombre());
        for (FiguraGeometrica figuraGeometrica : this.getFiguras()) {
            figuraGeometrica.mostrarSuperficie();
        }
        System.out.println("---------------------------------");
        System.out.println("Total a cubrir: " + this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
    }
}