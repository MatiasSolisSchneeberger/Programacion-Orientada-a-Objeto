/*
 * Implemente en Java la clase Expediente que permite gestionar las instancias de un expediente iniciado. El estado del expediente puede ser: 'ingresado', 'aprobado', 'cerrado'.
 *
 * El método modificarEstado(String) recive como argumento un nuevo estado, y lo asiga al atriburo correspondiente
 * El método mostrarExpediente() muestra en consola el número de expediente, el iniciador y la fecha de inicio
 *
 * UML:
 * | Expediente                                                                  |
 * | --------------------------------------------------------------------------- |
 * | - numero: int                                                               |
 * | - iniciador: String                                                         |
 * | - fechaInicio: int                                                          |
 * | - oficinaActual: String                                                     |
 * | - estado: String                                                            |
 * | --------------------------------------------------------------------------- |
 * | + Expediente(int p_numero, String p_iniciador,                              |
 *                  int p_fechaInicio, String p_oficinaActual, String p_estado)  |
 * | + modificarEstado(nuevoEstado: String):void                                 |
 * | + mostrarExpediente():void                                                  |
 */
public class Expediente {
	private int numero;
	private String iniciador;
	private int fechaInicio;
	private String oficinaActual;
	private String estado;	Expediente(int p_numero, String p_iniciador, int p_fechaInicio, String p_oficinaActual, String p_estado) {
		numero = p_numero;
		iniciador = p_iniciador;
		fechaInicio = p_fechaInicio;
		oficinaActual = p_oficinaActual;
		estado = p_estado;
	}	public void modificarEstado(String nuevoEstado) {
		estado = nuevoEstado;
	}	public void mostrarExpediente() {
		System.out.println(numero);
		System.out.println(iniciador);
		System.out.println(fechaInicio);
	}}
