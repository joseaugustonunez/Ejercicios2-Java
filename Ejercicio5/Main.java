package Ejercicio5;

public class Main {
     public static void main(String args []){
         
        Suma suma = new Suma(3,3);

        System.out.println("Matriz A");
        suma.primerMatriz();
        System.out.println("\nMatriz B");
        suma.segundaMatriz();
        System.out.println("\n Suma A+B");
        suma.mostrarSuma();
     }
}
