package Ejercicio6;

public class Main {
    public static void main(String args[]){

        Multiplicar multiplicar = new Multiplicar(3, 3,3,2);

        System.out.println("Matriz A:");
        multiplicar.primerMatriz();
        System.out.println("Matriz B:");
        multiplicar.segundaMatriz();
        System.out.println("Matriz AxB:");
        multiplicar.mostrandoProducto();
    }
}
