import java.util.ArrayList;
import java.util.Calendar;
/**
 * TP 4 - Act 2
 * Esta clase representa un pedido realizado por un cliente, incluyendo la fecha del pedido, el cliente que lo realizó y la lista de productos incluidos en el pedido.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Pedido {
	// Atributos
	private Calendar fecha;
	private Cliente cliente;
	private ArrayList productos = new ArrayList();

	// Constructores

	/**
	 * Este constructor crea un nuevo pedido con la fecha, el cliente y la lista de productos especificados.
	 *
	 * @param p_fecha     La fecha del pedido (Calendar).
	 * @param p_cliente   El clienteque realiza el pedido (Cliente).
	 * @param p_productos La lista de productosincluidos en el pedido (ArrayList<Producto>).
	 */
	Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos) {
		this.setFecha(p_fecha);
		this.setCliente(p_cliente);
		this.setProductos(p_productos);
	}

	/**
	 * Este constructor crea un nuevo pedido con la fecha y el cliente especificados, inicializando la lista de productos como vacía.
	 *
	 * @param p_fecha   La fecha del pedido (Calendar).
	 * @param p_cliente El cliente que realiza el pedido (Cliente).
	 */
	Pedido(Calendar p_fecha, Cliente p_cliente) {
		this.setFecha(p_fecha);
		this.setCliente(p_cliente);
		this.setProductos(new ArrayList());
	}

	// Getters y Setters

	/**
	 * Devuelve la fecha del pedido.
	 *
	 * @return La fecha del pedido (Calendar).
	 */
	public Calendar getFecha() {
		return this.fecha;
	}

	/**
	 * Establece la fecha del pedido.
	 *
	 * @param fecha La nueva fecha del pedido (Calendar).
	 */
	private void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el cliente que realizó el pedido.
	 *
	 * @return El cliente del pedido (Cliente).
	 */
	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	 * Establece el cliente que realizó el pedido.
	 *
	 * @param cliente El nuevo cliente del pedido (Cliente).
	 */
	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Devuelve la lista de productos incluidos en el pedido.
	 *
	 * @return La lista de productos del pedido (ArrayList<Producto>).
	 */

	public ArrayList getProductos() {
		return this.productos;
	}

	/**
	 * Establece la lista de productos incluidos en el pedido.
	 *
	 * @param productos La nueva lista de productos del pedido (ArrayList< Producto >).
	 */
	private void setProductos(ArrayList productos) {
		this.productos = productos;
	}

	// Métodos

	/**
	 * Devuelve el total del pedido si se paga al contado.
	 *
	 * @return total al contado
	 */
	public double totalAlContado() {
		double total = 0;
		for (Object obj : this.getProductos()) {
			Producto producto = (Producto) obj;
			total += producto.precioContado();
		}
		return total;
	}

	/**
	 * Devuelve el total del pedido si se financia.
	 *
	 * @return total financiado
	 */
	public double totalFinanciado() {
		double total = 0;
		for (Object obj : this.getProductos()) {
			Producto producto = (Producto) obj;
			total += producto.precioLista();
		}
		return total;
	}

	// hace falta que sea boolean? Por qué 🤨?

	/**
	 * Agrega un producto al pedido.
	 *
	 * @param p_producto El producto a agregar (Producto).
	 * @return true si el producto fue agregado exitosamente, false en caso contrario.
	 */
	@SuppressWarnings("unchecked")
	public boolean agregarProducto(Producto p_producto) {
		return this.getProductos().add(p_producto);
	}

	/**
	 * Elimina un producto del pedido.
	 *
	 * @param p_producto El producto a eliminar (Producto).
	 * @return true si el producto fue eliminado exitosamente, false en caso contrario.
	 */
	public boolean quitarProducto(Producto p_producto) {
		return this.getProductos().remove(p_producto);
	}

	/**
	 * Muestra los detalles del pedido, incluyendo la fecha, la lista de
	 * productos con sus precios y los totales al contado y financiado.
	 */
	public void mostrar() {
		// Encabezado
		System.out.println("****** Detalles del pedido ****** Fecha: " +
				this.getFecha().getTime());

		// Encabezados de tabla
		System.out.printf("%-20s %15s %15s%n", "Producto", "Precio Lista", "Precio Contado");

		// Lista de productos

		for (Object obj : this.getProductos()) {
			Producto producto = (Producto) obj;
			producto.mostrarLinea();
		}

		System.out.println("*--------------------------------------------------*");

		// Totales
		System.out.printf("%-20s %15.2f %15.2f%n",
				"TOTAL", this.totalFinanciado(), this.totalAlContado());
	}
}
