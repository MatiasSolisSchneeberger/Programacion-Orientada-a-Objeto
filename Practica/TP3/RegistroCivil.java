/**
 * TP 3 - Act 10
 * Clase ejecutable que simula un Registro Civil.
 * Se crean varias parejas, se casan, se muestran datos,
 * y luego se realizan divorcios para probar todos los métodos.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class RegistroCivil {
	public static void main(String[] args) {

		// --- Pareja 1 ---
		Hombre pepe = new Hombre("Pepe", "López", 30);
		Mujer maria = new Mujer("María", "Gómez", 28);

		// Casamiento
		maria.casarseCon(pepe);
		pepe.casarseCon(maria);

		// Mostrar datos y estado civil
		System.out.println("=== Pareja 1 ===");
		maria.mostrarEstadoCivil();
		pepe.mostrarEstadoCivil();
		maria.casadaCon();
		pepe.casadoCon();
		System.out.println();  // salto de línea

		// --- Pareja 2 ---
		Hombre juan = new Hombre("Juan", "Pérez", 35);
		Mujer laura = new Mujer("Laura", "Fernández", 32);

		// Casamiento
		juan.casarseCon(laura);
		laura.casarseCon(juan);

		System.out.println("=== Pareja 2 ===");
		laura.mostrarEstadoCivil();
		juan.mostrarEstadoCivil();
		laura.casadaCon();
		juan.casadoCon();
		System.out.println();

		// --- Pareja 3 ---
		Hombre carlos = new Hombre("Carlos", "Ramírez", 40);
		Mujer ana = new Mujer("Ana", "Martínez", 38);

		// Casamiento
		carlos.casarseCon(ana);
		ana.casarseCon(carlos);

		System.out.println("=== Pareja 3 ===");
		ana.mostrarEstadoCivil();
		carlos.mostrarEstadoCivil();
		ana.casadaCon();
		carlos.casadoCon();
		System.out.println();

		// --- Divorcios ---
		System.out.println("=== Divorcios ===");
		maria.divorcio();
		pepe.divorcio();

		maria.mostrarEstadoCivil();
		pepe.mostrarEstadoCivil();
		System.out.println();

		laura.divorcio();
		juan.divorcio();

		laura.mostrarEstadoCivil();
		juan.mostrarEstadoCivil();
		System.out.println();

		ana.divorcio();
		carlos.divorcio();

		ana.mostrarEstadoCivil();
		carlos.mostrarEstadoCivil();
		System.out.println();


	}
}
