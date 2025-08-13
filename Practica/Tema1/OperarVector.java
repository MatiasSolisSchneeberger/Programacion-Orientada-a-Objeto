import java.util.Scanner;public class OperarVector {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        int maxArray = 5;        int[] notas = new int[maxArray];
        int sumatoria = 0;        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingresar nota N° " + (i + 1) + ": ");
            notas[i] = teclado.nextInt();
            sumatoria = sumatoria + notas[i];
        }        System.out.print("\nPromedio: " + (sumatoria / notas.length));
    }
}
