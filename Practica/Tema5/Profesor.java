import java.util.ArrayList;

/**
 * TP 5 - Act 5
 * Representa un Profesor, que es una Persona y tiene Cargos.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Profesor extends Persona {
    private String titulo;
    private ArrayList<Cargo> cargos;

    /**
     * Constructor para n Cargos.
     *
     * @param p_nroDNI         DNI
     * @param p_nombre         Nombre
     * @param p_apellido       Apellido
     * @param p_anioNacimiento Anio de Nacimiento
     * @param p_titulo         Titulo del profesor
     * @param p_cargos         Lista de cargos (debe tener 1 a 3)
     */
    Profesor(int p_nroDNI,
             String p_nombre,
             String p_apellido,
             int p_anioNacimiento,
             String p_titulo,
             ArrayList<Cargo> p_cargos) {
        super(p_nroDNI,
                p_nombre,
                p_apellido,
                p_anioNacimiento);

        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }

    /**
     * Constructor para 1..* Cargos.
     *
     * @param p_nroDNI         DNI
     * @param p_nombre         Nombre
     * @param p_apellido       Apellido
     * @param p_anioNacimiento Anio de Nacimiento
     * @param p_titulo         Titulo del profesor
     * @param p_cargo          El primer cargo (obligatorio)
     */
    Profesor(int p_nroDNI,
             String p_nombre,
             String p_apellido,
             int p_anioNacimiento,
             String p_titulo,
             Cargo p_cargo // Parametro renombrado
    ) {
        super(p_nroDNI,
                p_nombre,
                p_apellido,
                p_anioNacimiento);

        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<>());
        this.agregarCargo(p_cargo);
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String p_titulo) {
        this.titulo = p_titulo;
    }

    public ArrayList<Cargo> getCargos() {
        return cargos;
    }

    private void setCargos(ArrayList<Cargo> p_cargos) {
        this.cargos = p_cargos;
    }

    /**
     * Agrega un cargo si el profesor tiene menos de 3.
     *
     * @param p_cargo El cargo a agregar.
     * @return true si se agrego.
     */
    public boolean agregarCargo(Cargo p_cargo) {
        if (this.getCargos().size() < 3) {
            return this.getCargos().add(p_cargo);
        }
        return false;
    }

    /**
     * Elimina un cargo si el profesor tiene mas de 1.
     *
     * @param p_cargo El cargo a eliminar.
     * @return true si se elimino.
     */
    public boolean eliminarCargo(Cargo p_cargo) {
        // Protege la multiplicidad 1..3
        if (this.getCargos().size() > 1) {
            return this.getCargos().remove(p_cargo);
        }
        return false;
    }

    /**
     * Calcula el sueldo total sumando el sueldo de todos los cargos.
     *
     * @return El sueldo total.
     */
    public double sueldoTotal() {
        double total = 0;
        for (Cargo cargo : this.getCargos()) {
            total += cargo.sueldoDelCargo();
        }
        return total;
    }

    /**
     * Lista (imprime) todos los cargos del profesor.
     */
    public void listarCargos() {
        for (Cargo cargo : this.getCargos()) {
            cargo.mostrarCargo();
        }
    }

    /**
     * Devuelve una linea formateada para la nomina.
     *
     * @return String de dos lineas (DNI \n Nombre y Sueldo)
     */
    public String mostrarLinea() {
        // CORRECCION: Formato del PDF es en dos lineas.
        return "DNI: " + this.getDNI() + "\n" +
                "Nombre: " + this.getNombre() + " " + this.getApellido() +
                " - Sueldo Total: " + this.sueldoTotal();
    }

    /**
     * Muestra la informacion completa del profesor (Persona + Profesor).
     */
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("-***** Cargos Asignados *****- ");
        System.out.println("------------------------------ ");
        this.listarCargos();
        System.out.println("** Sueldo Total: " + this.sueldoTotal());
    }
}