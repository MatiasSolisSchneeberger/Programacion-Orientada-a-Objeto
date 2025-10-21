import java.util.*;

/**
 * TP 5 - Act 10
 * Clase que representa una delegacion de visitantes del zoologico.
 * Contiene una coleccion de Individuos.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Delegacion extends Visitante {
    private ArrayList<Individuo> integrantes;

    /**
     * Constructor de Delegacion.
     *
     * @param p_nombre      nombre de la delegacion
     * @param p_fechaVisita fecha de la visita
     */
    public Delegacion(String p_nombre, Calendar p_fechaVisita) {
        super(p_nombre, p_fechaVisita);
        this.setIntegrantes(new ArrayList<Individuo>());
    }

    /**
     * Establece la lista de integrantes.
     * @param p_integrantes La lista.
     */
    private void setIntegrantes(ArrayList<Individuo> p_integrantes) {
        this.integrantes = p_integrantes;
    }

    /**
     * Obtiene la lista de integrantes.
     * @return La lista.
     */
    public ArrayList<Individuo> getIntegrantes() {
        return this.integrantes;
    }

    /**
     * Retorna el tipo de visitante.
     *
     * @return "Delegacion"
     */
    @Override
    public String tipoVisitante() {
        return "Delegacion";
    }

    /**
     * Inscribe un individuo a la delegacion si no esta ya inscrito.
     *
     * @param p_individuo individuo a inscribir
     * @return true si se inscribio correctamente, false si ya estaba inscrito
     */
    // CORRECCION: Nombre de metodo segun UML
    public boolean inscribirindividuo(Individuo p_individuo) {
        if (!this.estaInscripto(p_individuo)) {
            return this.getIntegrantes().add(p_individuo);
        }
        return false;
    }

    /**
     * Quita un integrante de la delegacion.
     * @param p_individuo El individuo a quitar.
     * @return true si se quito.
     */
    // CORRECCION: Nombre de metodo segun UML
    public boolean quitarIntegrante(Individuo p_individuo) {
        return this.getIntegrantes().remove(p_individuo);
    }

    /**
     * Retorna la cantidad de integrantes de la delegacion.
     *
     * @return cantidad de integrantes
     */
    // CORRECCION: Nombre de metodo segun UML
    public int cantidadIntegrantes() {
        return this.getIntegrantes().size();
    }

    /**
     * Muestra los datos de la delegacion y sus integrantes.
     */
    @Override
    public void mostrar() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Delegacion: " + this.getNombre());
        System.out.println("Integrantes:");
        if (this.getIntegrantes().isEmpty()) {
            System.out.println("(No hay integrantes registrados)");
        } else {
            for (Individuo individuo : this.getIntegrantes()) {
                individuo.mostrar(); // Llama al mostrar() de Individuo
                // System.out.println(); // Opcional: Salto de linea extra
            }
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadIntegrantes());
        System.out.println("-------------------------------------------------------------");
    }

    /**
     * Calcula la entrada de la delegacion (suma de integrantes con 10% descuento).
     *
     * @return costo total con descuento
     */
    @Override
    public double entrada() {
        double total = 0.0;
        for (Individuo individuo : this.getIntegrantes()) {
            total += individuo.entrada();
        }
        return total * 0.9; // Aplica 10% de descuento
    }

    /**
     * Lista (muestra) la delegacion si coincide con la fecha y/o tipo.
     * Si p_tipoVisitante es null, solo compara la fecha.
     *
     * @param p_fecha         fecha a consultar
     * @param p_tipoVisitante tipo de visitante a filtrar ("Delegacion" o null)
     */
    @Override
    public void listarPorFecha(Calendar p_fecha, String p_tipoVisitante) {
        boolean mismaFecha = this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
                this.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH) &&
                this.getFechaVisita().get(Calendar.DAY_OF_MONTH) == p_fecha.get(Calendar.DAY_OF_MONTH);

        boolean mismoTipo = (p_tipoVisitante == null || this.tipoVisitante().equalsIgnoreCase(p_tipoVisitante));

        if (mismaFecha && mismoTipo) {
            this.mostrar();
        }
    }

    /**
     * Retorna un HashSet con todas las personas (unicas) de la delegacion.
     *
     * @return HashSet con las personas
     */
    @Override
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<Persona>();
        for (Individuo individuo : this.getIntegrantes()) {
            personas.add(individuo.getPersona());
        }
        return personas;
    }

    // --- Metodos Auxiliares (no en UML, pero utiles) ---
    /**
     * Verifica si un individuo (basado en su DNI) ya esta inscripto.
     *
     * @param p_individuo individuo a verificar
     * @return true si esta inscripto, false en caso contrario
     */
    private boolean estaInscripto(Individuo p_individuo) {
        for (Individuo integrante : this.getIntegrantes()) {
            // Compara por DNI para evitar duplicados
            if (integrante.getPersona().getDNI() == p_individuo.getPersona().getDNI()) {
                return true;
            }
        }
        return false;
    }
}