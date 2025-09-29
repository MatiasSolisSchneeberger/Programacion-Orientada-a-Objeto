public class Docente extends UsuarioVirtual {
	Docente(String p_usuario,int p_clave) {
		super(p_usuario, p_clave);
	}


	public void puedeAcceder() {
		System.out.println("***** Docente *****");
		super.puedeAcceder();
		System.out.println("Administracion");
	}
}
