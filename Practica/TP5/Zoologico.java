import java.util.*;

/**
 * TP 5 - Act 10
 * Clase que representa un zoologico y gestiona sus visitantes.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Zoologico {
    private String nombre;
    private ArrayList<Visitante> visitantes;

    /**
     * Constructor de Zoologico.
     *
     * @param p_nombre nombre del zoologico
     */
    public Zoologico(String p_nombre) {
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }

    /**
     * Establece el nombre del zoologico.
     * @param p_nombre El nombre.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece la lista de visitantes.
     * @param p_visitantes La lista de visitantes.
     */
    private void setVisitantes(ArrayList<Visitante> p_visitantes) {
        this.visitantes = p_visitantes;
    }

    /**
     * Obtiene el nombre del zoologico.
     * @return El nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la lista de visitantes.
     * @return La lista de visitantes.
     */
    public ArrayList<Visitante> getVisitantes() {
        return this.visitantes;
    }

    /**
     * Agrega un visitante al zoologico.
     *
     * @param p_visitante visitante a agregar
     */
    public void nuevoVisitante(Visitante p_visitante) {
        this.getVisitantes().add(p_visitante);
    }

    /**
     * Quita un visitante del zoologico.
     *
     * @param p_visitante El visitante a quitar.
     * @return true si se quito exitosamente.
     */
    public boolean quitarVisitante(Visitante p_visitante) {
        return this.getVisitantes().remove(p_visitante);
    }

    /**
     * Lista los visitantes de un tipo especifico que asistieron en una fecha.
     * Delega la logica de filtrado y muestra a cada visitante.
     *
     * @param p_fecha         fecha a consultar
     * @param p_tipoVisitante tipo de visitante ("Individuo" o "Delegacion")
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante) {
        System.out.println("\nListado de " + p_tipoVisitante + "s (" +
                p_fecha.get(Calendar.DAY_OF_MONTH) + "/" +
                (p_fecha.get(Calendar.MONTH) + 1) + "/" +
                p_fecha.get(Calendar.YEAR) + "):");
        System.out.println("===============================================");
        boolean encontrado = false;
        for (Visitante visitante : this.getVisitantes()) {
            // Cada visitante decide si debe listarse
            visitante.listarPorFecha(p_fecha, p_tipoVisitante);
            // Se asume que listarPorFecha imprime algo si coincide
            // Para saber si se encontro algo, necesitamos verificar el tipo aqui
            if (visitante.tipoVisitante().equalsIgnoreCase(p_tipoVisitante) &&
                    visitante.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
                    visitante.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH) &&
                    visitante.getFechaVisita().get(Calendar.DAY_OF_MONTH) == p_fecha.get(Calendar.DAY_OF_MONTH)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron visitantes de tipo '" + p_tipoVisitante + "' en esa fecha.");
        }
    }

    /**
     * Lista todos los visitantes (sin importar tipo) que asistieron en una fecha.
     * Delega la logica de filtrado y muestra a cada visitante.
     *
     * @param p_fecha fecha a consultar
     */
    public void listarVisitantePorFecha(Calendar p_fecha) {
        System.out.println("\n*** Visitantes del Zoologico '" + this.getNombre() + "' ***");
        System.out.println("Fecha: " + p_fecha.get(Calendar.DAY_OF_MONTH) + "/" +
                (p_fecha.get(Calendar.MONTH) + 1) + "/" +
                p_fecha.get(Calendar.YEAR));
        System.out.println("===============================================");
        boolean encontrado = false;
        for (Visitante visitante : this.getVisitantes()) {
            // Llama a listarPorFecha sin especificar tipo (null)
            visitante.listarPorFecha(p_fecha, null);
            if (visitante.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
                    visitante.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH) &&
                    visitante.getFechaVisita().get(Calendar.DAY_OF_MONTH) == p_fecha.get(Calendar.DAY_OF_MONTH)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron visitantes en esa fecha.");
        }
    }

    /**
     * Calcula la recaudacion total entre dos fechas (inclusive).
     *
     * @param p_fechaDesde fecha inicial del rango
     * @param p_fechaHasta fecha final del rango
     * @return recaudacion total
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta) {
        double total = 0.0;
        for (Visitante visitante : this.getVisitantes()) {
            Calendar fechaVisita = visitante.getFechaVisita();
            // Compara milisegundos para incluir los dias limite
            if (fechaVisita.getTimeInMillis() >= p_fechaDesde.getTimeInMillis() &&
                    fechaVisita.getTimeInMillis() <= p_fechaHasta.getTimeInMillis()) {
                total += visitante.entrada();
            }
        }
        return total;
    }

    /**
     * Retorna un conjunto (sin duplicados) de todas las personas
     * que visitaron el zoologico.
     *
     * @return HashSet con todas las personas unicas.
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo() {
        HashSet<Persona> todasLasPersonas = new HashSet<Persona>();
        for (Visitante visitante : this.getVisitantes()) {
            todasLasPersonas.addAll(visitante.listarPersonas());
        }
        return todasLasPersonas;
    }
}