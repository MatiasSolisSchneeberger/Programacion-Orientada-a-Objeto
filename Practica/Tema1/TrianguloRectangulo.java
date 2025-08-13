public class TrianguloRectangulo {
    public static void main(String[] args) {
        
        double h = Double.parseDouble(args[0]);
        double c1 = Double.parseDouble(args[1]);
        double c2 = Double.parseDouble(args[2]);        if (Math.pow(h, 2) == Math.pow(c1, 2) + Math.pow(c2, 2)) {
            System.out.println("Es un triangulo rectangulo");
        } else {
            System.out.println("No es un triangulo rectangulo");
        }
    }
}
