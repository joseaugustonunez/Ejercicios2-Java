package Ejercicio1;

public class Main {

    public static void main(String args[]){
    Ecuacion ecuacion = new Ecuacion(5,20,5);

    System.out.println("Valor A:"+ ecuacion.getA());
    System.out.println("Valor B:"+ ecuacion.getB());
    System.out.println("Valor C:"+ ecuacion.getC());

    System.out.println("Valor de la discriminante es: "+ecuacion.discriminante());
   System.out.println("Valor: "+ecuacion.raices());
   }
}
