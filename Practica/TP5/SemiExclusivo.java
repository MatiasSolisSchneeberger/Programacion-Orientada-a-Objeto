/**
 * TP 5 - Act 5
 * Representa un Cargo de tipo SemiExclusivo.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class SemiExclusivo extends Cargo {

    private int horasDeInvestigacion;

    /**
     * Constructor del Cargo SemiExclusivo.
     * El nombre del cargo se asigna "SemiExclusivo" automaticamente.
     *
     * @param p_sueldoBasico         Sueldo basico.
     * @param p_anioIngreso          Anio de ingreso.
     * @param p_horasDeDocencia      Horas de docencia.
     * @param p_horasDeInvestigacion Horas de investigacion.
     */
    SemiExclusivo(double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia, int p_horasDeInvestigacion) {
        super("SemiExclusivo", p_sueldoBasico, p_anioIngreso, p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
    }

    public int getHorasDeInvestigacion() {
        return horasDeInvestigacion;
    }

    private void setHorasDeInvestigacion(int p_horasDeInvestigacion) {
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }

    /**
     * Muestra los datos del cargo base y anade los especificos de SemiExclusivo.
     */
    @Override
    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("\t- Horas de Investigacion: " +
                this.getHorasDeInvestigacion());
    }
}