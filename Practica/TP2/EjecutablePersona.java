/**
 * TP 2 - Act 1
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class EjecutablePersona {
	public static void main(String[] args) {
		Persona persona1 = new Persona(78264157, "Juan", "Gomez", 2000);
		System.out.println(persona1.apeYNom());
		System.out.println("--- Persona 1 ---");
		persona1.mostrar();

		Persona persona2 = new Persona(-1, "Juana", "Gonzales", 1490);
		System.out.println(persona2.apeYNom());
		System.out.println("--- Persona 2 ---");
		persona2.mostrar();
	}
}
