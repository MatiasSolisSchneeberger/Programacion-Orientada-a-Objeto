import java.util.Calendar;
import java.util.GregorianCalendar;

public class Escuela {
	public static void main(String[] args) {
		Persona persona = new Persona(25365902,
				"Maria",
				"Lopez",
				new GregorianCalendar(1988,
						Calendar.JULY,
						22));
		Alumno alumno = new Alumno(2345,
				"Luis",
				"Gomez",
				28325402,
				new GregorianCalendar(1995,
						Calendar.MARCH,
						15));

		alumno.setNota1(5.0);
		alumno.setNota2(9.0);

		System.out.println("=== Persona ===");
		persona.mostrar();

		System.out.println("\n=== Alumno ===");
		alumno.mostrar();
	}
}

