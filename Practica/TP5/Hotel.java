/**
 * TP 5 - Act 9
 * Representa un Alojamiento de tipo Hotel.
 * Calcula el costo agregando un adicional segun el tipo de habitacion ("Single" o "Doble").
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Hotel extends Alojamiento {
    private String tipoHabitacion;

    /**
     * Constructor para un nuevo Hotel.
     *
     * @param p_nombre         Nombre del hotel (ej: "Hotel Guarani")
     * @param p_precioBase     Precio por dia.
     * @param p_diasAlquiler   Cantidad de dias de estadia.
     * @param p_tipoHabitacion Tipo de habitacion ("Single" o "Doble").
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, String p_tipoHabitacion) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    /**
     * Obtiene el tipo de habitacion.
     * @return El tipo de habitacion (ej: "Single").
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Establece el tipo de habitacion.
     * @param p_tipoHabitacion El tipo de habitacion.
     */
    private void setTipoHabitacion(String p_tipoHabitacion) {
        this.tipoHabitacion = p_tipoHabitacion;
    }

    /**
     * Calcula el costo total de la estadia en el hotel.
     * Incluye el costo base, costo de servicios y un adicional por dia
     * de $20 si es "Single" o $35 si es "Doble".
     *
     * @return El costo total.
     */
    @Override
    public double costo() {
        double costoBase = this.getPrecioBase() * this.getDiasAlquiler();

        double adicionalTipo = 0.0;
        if (this.getTipoHabitacion().equalsIgnoreCase("Single")) {
            adicionalTipo = 20;
        } else if (this.getTipoHabitacion().equalsIgnoreCase("Doble")) {
            adicionalTipo = 35;
        }

        double costoAdicionalDiario = adicionalTipo * this.getDiasAlquiler();
        double costoServicios = this.costoServicios();

        return costoBase + costoAdicionalDiario + costoServicios;
    }

    /**
     * Compara el tipo de alojamiento solicitado.
     * Retorna 1 si el tipo es "Hotel".
     *
     * @param p_alojamiento El tipo de alojamiento a contar (ej: "Hotel").
     * @return 1 si coincide, 0 si no.
     */
    @Override
    public int contar(String p_alojamiento) {
        if (p_alojamiento.equalsIgnoreCase("Hotel")) {
            return 1;
        }
        return 0;
    }

    /**
     * Imprime la liquidacion detallada de la estadia en el hotel.
     */
    @Override
    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        double costoBaseAlojamiento = this.getPrecioBase() * this.getDiasAlquiler();
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + costoBaseAlojamiento);
        this.listarServicios();

        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("Total: ------> $" + this.costo());
    }
}