import java.util.ArrayList;
import java.util.Calendar;

public class AplicacionBanco {
	public static void main(String[] args) {
		// Localidades
		Localidad loc1 = new Localidad("Corrientes", "Corrientes");
		Localidad loc2 = new Localidad("Resistencia", "Chaco");

		// Empleados Banco 1
		Empleado e1 = new Empleado(27267504235L,
				"Perez",
				"Lorena",
				121200.0,
				Calendar.getInstance());
		Empleado e2 = new Empleado(20159462638L,
				"Dominguez",
				"Pedro",
				265000.4,
				Calendar.getInstance());
		Empleado e3 = new Empleado(30124578963L,
				"Gomez",
				"Carla",
				187500.7,
				Calendar.getInstance());
		Empleado e4 = new Empleado(28123654789L,
				"Martinez",
				"Juan",
				95000.0,
				Calendar.getInstance());
		Empleado e5 = new Empleado(22123456780L,
				"Lopez",
				"Marta",
				134800.5,
				Calendar.getInstance());


		Banco banco1 = new Banco("RIO", loc1, 3, e1);

		banco1.agregarEmpleado(e2);
		banco1.agregarEmpleado(e3);
		banco1.agregarEmpleado(e4);
		banco1.agregarEmpleado(e5);

		// Empleados Banco 2
		Empleado e6 = new Empleado(27111111111L,
				"Fernandez",
				"Carlos",
				158000.0,
				Calendar.getInstance());
		Empleado e7 = new Empleado(20222222222L,
				"Ramirez",
				"Ana",
				198500.3,
				Calendar.getInstance());
		Empleado e8 = new Empleado(30333333333L,
				"Silva",
				"Mario",
				110200.8,
				Calendar.getInstance());
		Empleado e9 = new Empleado(28444444444L,
				"Torres",
				"Lucia",
				145600.0,
				Calendar.getInstance());
		Empleado e10 = new Empleado(22555555555L,
				"Alvarez",
				"Sofia",
				212300.9,
				Calendar.getInstance());

		ArrayList<Empleado> listaEmpleados2 = new ArrayList<>();
		listaEmpleados2.add(e6);
		listaEmpleados2.add(e7);
		listaEmpleados2.add(e8);
		listaEmpleados2.add(e9);
		listaEmpleados2.add(e10);

		Banco banco2 = new Banco("NACION", loc2, 12, listaEmpleados2);

		// Mostrar datos de los bancos
		banco1.mostrar();
		System.out.print("\n\n-------------------------------------\n\n");
		banco2.mostrar();
	}
}
