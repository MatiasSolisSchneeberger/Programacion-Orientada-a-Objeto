/**
 * TP 2 - Act 4
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class EjecutableAlumno {
	public static void main(String[] args) {
		int LU = Integer.valueOf(args[0]);
		String nombre = args[1];
		String apellido = args[2];

		double nota1 = Double.parseDouble(args[3]);
		double nota2 = Double.parseDouble(args[4]);

		Alumno alumno1 = new Alumno(LU, nombre, apellido);
		/* Primer Parcial */
		alumno1.setNota1(nota1);
		/* Segundo Parcial */
		alumno1.setNota2(nota2);
		alumno1.mostrar();
		System.out.println(alumno1.apeYNom());
	}
}
