/**
 * TP 3 - Act 1
 * Representa un producto perteneciente a un laboratorio con información sobre
 * su código, rubro, descripción, costo, stock y parámetros de reposición.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Producto {
	// Atributos


	private int codigo;
	private String rubro;
	private String descripcion;
	private double costo;
	private int stock;
	private double procPtoRepo;
	private int existMinima;
	private Laboratorio laboratorio; //Variable de instancia

	// Constructores

	/**
	 * Constructor de la clase Producto.
	 */
	Producto(int p_codigo,
			 String p_rubro,
			 String p_descripcion,
			 double p_costo,
			 double p_procPtoRepo,
			 int p_existMinima,
			 Laboratorio p_lab) {
		this.setCodigo(p_codigo);
		this.setRubro(p_rubro);
		this.setDescripcion(p_descripcion);
		this.setCosto(p_costo);
		this.setStock(0);
		this.setProcPtoRepo(p_procPtoRepo);
		this.setExistMinima(p_existMinima);
		this.setLaboratorio(p_lab);
	}


	/**
	 * Constructor reducido de la clase Producto sin parámetros de reposición.
	 *
	 * @param p_codigo      Código del producto.
	 * @param p_rubro       Rubro ocategoría del producto.
	 * @param p_descripcion Descripcióndel producto.
	 * @param p_costo       Costo unitariodel producto.
	 * @param p_lab         Laboratorio al que pertenece el producto.
	 *
	 */
	Producto(int p_codigo,
			 String p_rubro,
			 String p_descripcion,
			 double p_costo,
			 Laboratorio p_lab) {
		this.setCodigo(p_codigo);
		this.setRubro(p_rubro);
		this.setDescripcion(p_descripcion);
		this.setCosto(p_costo);
		this.setStock(0);
		this.setLaboratorio(p_lab);
	}


	// Getters y Setters

	/**
	 * Obtiene el código del producto.
	 *
	 * @return Código identificador del producto.
	 */
	public int getCodigo() {
		return this.codigo;
	}

	/**
	 * Establece el código del producto.
	 *
	 * @param codigo Código identificador del producto.
	 */
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obtiene el rubro del producto.
	 *
	 * @return Rubro o categoría del producto.
	 */
	public String getRubro() {
		return this.rubro;
	}

	/**
	 * Establece el rubro del producto.
	 *
	 * @param rubro Rubro o categoría del producto.
	 */
	private void setRubro(String rubro) {
		this.rubro = rubro;
	}

	/**
	 * Obtiene la descripción del producto.
	 *
	 * @return Descripción del producto.
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * Establece la descripción del producto.
	 *
	 * @param descripcion Descripción detallada del producto.
	 */
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Obtiene el costo unitario del producto.
	 *
	 * @return Costo del producto.
	 */
	public double getCosto() {
		return this.costo;
	}

	/**
	 * Establece el costo unitario del producto.
	 *
	 * @param costo Costo del producto.
	 */
	private void setCosto(double costo) {
		this.costo = costo;
	}

	/**
	 * Obtiene el stock disponible del producto.
	 *
	 * @return Cantidad disponible en stock.
	 */
	public int getStock() {
		return this.stock;
	}

	/**
	 * Establece el stock disponible del producto.
	 *
	 * @param stock Cantidad de unidades en stock.
	 */
	private void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Obtiene el porcentaje utilizado para calcular el punto de reposición.
	 *
	 * @return Porcentaje del punto de reposición.
	 */
	public double getProcPtoRepo() {
		return this.procPtoRepo;
	}

	/**
	 * Establece el porcentaje para calcular el punto de reposición.
	 *
	 * @param procPtoRepo Porcentaje de reposición.
	 */
	private void setProcPtoRepo(double procPtoRepo) {
		this.procPtoRepo = procPtoRepo;
	}

	/**
	 * Obtiene la existencia mínima permitida para el producto.
	 *
	 * @return Existencia mínima.
	 */
	public int getExistMinima() {
		return this.existMinima;
	}

	/**
	 * Establece la existencia mínima permitida para el producto.
	 *
	 * @param existMinima Cantidad mínima de unidades en stock.
	 */
	private void setExistMinima(int existMinima) {
		this.existMinima = existMinima;
	}

	/**
	 * Obtiene el laboratorio al que pertenece el producto.
	 *
	 * @return Objeto de tipo Laboratorio asociado al producto.
	 */
	public Laboratorio getLaboratorio() {
		return this.laboratorio;
	}

	/**
	 * Establece el laboratorio al que pertenece el producto.
	 *
	 * @param p_laboratorio Laboratorio asociado al producto.
	 */
	private void setLaboratorio(Laboratorio p_laboratorio) {
		this.laboratorio = p_laboratorio;
	}

	/**
	 * Ajusta el stock del producto.
	 *
	 * @param p_cantidad Nueva cantidad de stock.
	 */
	public void ajuste(int p_cantidad) {
		this.setStock(p_cantidad);
	}

	/**
	 * Calcula el precio de lista del producto aplicando un 12% de IVA.
	 *
	 * @return Precio de lista con IVA incluido.
	 */
	public double precioLista() {
		return this.getCosto() * 1.12;
	}

	/**
	 * Calcula el precio al contado del producto aplicando un 5% de recargo.
	 *
	 * @return Precio al contado con recargo incluido.
	 */
	public double precioContado() {
		return this.getCosto() * 1.05;
	}

	/**
	 * Calcula el valor total del stock del producto con IVA incluido.
	 *
	 * @return Valor total del stock valorizado.
	 */
	public double stockValorizado() {
		return (this.getStock() * this.getCosto() * 1.12);
	}

	/**
	 * Ajusta el porcentaje del punto de reposición del producto.
	 *
	 * @param p_porce Nuevo porcentaje para el punto de reposición.
	 */
	public void ajustarPtoRepo(double p_porce) {
		this.setProcPtoRepo(p_porce);
	}

	/**
	 * Ajusta la existencia mínima permitida para el producto.
	 *
	 * @param p_cantidad Nueva cantidad mínima de existencia.
	 */
	public void ajustarExistMin(int p_cantidad) {
		this.setExistMinima(p_cantidad);
	}

	/**
	 * Muestra la información del Producto
	 */
	public void mostrar() {
		System.out.println(this.getLaboratorio().mostrar());
		System.out.println("Rubro: " + this.getRubro());
		System.out.println("Descripcion: " + this.getDescripcion());
		System.out.println("Precio Costo: " + this.precioLista());
		System.out.println("Stock: " + this.getStock() +
				" - Stock Valorizado: " + this.stockValorizado());
	}

	/**
	 * Muestra la información del Producto en una sola línea
	 */
	public void mostrarLinea() {
		System.out.println(this.getDescripcion() +
				this.precioLista() +
				this.precioContado());
	}
}
