public class UsuarioVirtual {
	private String usuario;
	private int clave;

	UsuarioVirtual(String p_usuario, int p_clave) {
		this.setUsuario(p_usuario);
		this.setClave(p_clave);
	}

	public String getUsuario() {
		return usuario;
	}

	private void setUsuario(String p_usuario) {
		this.usuario = p_usuario;
	}

	public int getClave() {
		return clave;
	}

	private void setClave(int p_clave) {
		this.clave = p_clave;
	}


	public void puedeAcceder(){
		System.out.println("Materiales obligatorios");
		System.out.println("Foro");
		System.out.println("Mensajeria interna");
	}
}
