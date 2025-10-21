/**
 * TP 5 - Act 9
 * Representa un servicio extra que puede ser contratado en un alojamiento.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Servicio {
    private String descripcion;
    private double precio;

    /**
     * Constructor para un nuevo Servicio.
     *
     * @param p_descripcion Descripcion (ej: "Alquiler Auto")
     * @param p_precio      Costo del servicio
     */
    public Servicio(String p_descripcion, double p_precio) {
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }

    /**
     * Obtiene la descripcion del servicio.
     *
     * @return La descripcion del servicio.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcion del servicio.
     *
     * @param p_descripcion La descripcion del servicio.
     */
    public void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }

    /**
     * Obtiene el precio del servicio.
     *
     * @return El precio del servicio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del servicio.
     *
     * @param p_precio El precio del servicio.
     */
    public void setPrecio(double p_precio) {
        this.precio = p_precio;
    }
}