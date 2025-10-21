import java.util.Scanner;

/**
 * TP 5 - Act 5
 * Clase ejecutable para la gestion de la Facultad.
 * Permite crear una facultad, anadir profesores y
 * consultar nominas y detalles.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class AplicacionFacultad {

    public static void main(String[] p_args) {
        System.out.println("Aplicacion Facultad");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la facultad:");
        String nombreFacultad = teclado.nextLine();

        System.out.println("\nLa facultad requiere que ingrese al menos un profesor.");
        System.out.println("Ingrese los datos del primer profesor:");
        System.out.println("Numero de DNI:");
        int dni = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Apellido:");
        String apellido = teclado.nextLine();
        System.out.println("Anio de nacimiento:");
        int anioNacimiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Titulo:");
        String titulo = teclado.nextLine();

        // Datos del primer cargo (Asumimos Exclusivo)
        System.out.println("--- Ingrese datos del primer cargo (Exclusivo) ---");
        System.out.println("Sueldo basico:");
        double sueldoBasico = teclado.nextDouble();
        System.out.println("Anio de ingreso:");
        int anioIngreso = teclado.nextInt();
        System.out.println("Horas de docencia:");
        int horasDeDocencia = teclado.nextInt();
        System.out.println("Horas de investigacion:");
        int horasDeInvestigacion = teclado.nextInt();
        System.out.println("Horas de extension:");
        int horasDeExtension = teclado.nextInt();
        teclado.nextLine();

        Exclusivo cargoProfesor = new Exclusivo(horasDeInvestigacion, horasDeExtension, sueldoBasico, anioIngreso,
                horasDeDocencia);

        Profesor primerProfesor = new Profesor(dni, nombre, apellido, anioNacimiento, titulo, cargoProfesor);
        Facultad facultad = new Facultad(nombreFacultad, primerProfesor);

        System.out.println("\n¡Facultad '" + facultad.getNombre() + "' creada con exito!");

        int opcion;
        do {
            System.out.println("\n--- Menu Principal de la Facultad ---");
            System.out.println("1. Agregar Nuevo Profesor");
            System.out.println("2. Eliminar Profesor (por DNI)");
            System.out.println("3. Listar Nomina (Contaduria)");
            System.out.println("4. Listar Detalle de Profesores y Cargos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- 1. Agregar Nuevo Profesor ---");
                    System.out.println("Numero de DNI:");
                    int dniNuevo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Nombre:");
                    String nombreNuevo = teclado.nextLine();
                    System.out.println("Apellido:");
                    String apellidoNuevo = teclado.nextLine();
                    System.out.println("Anio de nacimiento:");
                    int anioNacNuevo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Titulo:");
                    String tituloNuevo = teclado.nextLine();

                    System.out.println("--- Ingrese datos del primer cargo (Simple) ---");
                    System.out.println("Nombre del cargo:");
                    String nombreCargo = teclado.nextLine();
                    System.out.println("Sueldo basico:");
                    double sueldoCargo = teclado.nextDouble();
                    System.out.println("Anio de ingreso:");
                    int anioIngCargo = teclado.nextInt();
                    System.out.println("Horas de docencia:");
                    int horasDocCargo = teclado.nextInt();
                    teclado.nextLine();

                    Cargo cargoSimple = new Cargo(nombreCargo, sueldoCargo, anioIngCargo, horasDocCargo);
                    Profesor profNuevo = new Profesor(dniNuevo, nombreNuevo, apellidoNuevo, anioNacNuevo, tituloNuevo,
                            cargoSimple);

                    if (facultad.agregarProfesor(profNuevo)) {
                        System.out.println("Profesor agregado exitosamente.");
                    } else {
                        System.out.println("Error: El profesor con DNI " + dniNuevo + " ya existe.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- 2. Eliminar Profesor ---");
                    System.out.print("Ingrese DNI del profesor a eliminar: ");
                    int dniEliminar = teclado.nextInt();
                    teclado.nextLine();

                    Profesor profAEliminar = null;
                    for (Profesor p : facultad.getProfesores()) {
                        if (p.getDNI() == dniEliminar) {
                            profAEliminar = p;
                            break;
                        }
                    }

                    if (profAEliminar != null) {
                        if (facultad.eliminarProfesor(profAEliminar)) {
                            System.out.println("Profesor " + profAEliminar.getApellido() + " eliminado.");
                        } else {
                            System.out.println(
                                    "Error: No se puede eliminar. La facultad debe tener al menos 1 profesor.");
                        }
                    } else {
                        System.out.println("Error: Profesor con DNI " + dniEliminar + " no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- 3. Nomina de Profesores (Contaduria) ---");
                    facultad.nominaProfesores();
                    break;

                case 4:
                    System.out.println("\n--- 4. Detalle de Profesores y Cargos ---");
                    facultad.listaProfesoresCargos();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);

        teclado.close();
    }
}