public class Main {
    public static void main(String[] args) {


        //Ejercicio 1 Clase Abstracta con metodos abstractos y una interfaz de prueba conceptual.
        Rectangulo r1 = new Rectangulo(1,2);
        r1.calcularArea();
        r1.mostrarDetalles();

        Triangulo t1 = new Triangulo(2,4);
        t1.calcularArea();
        t1.mostrarDetalles();

    }
}