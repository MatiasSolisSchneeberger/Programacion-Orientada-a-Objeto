/**
 * TP 5 - Act 9
 * Representa un Alojamiento de tipo Cabaña.
 * Calcula el costo agregando un adicional por habitacion.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Cabania extends Alojamiento {
    private int nroHabitaciones;

    /**
     * Constructor para una nueva Cabaña.
     *
     * @param p_nombre          Nombre de la cabana (ej: "Cabañas La Alondra")
     * @param p_precioBase      Precio por dia.
     * @param p_diasAlquiler    Cantidad de dias de estadia.
     * @param p_nroHabitaciones Numero de habitaciones de la cabana.
     */
    public Cabania(String p_nombre, double p_precioBase, int p_diasAlquiler, int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    /**
     * Obtiene el numero de habitaciones.
     * @return El numero de habitaciones.
     */
    public int getNroHabitaciones() {
        return nroHabitaciones;
    }

    /**
     * Establece el numero de habitaciones.
     * @param p_nroHabitaciones El numero de habitaciones.
     */
    private void setNroHabitaciones(int p_nroHabitaciones) {
        this.nroHabitaciones = p_nroHabitaciones;
    }

    /**
     * Calcula el costo total de la estadia en la cabana.
     * Incluye el costo base, el costo de servicios y un adicional de
     * $30 por dia por cada habitacion.
     *
     * @return El costo total.
     */
    @Override
    public double costo() {
        double costoBase = this.getPrecioBase() * this.getDiasAlquiler();
        double adicionalHabitaciones = (30 * this.getNroHabitaciones()) * this.getDiasAlquiler();
        double costoServicios = this.costoServicios();

        return costoBase + adicionalHabitaciones + costoServicios;
    }

    /**
     * Compara el tipo de alojamiento solicitado.
     * Retorna 1 si el tipo es "Cabaña".
     *
     * @param p_alojamiento El tipo de alojamiento a contar (ej: "Cabaña").
     * @return 1 si coincide, 0 si no.
     */
    @Override
    public int contar(String p_alojamiento) {
        if (p_alojamiento.equalsIgnoreCase("Cabaña")) {
            return 1;
        }
        return 0;
    }

    /**
     * Imprime la liquidacion detallada de la estadia en la cabana.
     */
    @Override
    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        double costoBaseAlojamiento = this.getPrecioBase() * this.getDiasAlquiler();
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + costoBaseAlojamiento);
        this.listarServicios();
        System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: ------> $" + this.costo());
    }
}