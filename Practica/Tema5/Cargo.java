import java.util.Calendar;

/**
 * TP 5 - Act 5
 * Representa el cargo base de un Profesor.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Cargo {
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    public Cargo(String p_nombreCargo,
                 double p_sueldoBasico,
                 int p_anioIngreso,
                 int p_horasDeDocencia) {
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horasDeDocencia);
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    private void setNombreCargo(String p_nombreCargo) {
        this.nombreCargo = p_nombreCargo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    private void setAnioIngreso(int p_anioIngreso) {
        this.anioIngreso = p_anioIngreso;
    }

    public int getHorasDeDocencia() {
        return horasDeDocencia;
    }

    private void setHorasDeDocencia(int p_horasDeDocencia) {
        this.horasDeDocencia = p_horasDeDocencia;
    }

    /**
     * Calcula la antiguedad en anios.
     *
     * @return anios de antiguedad.
     */
    public int antiguedad() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.getAnioIngreso();
    }

    /**
     * Calcula el adicional por antiguedad (1% del basico por anio).
     *
     * @return monto del adicional.
     */
    private double adicionalXAntiguedad() {
        return (0.01 * this.antiguedad()) * this.getSueldoBasico();
    }

    /**
     * Calcula el sueldo final del cargo (basico + adicional).
     *
     * @return sueldo final.
     */
    public double sueldoDelCargo() {
        return this.adicionalXAntiguedad() + this.getSueldoBasico();
    }

    /**
     * Muestra la informacion del cargo.
     */
    public void mostrarCargo() {
        System.out.println(this.getNombreCargo() +
                "- Sueldo Basico: " + this.getSueldoBasico() +
                "- Sueldo del Cargo: " + this.sueldoDelCargo() +
                "- Antiguedad: " + this.antiguedad()
        );
        System.out.println("Horas Docencia: " + this.getHorasDeDocencia());
    }
}