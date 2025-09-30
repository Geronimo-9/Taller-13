import Detalles.mostrarDetalles;


public abstract class Figura {

    public abstract double calcularArea();

    /*public abstract void areas(){
        System.out.println("Camion");
    }*/

    /* No es posible definir metodos con cuerpo en una clase abstracta porque
    el metodo no debe tener un cuerpo ya que es un modelo referente que las clases hijas puedan
    implementarlas con la misma firma y esas clases tengan algo en común.
    *
    *
    * */


}
//Clase Rectangulo
class Rectangulo extends Figura implements mostrarDetalles{
    protected double largo;
    protected double ancho;

    public Rectangulo(double largo, double ancho){
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("El area del rectangulo es: "+calcularArea());
    }
}

//Clase Triangulo
class Triangulo extends Figura implements mostrarDetalles{
    protected double lado_1;
    protected double lado_2;

public Triangulo(double lado_1,double lado_2){
    this.lado_1 = lado_1;
    this.lado_2 = lado_2;
}

    @Override
    public double calcularArea() {
        return (lado_1*lado_2)/2; //El área del triángulo es base por altura dividida entre dos.
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("El area del triangulo es: "+calcularArea());
    }


}
