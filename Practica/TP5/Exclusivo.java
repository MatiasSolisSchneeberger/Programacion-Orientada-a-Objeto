/**
 * TP 5 - Act 5
 * Representa un Cargo de tipo Exclusivo.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Exclusivo extends Cargo {
    private int horasDeInvestigacion;
    private int horasDeExtension;

    /**
     * Constructor del Cargo Exclusivo.
     * El nombre del cargo se asigna "Exclusivo" automaticamente.
     *
     * @param p_horasDeInvestigacion Horas de investigacion.
     * @param p_horasDeExtension     Horas de extension.
     * @param p_sueldoBasico         Sueldo basico.
     * @param p_anioIngreso          Anio de ingreso.
     * @param p_horasDeDocencia      Horas de docencia.
     */
    public Exclusivo(
            int p_horasDeInvestigacion,
            int p_horasDeExtension,
            double p_sueldoBasico,
            int p_anioIngreso,
            int p_horasDeDocencia) {
        super("Exclusivo", p_sueldoBasico, p_anioIngreso, p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
        this.setHorasDeExtension(p_horasDeExtension);
    }

    private void setHorasDeInvestigacion(int p_horasDeInvestigacion) {
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }

    private void setHorasDeExtension(int p_horasDeExtension) {
        this.horasDeExtension = p_horasDeExtension;
    }

    public int getHorasDeInvestigacion() {
        return this.horasDeInvestigacion;
    }

    public int getHorasDeExtension() {
        return this.horasDeExtension;
    }

    /**
     * Muestra los datos del cargo base y anade los especificos de Exclusivo.
     */
    @Override
    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas investigacion: " + this.getHorasDeInvestigacion());
        System.out.println("Horas extension: " + this.getHorasDeExtension());
    }
}