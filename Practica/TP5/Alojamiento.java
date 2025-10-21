import java.util.ArrayList;

/**
 * TP 5 - Act 9
 * Representa un Alojamiento generico (abstracto) dentro de la cadena hotelera,
 * gestionando los datos base y la lista de servicios contratados.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public abstract class Alojamiento {
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;

    /**
     * Constructor para un nuevo Alojamiento.
     * Inicializa los datos basicos y la coleccion de servicios vacia.
     *
     * @param p_nombre       Nombre del alojamiento
     * @param p_precioBase   Precio por dia, sin servicios.
     * @param p_diasAlquiler Cantidad de dias de la estadia.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<>());
    }

    /**
     * Constructor para un nuevo Alojamiento.
     *
     * @param p_nombre       Nombre del alojamiento
     * @param p_precioBase   Precio por dia, sin servicios.
     * @param p_diasAlquiler Cantidad de dias de la estadia.
     * @param p_servicios    Array de los servicios
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(p_servicios);
    }

    /**
     * Obtiene el nombre del alojamiento.
     *
     * @return El nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alojamiento.
     *
     * @param p_nombre El nombre.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Obtiene el precio base por dia.
     *
     * @return El precio base.
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Establece el precio base por dia.
     *
     * @param p_precioBase El precio base.
     */
    private void setPrecioBase(double p_precioBase) {
        this.precioBase = p_precioBase;
    }

    /**
     * Obtiene los dias de alquiler.
     *
     * @return Los dias de alquiler.
     */
    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    /**
     * Establece los dias de alquiler.
     *
     * @param p_diasAlquiler Los dias de alquiler.
     */
    private void setDiasAlquiler(int p_diasAlquiler) {
        this.diasAlquiler = p_diasAlquiler;
    }

    /**
     * Obtiene la lista de servicios contratados.
     *
     * @return Un ArrayList de Servicios.
     */
    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    /**
     * Establece la lista de servicios.
     *
     * @param p_servicios El ArrayList de Servicios.
     */
    public void setServicios(ArrayList<Servicio> p_servicios) {
        this.servicios = p_servicios;
    }

    /**
     * Agrega un nuevo servicio a la lista del alojamiento.
     *
     * @param p_servicio El Servicio a agregar.
     * @return true si se agrego exitosamente.
     */
    public boolean agregarServicio(Servicio p_servicio) {
        return this.getServicios().add(p_servicio);
    }

    /**
     * Quita un servicio de la lista del alojamiento.
     *
     * @param p_servicio El Servicio a quitar.
     * @return true si se quito exitosamente.
     */
    public boolean quitarServicio(Servicio p_servicio) {
        return this.getServicios().remove(p_servicio);
    }

    /**
     * Metodo abstracto para contar alojamientos por tipo.
     *
     * @param p_alojamiento El tipo de alojamiento a contar (ej: "Hotel" o "Cabana").
     * @return 1 si coincide, 0 si no.
     */
    public abstract int contar(String p_alojamiento);

    /**
     * Metodo abstracto para calcular el costo total del alojamiento.
     *
     * @return El costo total del alojamiento (incluyendo extras).
     */
    public abstract double costo();

    /**
     * Imprime por pantalla la lista de servicios contratados y sus precios.
     * Formato: [descripcion]: $[precio]
     */
    public void listarServicios() {
        for (Servicio s : this.getServicios()) {
            System.out.println(s.getDescripcion() + ": $" + s.getPrecio());
        }
    }

    /**
     * Calcula la suma total del costo de todos los servicios contratados.
     *
     * @return El costo total de los servicios.
     */
    public double costoServicios() {
        double total = 0.0;
        for (Servicio s : this.getServicios()) {
            total += s.getPrecio();
        }
        return total;
    }

    /**
     * Metodo abstracto para imprimir la liquidacion final.
     */
    public abstract void liquidar();
}