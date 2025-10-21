import java.util.*;

/**
 * TP 5 - Act 10
 * Clase abstracta que representa un visitante del zoologico.
 * Define la estructura comun para Individuos y Delegaciones.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public abstract class Visitante {
    private String nombre;
    private Calendar fechaVisita;

    /**
     * Constructor de Visitante.
     *
     * @param p_nombre      nombre del visitante (individuo o delegacion)
     * @param p_fechaVisita fecha de la visita
     */
    public Visitante(String p_nombre, Calendar p_fechaVisita) {
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fechaVisita);
    }

    /**
     * Establece el nombre del visitante.
     * @param p_nombre El nombre.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece la fecha de la visita.
     * @param p_fechaVisita La fecha.
     */
    private void setFechaVisita(Calendar p_fechaVisita) {
        this.fechaVisita = p_fechaVisita;
    }

    /**
     * Obtiene el nombre del visitante.
     * @return El nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la fecha de la visita.
     * @return La fecha.
     */
    public Calendar getFechaVisita() {
        return this.fechaVisita;
    }

    /**
     * Metodo abstracto para mostrar la informacion del visitante.
     */
    // CORRECCION: Este metodo es abstracto segun el UML (abs++)
    public abstract void mostrar();

    /**
     * Metodo abstracto para calcular el costo de la entrada.
     *
     * @return el costo de la entrada
     */
    public abstract double entrada();

    /**
     * Metodo abstracto para listar la informacion del visitante si
     * coincide con la fecha y opcionalmente el tipo.
     *
     * @param p_fecha         fecha a consultar
     * @param p_tipoVisitante tipo de visitante a filtrar (puede ser null para no filtrar)
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_tipoVisitante);

    /**
     * Metodo abstracto para obtener el tipo de visitante.
     *
     * @return cadena con el tipo ("Individuo" o "Delegacion")
     */
    public abstract String tipoVisitante();

    /**
     * Metodo abstracto para obtener el conjunto de personas asociadas
     * a este visitante (una o varias).
     *
     * @return HashSet con las personas
     */
    public abstract HashSet<Persona> listarPersonas();
}