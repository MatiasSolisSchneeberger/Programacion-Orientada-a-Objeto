public class EjecutableCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(46516214, "Solis", "Matias", 1000);
		cliente1.agregarSaldo(100);
		cliente1.mostrar();
	}
}
