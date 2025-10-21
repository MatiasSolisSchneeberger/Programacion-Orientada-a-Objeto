
/**
 * Write a description of class EjecutarCuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjecutarCuadrado
{
   public static void main(String[] args){
        Punto origen = new Punto(3, 10);
        Cuadrado cuadrado = new Cuadrado(
            10.5,
            origen
        );

        cuadrado.caracteristicas();
   }
}