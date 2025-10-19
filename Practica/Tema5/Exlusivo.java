public class Exlusivo extends Cargo {
	private int horasDeInvestigacion;
	private int horasDeExtension;

	public Exlusivo(int p_horasDeInvestigacion,
			 int p_horasDeExtension,
			 int p_horasDeDocencia,
			 int p_anioIngreso,
			 double p_sueldoBasico) {
		super("Exclusivo",
				p_sueldoBasico,
				p_anioIngreso,
				p_horasDeDocencia);
		this.setHorasDeInvestigacion(p_horasDeInvestigacion);
		this.setHorasDeExtension(p_horasDeExtension);
	}

	public int getHorasDeInvestigacion() {
		return horasDeInvestigacion;
	}

	private void setHorasDeInvestigacion(int horasDeInvestigacion) {
		this.horasDeInvestigacion = horasDeInvestigacion;
	}

	public int getHorasDeExtension() {
		return horasDeExtension;
	}

	private void setHorasDeExtension(int horasDeExtension) {
		this.horasDeExtension = horasDeExtension;
	}

	@Override
	public void mostrarCargo(){
		super.mostrarCargo();
		System.out.println("----Cargo de caracter Exclusivo----");
		System.out.println(
				"\t- Horas de Investigación: " +
				this.getHorasDeInvestigacion() +
				"\t- Horas de Extensión: " +
				this.getHorasDeExtension());
	}
}
