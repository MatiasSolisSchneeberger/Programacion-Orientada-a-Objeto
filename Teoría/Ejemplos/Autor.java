public class Autor {
	private String nombre;
	private String insitucion;
	private String mail;

	Autor(String p_nombre, String p_institucion, String p_mail){
		setNombre(p_nombre);
		setInsitucion(p_institucion);
		setMail(p_mail);
	}

	public String getNombre(){
		return nombre;
	}
	public String getInsitucion(){
		return insitucion;
	}
	public String getMail(){
		return mail;
	}

	private void setInsitucion(String p_insitucion) {
		insitucion = p_insitucion;
	}

	private void setMail(String p_mail) {
		mail = p_mail;
	}

	private void setNombre(String p_nombre) {
		nombre = p_nombre;
	}

	public void mostrar(){
		System.out.println("Autor: "+ getNombre());
		System.out.println("Institucion: "+ getInsitucion());
		System.out.println("Mail: " + getMail());
	}
}
