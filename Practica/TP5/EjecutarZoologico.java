import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TP 5 - Act 10
 * Clase ejecutable para probar la gestion del Zoologico.
 * Realiza las operaciones solicitadas en el punto 10 del TP5.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class EjecutarZoologico {

    public static void main(String[] p_args) {

        // a) Instanciar un zoologico con el nombre "El Caribu"
        Zoologico zoo = new Zoologico("El Caribu");
        System.out.println("Zoologico '" + zoo.getNombre() + "' creado.");

        // b) Instanciar tres individuos... dia 22/09/2024
        Calendar fechaVisita = new GregorianCalendar(2024, Calendar.SEPTEMBER, 22);

        // Creamos las personas
        Persona personaIndependiente = new Persona(111, "Juan", "Perez", 1980);
        Persona personaDelegacion1 = new Persona(222, "Maria", "Gomez", 1975);
        Persona personaDelegacion2 = new Persona(333, "Carlos", "Lopez", 1978);

        // Individuo independiente
        Individuo visitanteIndependiente = new Individuo(fechaVisita, personaIndependiente);
        zoo.nuevoVisitante(visitanteIndependiente);
        System.out.println("Visitante individual agregado.");

        // c) Crear la delegacion "PAMI", inscribir a los dos individuos.
        Delegacion delegacionPAMI = new Delegacion("PAMI", fechaVisita);

        // Creamos los Individuos para la delegacion (con la misma fecha)
        Individuo integrante1 = new Individuo(fechaVisita, personaDelegacion1);
        Individuo integrante2 = new Individuo(fechaVisita, personaDelegacion2);

        // Inscribimos (usando el nombre de metodo corregido)
        delegacionPAMI.inscribirindividuo(integrante1);
        delegacionPAMI.inscribirindividuo(integrante2);

        // Agregamos la delegacion al zoo
        zoo.nuevoVisitante(delegacionPAMI);
        System.out.println("Delegacion 'PAMI' creada y agregada con " +
                delegacionPAMI.cantidadIntegrantes() + " integrantes.");
        System.out.println("-----------------------------------------------");


        // d) Listar todos los visitantes que acudieron el 22/09/2024
        zoo.listarVisitantePorFecha(fechaVisita);
        System.out.println("-----------------------------------------------");

        // e) Listar la recaudacion del ultimo mes (Septiembre 2024)
        //    Creamos fechas para el inicio y fin de mes.
        Calendar inicioSeptiembre = new GregorianCalendar(2024, Calendar.SEPTEMBER, 1);
        Calendar finSeptiembre = new GregorianCalendar(2024, Calendar.SEPTEMBER, 30);

        double recaudacionSeptiembre = zoo.recaudacion(inicioSeptiembre, finSeptiembre);
        System.out.println("\nRecaudación del mes de Septiembre 2024: $" + recaudacionSeptiembre);
        System.out.println("-----------------------------------------------");

        // f) Listar las delegaciones que acudieron el 22/09/2024
        zoo.listarTipoVisitantePorFecha(fechaVisita, "Delegacion");
        System.out.println("-----------------------------------------------");
    }
}