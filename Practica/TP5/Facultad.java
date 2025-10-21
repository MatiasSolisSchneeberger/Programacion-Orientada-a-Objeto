import java.util.ArrayList;

/**
 * TP 5 - Act 5
 * Representa una Facultad que gestiona una coleccion de Profesores.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Facultad {
    private String nombre;
    private ArrayList<Profesor> profesores;

    /**
     * Constructor para 1..* Profesores.
     *
     * @param p_nombre   Nombre de la facultad.
     * @param p_profesor El primer profesor (obligatorio).
     */
    Facultad(String p_nombre, Profesor p_profesor) {
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<>());
        this.agregarProfesor(p_profesor);
    }

    /**
     * Constructor para n Profesores.
     *
     * @param p_nombre     Nombre de la facultad.
     * @param p_profesores Lista de profesores existentes.
     */
    Facultad(String p_nombre, ArrayList<Profesor> p_profesores) {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    private void setProfesores(ArrayList<Profesor> p_profesores) {
        this.profesores = p_profesores;
    }

    /**
     * Agrega un profesor si no existe en la lista.
     *
     * @param p_profesor El profesor a agregar.
     * @return true si se agrego, false si ya existia.
     */
    public boolean agregarProfesor(Profesor p_profesor) {
        // Se asume que Profesor implementa .equals() (basado en DNI)
        // o que la comparacion de objetos es suficiente.
        if (!this.getProfesores().contains(p_profesor)) {
            this.getProfesores().add(p_profesor);
            return true;
        }
        return false;
    }

    /**
     * Elimina un profesor si existe y no es el ultimo.
     *
     * @param p_profesor El profesor a eliminar.
     * @return true si se elimino, false en caso contrario.
     */
    public boolean eliminarProfesor(Profesor p_profesor) {
        // Protege la multiplicidad 1..*
        if (this.getProfesores().contains(p_profesor)
                && this.getProfesores().size() > 1) {
            this.getProfesores().remove(p_profesor);
            return true;
        }
        return false;
    }

    /**
     * Muestra la nomina de profesores (formato contaduria).
     */
    public void nominaProfesores() {
        System.out.println("*************** Nomina Facultad: " + this.getNombre());
        System.out.println("------------------------------------------------------------------ ");
        for (Profesor profesor : this.getProfesores()) {
            System.out.println(profesor.mostrarLinea());
        }
        System.out.println("------------------------------------------------------------------ ");
        System.out.println("Total a pagar: " + this.totalAPagar());
    }

    /**
     * Calcula el monto total a pagar de sueldos.
     *
     * @return El total de sueldos.
     */
    public double totalAPagar() {
        double total = 0;
        for (Profesor profesor : this.getProfesores()) {
            total += profesor.sueldoTotal();
        }
        return total;
    }

    /**
     * Muestra el detalle completo de profesores y sus cargos.
     */
    public void listaProfesoresCargos() {
        System.out.println("***** Detalle de Profesores y cargos de Facultad: " + this.getNombre() + " *****");
        System.out.println("------------------------------------------------------------------ ");
        for (Profesor profesor : this.getProfesores()) {
            profesor.mostrar();
            System.out.println("****"); // Separador anadido
        }
    }
}