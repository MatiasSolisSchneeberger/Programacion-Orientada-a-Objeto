import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empresa {
	public static void main(String[] args) {
		Empleado empleado = new Empleado(20345678901L,
				"Pérez",
				"Juan",
				75000.0,
				new GregorianCalendar(2015, Calendar.MARCH, 1),
				34567890,
				new GregorianCalendar(1990, Calendar.JUNE, 15));

		Persona persona = new Persona(34567890,
				"Juan",
				"Pérez",
				new GregorianCalendar(1990, Calendar.JUNE, 15));

		System.out.println("=== Empleado ===");
		empleado.mostrar();

		System.out.println("\n=== Persona ===");
		persona.mostrar();
	}
}
