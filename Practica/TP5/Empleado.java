import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TP 3 - Act 11
 * TP 5 - Act 2
 *
 * @author Matias Solis Schneeberger
 * @version 2.0.1
 */
public class Empleado extends Persona {
    private final Calendar calendario = new GregorianCalendar();
    private final int anioActual = calendario.get(Calendar.YEAR);

    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    /**
     * Constructor de la clase Empleado.
     *
     * @param p_cuil           cuil del empleado
     * @param p_apellido       apellido del empleado
     * @param p_nombre         nombre del empleado
     * @param p_sueldoBasico   sueldo basico del empleado
     * @param p_anioIngreso    anio de ingreso del empleado
     * @param p_anioNacimiento anio de nacimiento del empleado
     * @param p_nroDNI         numero de documento del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso, int p_nroDNI, int p_anioNacimiento) {
        super(p_nroDNI, p_nombre, p_apellido, p_anioNacimiento);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
    }

    /**
     * Constructor de la clase Empleado.
     *
     * @param p_cuil           cuil del empleado
     * @param p_apellido       apellido del empleado
     * @param p_nombre         nombre del empleado
     * @param p_sueldoBasico   sueldo basico del empleado
     * @param p_fechaIngreso   fecha de ingreso del empleado
     * @param p_anioNacimiento anio de nacimiento del empleado
     * @param p_nroDNI         numero de documento del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fechaIngreso, int p_nroDNI, int p_anioNacimiento) {
        super(p_nroDNI, p_nombre, p_apellido, p_anioNacimiento);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fechaIngreso);
    }

    /**
     * Constructor de la clase Empleado.
     *
     * @param p_cuil            cuil del empleado
     * @param p_apellido        apellido del empleado
     * @param p_nombre          nombre del empleado
     * @param p_sueldoBasico    sueldo basico del empleado
     * @param p_anioIngreso     anio de ingreso del empleado
     * @param p_fechaNacimiento fecha de nacimiento del empleado
     * @param p_nroDNI          numero de documento del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso, int p_nroDNI, Calendar p_fechaNacimiento) {
        super(p_nroDNI, p_nombre, p_apellido, p_fechaNacimiento);

        this.setCuil(p_cuil);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
    }

    /**
     * Constructor de la clase Empleado.
     *
     * @param p_cuil            cuil del empleado
     * @param p_apellido        apellido del empleado
     * @param p_nombre          nombre del empleado
     * @param p_sueldoBasico    sueldo basico del empleado
     * @param p_fechaIngreso    fecha de ingreso del empleado
     * @param p_fechaNacimiento fecha de nacimiento del empleado
     * @param p_nroDNI          numero de documento del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fechaIngreso, int p_nroDNI, Calendar p_fechaNacimiento) {
        super(p_nroDNI, p_nombre, p_apellido, p_fechaNacimiento);

        this.setCuil(p_cuil);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fechaIngreso);
    }

    /**
     * Devuelve el CUIL del empleado.
     *
     * @return CUIL
     */
    public long getCuil() {
        return this.cuil;
    }

    /**
     * Cambia el CUIL del empleado.
     *
     * @param p_cuil nuevo CUIL
     */
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    /**
     * Devuelve el sueldo basico del empleado.
     *
     * @return sueldo basico
     */
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    /**
     * Cambia el sueldo basico del empleado.
     *
     * @param p_sueldoBasico nuevo sueldo basico
     */
    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    /**
     * Devuelve el anio de ingreso del empleado.
     *
     * @return anio de ingreso
     */
    public int getAnioIngreso() {
        return this.getFechaIngreso().get(Calendar.YEAR);
    }

    /**
     * Cambia el anio de ingreso del empleado.
     *
     * @param p_anioIngreso nuevo anio de ingreso
     */
    private void setAnioIngreso(int p_anioIngreso) {
        Calendar fechaIngreso = new GregorianCalendar();
        fechaIngreso.set(Calendar.YEAR, p_anioIngreso);
        fechaIngreso.set(Calendar.MONTH, Calendar.JANUARY);
        fechaIngreso.set(Calendar.DAY_OF_MONTH, 1);
        this.setFechaIngreso(fechaIngreso);
    }

    /**
     * Obtiene la fecha de ingreso del empleado.
     *
     * @return fecha de ingreso
     */
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    /**
     * Cambia la fecha de ingreso del empleado.
     *
     * @param p_fechaIngreso nueva fecha de ingreso
     */
    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }

    /**
     * Calcula la cantidad de anios que el empleado lleva en la empresa.
     *
     * @return antiguedad en anios
     */
    public int antiguedad() {
        return this.anioActual - this.getAnioIngreso();
    }



    /**
     * Calcula el descuento aplicado al sueldo.
     * El descuento es el 2% del sueldo basico mas un monto fijo de $1500.
     *
     * @return descuento total
     */
    private double descuento() {
        return this.getSueldoBasico() * 0.02 + 1500;
    }

    /**
     * Calcula el adicional al sueldo segun la antiguedad:
     * - Menos de 2 anios: 2%
     * - Entre 2 y 9 anios: 4%
     * - 10 anios o mas: 6%
     *
     * @return adicional segun antiguedad
     */
    private double adicional() {
        double adicional;
        if (antiguedad() < 2) {
            adicional = this.getSueldoBasico() * 0.02;
        } else if (antiguedad() < 10) {
            adicional = this.getSueldoBasico() * 0.04;
        } else {
            adicional = this.getSueldoBasico() * 0.06;
        }
        return adicional;
    }

    /**
     * Calcula el sueldo neto del empleado.
     * Sueldo basico + adicional - descuento.
     *
     * @return sueldo neto
     */
    public double sueldoNeto() {
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }

    /**
     * Muestra por consola los datos principales del empleado:
     * nombre, CUIL, antiguedad y sueldo neto.
     */
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.print("CUIL: " + this.getCuil());
        System.out.println("\tAntiguedad: " + this.antiguedad() + " anios de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }

    /**
     * Muestra los datos del empleado en una sola linea:
     * CUIL, nombre completo y sueldo neto.
     *
     * @return linea con datos resumidos
     */
    public String mostrarLinea() {
        return this.getCuil() + " " + super.nomYApe() + "........." + this.sueldoNeto();
    }

    /**
     * Evalua si hoy es el aniversario de ingreso del empleado.
     *
     * @return true si es el aniversario, false en caso contrario.
     */
    public boolean esAniversario() {
        Calendar hoy = new GregorianCalendar();
        return (hoy.get(Calendar.DAY_OF_YEAR) == this.getFechaIngreso().get(Calendar.DAY_OF_YEAR));
    }
}