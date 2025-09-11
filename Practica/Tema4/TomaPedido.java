import java.util.Calendar;
/**
 * TP 4 - Act 2
 * Clase principal para tomar un pedido.
 * Crea un cliente, un pedido, un laboratorio y varios productos.
 * Agrega productos al pedido, muestra el pedido, quita algunos productos y vuelve a mostrar
 * */
public class TomaPedido {
	public static void main(String[] args) {
		// - TODO: Pasar todo esto a Scanner
		Cliente cliente1 = new Cliente(78249635,
				"Sanchez",
				"Juan",
				0);
		Pedido pedido1 = new Pedido(Calendar.getInstance(), cliente1);

		Laboratorio lab1 = new Laboratorio("Pfizer",
				"Santa Fe 1234",
				"123456789");

		// Creando los productos
		Producto prod1 = new Producto(795948,
				"Perfumería",
				"Crema de manos",
				1500.0,
				lab1);

		Producto prod2 = new Producto(795949,
				"Medicamento",
				"Analgésico",
				500.0,
				lab1);

		Producto prod3 = new Producto(795950,
				"Higiene",
				"Jabón líquido",
				800.0,
				lab1);

		Producto prod4 = new Producto(795951,
				"Medicamento",
				"Antibiótico",
				3500.0,
				lab1);

		Producto prod5 = new Producto(795952,
				"Higiene",
				"Shampoo",
				1200.0,
				lab1);

		Producto prod6 = new Producto(795953,
				"Perfumería",
				"Colonia fresca",
				2500.0,
				lab1);

		Producto prod7 = new Producto(795954,
				"Cuidado personal",
				"Crema facial",
				4000.0,
				lab1);

		Producto prod8 = new Producto(795955,
				"Medicamento",
				"Jarabe para la tos",
				2200.0,
				lab1);

		Producto prod9 = new Producto(795956,
				"Higiene",
				"Pasta dental",
				950.0,
				lab1);

		Producto prod10 = new Producto(795957,
				"Perfumería",
				"Desodorante",
				1100.0,
				lab1);

		Producto prod11 = new Producto(795958,
				"Cuidado personal",
				"Protector solar",
				3300.0,
				lab1);

		Producto prod12 = new Producto(795959,
				"Medicamento",
				"Vitaminas",
				2800.0,
				lab1);

		Producto prod13 = new Producto(795960,
				"Higiene",
				"Toallas húmedas",
				600.0,
				lab1);

		Producto prod14 = new Producto(795961,
				"Perfumería",
				"Perfume floral",
				7200.0,
				lab1);

		Producto prod15 = new Producto(795962,
				"Cuidado personal",
				"Crema corporal",
				2700.0,
				lab1);

		Producto prod16 = new Producto(795963,
				"Medicamento",
				"Analgésico fuerte",
				1500.0,
				lab1);

		Producto prod17 = new Producto(795964,
				"Higiene",
				"Enjuague bucal",
				1300.0,
				lab1);

		Producto prod18 = new Producto(795965,
				"Perfumería",
				"Body splash",
				1900.0,
				lab1);


		pedido1.agregarProducto(prod1);
		pedido1.agregarProducto(prod2);
		pedido1.agregarProducto(prod3);
		pedido1.agregarProducto(prod4);
		pedido1.agregarProducto(prod5);
		pedido1.agregarProducto(prod6);
		pedido1.agregarProducto(prod7);
		pedido1.agregarProducto(prod8);
		pedido1.agregarProducto(prod9);
		pedido1.agregarProducto(prod10);
		pedido1.agregarProducto(prod11);
		pedido1.agregarProducto(prod12);
		pedido1.agregarProducto(prod13);
		pedido1.agregarProducto(prod14);
		pedido1.agregarProducto(prod15);
		pedido1.agregarProducto(prod16);
		pedido1.agregarProducto(prod17);
		pedido1.agregarProducto(prod18);


		pedido1.mostrar();

		System.out.println();
		System.out.println();
		pedido1.quitarProducto(prod3);
		pedido1.quitarProducto(prod8);
		pedido1.mostrar();
	}
}
