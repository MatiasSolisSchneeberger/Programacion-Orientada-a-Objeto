/**
 * TP 5 - Act 11
 * Clase ejecutable para simular la creacion y muestra de un Pedido de etiquetas.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class EjecutarPedido {
    public static void main(String[] p_args) {

        System.out.println("Simulando creacion de pedido...");

        // 1. Crear el Pedido
        Pedido pedido = new Pedido();

        // 2. Crear las Etiquetas
        // Item 1: Premium, Costo: $200.0, Colores: 10
        Premium etiqueta1 = new Premium(200.0, 10);
        // Item 2: Comun, Costo: $100.0, Disenio (Plus): $100.0
        Comun etiqueta2 = new Comun(100.0, 100.0);
        // Item 3: Premium, Costo: $200.0, Colores: 7
        Premium etiqueta3 = new Premium(200.0, 7);

        // 3. Crear los Renglones con las cantidades del ejemplo
        // Item 1: 7 Etiquetas Premium
        Renglon renglon1 = new Renglon(7, etiqueta1);
        // Item 2: 57 Etiquetas Comun
        Renglon renglon2 = new Renglon(57, etiqueta2);
        // Item 3: 94 Etiquetas Premium
        Renglon renglon3 = new Renglon(94, etiqueta3);

        // 4. Agregar los Renglones al Pedido
        pedido.agregarRenglon(renglon1);
        pedido.agregarRenglon(renglon2);
        pedido.agregarRenglon(renglon3);

        // 5. Mostrar el Pedido completo
        System.out.println("-------------------------------------");
        pedido.mostrar();
        System.out.println("-------------------------------------");
    }
}