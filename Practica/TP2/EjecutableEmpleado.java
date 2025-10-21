import java.util.Scanner;

/**
 * TP 2 - Act 5
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class EjecutableEmpleado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("-- Empleado 1 --");
		System.out.print("\tIngresar CUIL: ");
		long cuilEmp1 = teclado.nextLong();
		System.out.print("\tIngresar apellido: ");
		String apellidoEmp1 = teclado.next();
		System.out.print("\tIngresar nombre: ");
		String nombreEmp1 = teclado.next();
		System.out.print("\tIngresar sueldo basico: ");
		double sueldoBasicoEmp1 = teclado.nextDouble();
		System.out.print("\tIngresar año de ingreso: ");
		int anioIngresoEmp1 = teclado.nextInt();
		Empleado empleado1 = new Empleado(cuilEmp1, apellidoEmp1,nombreEmp1, sueldoBasicoEmp1,anioIngresoEmp1);

		System.out.print("Mostrando Empleado 1");
		empleado1.mostrar();
		System.out.print("--------------------");
		empleado1.mostrarLinea();
		System.out.println(empleado1.apeYNom());


		System.out.println("-- Empleado 2 --");
		System.out.print("\tIngresar CUIL: ");
		long cuilEmp2 = teclado.nextLong();
		System.out.print("\tIngresar apellido: ");
		String apellidoEmp2 = teclado.next();
		System.out.print("\tIngresar nombre: ");
		String nombreEmp2 = teclado.next();
		System.out.print("\tIngresar sueldo basico: ");
		double sueldoBasicoEmp2 = teclado.nextDouble();
		System.out.print("\tIngresar año de ingreso: ");
		int anioIngresoEmp2 = teclado.nextInt();
		Empleado empleado2 = new Empleado(cuilEmp2, apellidoEmp2,nombreEmp2, sueldoBasicoEmp2,anioIngresoEmp2);

		System.out.print("Mostrando Empleado 2");
		empleado2.mostrar();
		System.out.print("--------------------");
		empleado2.mostrarLinea();
		System.out.println(empleado2.apeYNom());
	}
}
