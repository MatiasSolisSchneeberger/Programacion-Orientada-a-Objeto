/**
 * TP 3 - Act 8
 * En esta clase se define un hospital con su nombre y el nombre de su director.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class Hospital {
	private String nombreHospital;
	private String nombreDirector;

	/**
	 * Construye un nuevo hospital.
	 *
	 * @param p_nombreHospital Nombre del hospital.
	 * @param p_nombreDirector Nombre del director del hospital.
	 *
	 */
	Hospital(String p_nombreHospital, String p_nombreDirector) {
		this.setNombreHospital(p_nombreHospital);
		this.setNombreDirector(p_nombreDirector);
	}

	/**
	 * Obtiene el nombre del hospital.
	 *
	 * @return Nombre del hospital.
	 *
	 */
	public String getNombreHospital() {
		return nombreHospital;
	}

	/**
	 * Establece el nombre del hospital.
	 *
	 * @param nombreHospital Nombre del hospital.
	 *
	 */
	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}

	/**
	 * Obtiene el nombre del director del hospital.
	 *
	 * @return Nombre del director del hospital.
	 *
	 */
	public String getNombreDirector() {
		return nombreDirector;
	}

	/**
	 * Establece el nombre del director del hospital.
	 *
	 * @param nombreDirector Nombre del director del hospital.
	 *
	 */
	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	/**
	 * Consulta y muestra los datos filiatorios de un paciente.
	 *
	 * @param p_paciente Paciente cuyos datos se van a consultar.
	 *
	 */
	public void consultaDatosFiliatorios(Paciente p_paciente) {
		System.out.println("Hospital: " + this.getNombreHospital() + "Director: " + this.getNombreDirector());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		p_paciente.mostrarDatosPantall();
	}
}
