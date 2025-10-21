import java.util.ArrayList;

/**
 * TP 5 - Act 9
 * Gestiona una coleccion de alojamientos alquilados (Hoteles y Cabañas).
 * Permite agregar, quitar, contar por tipo y mostrar la liquidacion total.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Gerencia {
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

    /**
     * Constructor para 0..* alojamientos.
     *
     * @param p_nombre Nombre de la gerencia.
     */
    public Gerencia(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<>());
    }

    /**
     * Constructor para n alojamientos.
     *
     * @param p_nombre       Nombre de la gerencia.
     * @param p_alojamientos Lista de alojamientos ya alquilados.
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientos);
    }

    /**
     * Obtiene el nombre de la gerencia.
     * @return El nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la gerencia.
     * @param p_nombre El nombre.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene la lista de alojamientos alquilados.
     * @return Un ArrayList de Alojamiento.
     */
    public ArrayList<Alojamiento> getAlojamientosAlquilados() {
        return alojamientosAlquilados;
    }

    /**
     * Establece la lista de alojamientos alquilados.
     * @param p_alojamientos El ArrayList de Alojamiento.
     */
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientos) {
        this.alojamientosAlquilados = p_alojamientos;
    }

    /**
     * Agrega un nuevo alojamiento a la lista de alquilados.
     *
     * @param p_alojamiento El Alojamiento a agregar.
     * @return true si se agrego exitosamente.
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }

    /**
     * Quita un alojamiento de la lista de alquilados.
     *
     * @param p_alojamiento El Alojamiento a quitar.
     * @return true si se quito exitosamente.
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento) {
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }

    /**
     * Cuenta la cantidad de alojamientos de un tipo especifico.
     *
     * @param p_tipoAlojamiento El tipo a contar (ej: "Hotel" o "Cabaña").
     * @return La cantidad total de alojamientos de ese tipo.
     */
    public int contarAlojamiento(String p_tipoAlojamiento) {
        int total = 0;
        for (Alojamiento aloja : this.getAlojamientosAlquilados()) {
            total += aloja.contar(p_tipoAlojamiento);
        }
        return total;
    }

    /**
     *
     * La logica real esta en mostrarLiquidacion().
     */
    public void liquidar() {
        this.mostrarLiquidacion();
    }

    /**
     * Imprime la liquidacion completa de todos los alojamientos registrados.
     * Itera sobre cada alojamiento y llama a su metodo 'liquidar()'.
     * Finalmente, muestra el recuento total por tipo.
     */
    public void mostrarLiquidacion() {
        System.out.println("\nGerencia " + this.getNombre());
        System.out.println("Liquidacion --------------------");

        for (Alojamiento aloja : this.getAlojamientosAlquilados()) {
            aloja.liquidar(); // Llama al liquidar() de Cabaña o Hotel
            System.out.println("------------------------------"); // Separador
        }


        System.out.println("\nAlojamiento tipo Cabaña ---->" +
                this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ------>" +
                this.contarAlojamiento("Hotel"));
    }
}