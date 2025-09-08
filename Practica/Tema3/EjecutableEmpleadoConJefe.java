import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TP 3 - Act 12
 * @author Matias
 * @version 1.0
 */
public class EjecutableEmpleadoConJefe {
	public static void main(String[] args) {
		// Gerente General
		Calendar fechaGerente = new GregorianCalendar(2000, Calendar.JANUARY, 1);
		EmpleadoConJefe gerente = new EmpleadoConJefe(
				20351234385L,
				"Bulgheri",
				"Gregorio",
				500000,
				fechaGerente
		);

		// Subgerente
		Calendar fechaSubgerente = new GregorianCalendar(2010, Calendar.MARCH, 15);
		EmpleadoConJefe subgerente = new EmpleadoConJefe(
				27111222333L,
				"Perez",
				"Juan",
				300000,
				fechaSubgerente,
				gerente
		);

		// Empleado común
		EmpleadoConJefe empleado = new EmpleadoConJefe(
				20333444555L,
				"Gomez",
				"Maria",
				200000,
				2018
		);

		// MOSTRAR DATOS COMPLETOS
		System.out.println("=== DATOS DE EMPLEADOS ===");
		gerente.mostrar();
		System.out.println();
		subgerente.mostrar();
		System.out.println();
		empleado.mostrar();
		System.out.println();

		// MOSTRAR EN UNA SOLA LINEA
		System.out.println("=== MOSTRAR LINEA ===");
		System.out.println(gerente.mostrarLinea());
		System.out.println(subgerente.mostrarLinea());
		System.out.println(empleado.mostrarLinea());
		System.out.println();

		// PERMISO DE SALIDA
		System.out.println("=== PERMISO DE SALIDA ===");
		System.out.println("Permiso de salida otorgado a: " + empleado.nomYApe());
		System.out.println("Firma: " + (empleado.getJefe() != null ? empleado.getJefe().nomYApe() : "GERENTE GENERAL"));

		System.out.println();
		System.out.println("Permiso de salida otorgado a: " + subgerente.nomYApe());
		System.out.println("Firma: " + (subgerente.getJefe() != null ? subgerente.getJefe().nomYApe() : "GERENTE GENERAL"));

		System.out.println();
		System.out.println("Permiso de salida otorgado a: " + gerente.nomYApe());
		System.out.println("Firma: " + (gerente.getJefe() != null ? gerente.getJefe().nomYApe() : "GERENTE GENERAL"));
	}
}
