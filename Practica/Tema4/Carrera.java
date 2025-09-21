import java.util.Scanner;

public class Carrera {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. Crear curso
		System.out.println("=== Creación del Curso ===");
		System.out.print("Nombre del curso: ");
		String nombreCurso = sc.nextLine();

		Curso curso = new Curso(nombreCurso);
		System.out.println("Curso creado: " + curso.getNombre());
		System.out.println();

		int opcion;
		do {
			System.out.println("--- MENÚ CURSO ---");
			System.out.println("1. Inscribir alumno");
			System.out.println("2. Quitar alumno");
			System.out.println("3. Mostrar inscriptos");
			System.out.println("4. Asignar notas a un alumno");
			System.out.println("5. Buscar alumno por DNI");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
				case 1:
					System.out.println("--- Inscribir Alumno ---");
					System.out.print("DNI: ");
					int dni = sc.nextInt();
					sc.nextLine();
					System.out.print("Nombre: ");
					String nombre = sc.nextLine();
					System.out.print("Apellido: ");
					String apellido = sc.nextLine();

					Alumno nuevoAlumno = new Alumno(dni, nombre, apellido);
					curso.inscribirAlumno(nuevoAlumno);
					System.out.println("Alumno inscripto correctamente.");
					break;

				case 2:
					System.out.println("--- Quitar Alumno ---");
					System.out.print("DNI del alumno a quitar: ");
					int dniQuitar = sc.nextInt();
					sc.nextLine();

					if (curso.quitarAlumno(dniQuitar)) {
						System.out.println("Alumno eliminado correctamente.");
					} else {
						System.out.println("Alumno no encontrado.");
					}
					break;

				case 3:
					System.out.println("--- Lista de Inscriptos ---");
					curso.mostrarInscriptos();
					break;

				case 4:
					System.out.println("--- Asignar Notas ---");
					System.out.print("DNI del alumno: ");
					int dniNota = sc.nextInt();
					sc.nextLine();

					Alumno alumno = curso.buscarAlumno(dniNota);
					if (alumno != null) {
						System.out.print("Nota 1: ");
						alumno.setNota1(sc.nextInt());
						System.out.print("Nota 2: ");
						alumno.setNota2(sc.nextInt());
						sc.nextLine();
						System.out.println("Notas asignadas correctamente.");
					} else {
						System.out.println("Alumno no encontrado.");
					}
					break;

				case 5:
					System.out.println("--- Buscar Alumno ---");
					System.out.print("DNI del alumno: ");
					int dniBuscar = sc.nextInt();
					sc.nextLine();

					Alumno encontrado = curso.buscarAlumno(dniBuscar);
					if (encontrado != null) {
						encontrado.mostrar();
					} else {
						System.out.println("Alumno no encontrado.");
					}
					break;

				case 6:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opción inválida.");
			}

			System.out.println();

		} while (opcion != 6);

		sc.close();
	}
}
