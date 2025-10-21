import java.util.*;

/**
 * TP 5 - Act 10
 * Clase que representa un visitante individual del zoologico.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Individuo extends Visitante {
    private Persona persona;

    /**
     * Constructor de Individuo.
     * El nombre del visitante se toma del nombre de la persona.
     *
     * @param p_fechaVisita fecha de la visita
     * @param p_persona     objeto Persona asociado
     */
    public Individuo(Calendar p_fechaVisita, Persona p_persona) {
        super(p_persona.nomYApe(), p_fechaVisita);
        this.setPersona(p_persona);
    }

    /**
     * Establece la persona asociada.
     * @param p_persona La persona.
     */
    private void setPersona(Persona p_persona) {
        this.persona = p_persona;
    }

    /**
     * Obtiene la persona asociada.
     * @return La persona.
     */
    public Persona getPersona() {
        return this.persona;
    }

    /**
     * Retorna el tipo de visitante.
     *
     * @return "Individuo"
     */
    @Override
    public String tipoVisitante() {
        return "Individuo";
    }

    /**
     * Lista (muestra) el individuo si coincide con la fecha y/o tipo.
     * Si p_tipoVisitante es null, solo compara la fecha.
     *
     * @param p_fecha         fecha a consultar
     * @param p_tipoVisitante tipo de visitante a filtrar ("Individuo" o null)
     */
    @Override
    public void listarPorFecha(Calendar p_fecha, String p_tipoVisitante) {
        boolean mismaFecha = this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
                this.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH) &&
                this.getFechaVisita().get(Calendar.DAY_OF_MONTH) == p_fecha.get(Calendar.DAY_OF_MONTH);

        // Si el tipo es null O coincide con "Individuo"
        boolean mismoTipo = (p_tipoVisitante == null || this.tipoVisitante().equalsIgnoreCase(p_tipoVisitante));

        if (mismaFecha && mismoTipo) {
            this.mostrar();
        }
    }

    /**
     * Muestra los datos del individuo (delega a Persona.mostrar()).
     */
    @Override
    public void mostrar() {
        this.getPersona().mostrar();
    }

    /**
     * Calcula la entrada del individuo.
     *
     * @return 10.0 (costo fijo por individuo)
     */
    @Override
    public double entrada() {
        return 10.0;
    }

    /**
     * Retorna un HashSet que contiene unicamente a la persona del individuo.
     *
     * @return HashSet con la persona
     */
    @Override
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<Persona>();
        personas.add(this.getPersona());
        return personas;
    }
}