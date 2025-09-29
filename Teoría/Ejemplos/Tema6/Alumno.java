public class Alumno extends  UsuarioVirtual{
	private int horaDesde;
	private int horaHasta;

	Alumno(String p_usuario, int p_clave, int p_horaDesde, int p_horaHasta) {
		super(p_usuario, p_clave);
		this.setHoraDesde(p_horaDesde);
		this.setHoraHasta(p_horaHasta);
	}

	public int getHoraDesde() {
		return horaDesde;
	}

	private void setHoraDesde(int p_horaDesde) {
		this.horaDesde = p_horaDesde;
	}

	public int getHoraHasta() {
		return horaHasta;
	}

	private void setHoraHasta(int p_horaHasta) {
		this.horaHasta = p_horaHasta;
	}

	public void puedeAcceder() {
		System.out.println("***** Alumno *****");
		if (getHoraDesde() )

	}
}
