public class CrearAlumno {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(78945, "José", "Vargas");
        Alumno alumno2 = new Alumno(456312, "Josefína", "Rodrigez");
        /* Primer Parcial */
        alumno1.setNota1(9.50);
        alumno2.setNota1(8.50);
        /* Segundo Parcial */
        alumno1.setNota2(5.99);
        alumno2.setNota2(8);

        alumno1.mostrar();
        System.out.println("");
        alumno2.mostrar();
    }
}
