import java.util.Calendar;
import java.util.Scanner;
/**
 * TP 4 - Act 2
 * Clase principal para tomar un pedido.
 * Crea un cliente, un pedido, un laboratorio y varios productos.
 * Agrega productos al pedido, muestra el pedido, quita algunos productos y vuelve a mostrar
 * */
public class TomaPedido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. Datos del laboratorio
		System.out.println("Ingrese datos del laboratorio:");
		System.out.println("Nombre: ");
		String nombreLab = sc.next();
		System.out.println("Dirección: ");
		String direccionLab = sc.next();
		System.out.println("Teléfono: ");
		String telefonoLab = sc.next();
		Laboratorio lab = new Laboratorio(nombreLab, direccionLab, telefonoLab);

		// 2. Datos del cliente
		System.out.println("\nIngrese datos del cliente:");
		System.out.print("CUIL: ");
		int cuil = sc.nextInt();
		System.out.println("Apellido: ");
		String apellido = sc.next();
		System.out.println("Nombre: ");
		String nombre = sc.next();
		System.out.print("Puntos: ");
		int puntos = sc.nextInt();
		Cliente cliente = new Cliente(cuil, apellido, nombre, puntos);

		// 3. Crear pedido
		Pedido pedido = new Pedido(Calendar.getInstance(), cliente);

		// 4. Menú
		int opcion;
		do {
			System.out.println("\n--- MENÚ PEDIDO ---");
			System.out.println("1. Agregar producto al pedido");
			System.out.println("2. Quitar producto del pedido");
			System.out.println("3. Mostrar pedido");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("\nIngrese datos del producto a agregar:");
					System.out.print("Código: ");
					int codigo = sc.nextInt();
					System.out.println("Categoría: ");
					String categoria = sc.next();
					System.out.println("Nombre: ");
					String nombreProd = sc.next();
					System.out.println("Precio: ");
					double precio = Double.parseDouble(sc.next());

					Producto nuevoProd = new Producto(codigo, categoria, nombreProd, precio, lab);
					pedido.agregarProducto(nuevoProd);
					System.out.println("Producto agregado al pedido.");
					break;

				case 2:
					if (pedido.getProductos().isEmpty()) {
						System.out.println("No hay productos en el pedido.");
					} else {
						System.out.println("\nProductos en el pedido:");

						for (int i = 0; i < pedido.getProductos().size(); i++) {
							Producto prod = (Producto) pedido.getProductos().get(i);
							System.out.println((i + 1) + ". " + prod.getDescripcion() + " - $" + prod.getCosto());
						}

						System.out.print("Seleccione el número del producto a quitar: ");

						int prodQuitar = sc.nextInt() - 1;

						if (prodQuitar >= 0 && prodQuitar < pedido.getProductos().size()) {
							Producto prod = (Producto) pedido.getProductos().get(prodQuitar);
							pedido.quitarProducto(prod);
							System.out.println("Producto quitado del pedido.");
						} else {
							System.out.println("Opción inválida.");
						}
					}
					break;

				case 3:
					pedido.mostrar();
					break;

				case 4:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opción inválida.");
			}

		} while (opcion != 4);

		sc.close();
	}
}

