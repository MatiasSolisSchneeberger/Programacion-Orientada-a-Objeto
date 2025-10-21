/**
 * TP 5 - Act 9
 * Clase ejecutable para el Ejercicio 9.
 * Crea una Gerencia, instancia los alojamientos solicitados
 * y finalmente muestra la liquidacion total.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class AdministracionGerencia {
    public static void main(String[] p_args) {

        System.out.println("Iniciando simulacion de Gerencia de Alojamientos...");
        System.out.println("-------------------------------------------------");

        // 1. Crear la Gerencia
        Gerencia gerencia = new Gerencia("Los Arroyos");

        // 2. Definir los servicios disponibles
        Servicio servLavanderia = new Servicio("lavanderia", 20.0);
        Servicio servInternet = new Servicio("internet", 5.0);
        Servicio servAlquilerAuto = new Servicio("alquiler auto", 100.0);

        // 3. Crear Escenario 1: Hotel
        Hotel hotel = new Hotel("Hotel Guarani", 90.0, 7, "Single");
        hotel.agregarServicio(servInternet);
        hotel.agregarServicio(servLavanderia);

        // 4. Crear Escenario 2: Cabania
        Cabania cabania = new Cabania("Cabañas La Alondra", 120.0, 5, 3);
        cabania.agregarServicio(servLavanderia);
        cabania.agregarServicio(servAlquilerAuto);

        // 5. Agregar los alojamientos a la Gerencia
        gerencia.agregarAlojamiento(hotel);
        gerencia.agregarAlojamiento(cabania);

        // 6. Mostrar la liquidacion final
        gerencia.mostrarLiquidacion();
    }
}