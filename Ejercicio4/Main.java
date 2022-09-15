package Ejercicio4;

public class Main {
    
    public static void main(String args []){
        Matriz matriz = new Matriz(3,3);

        System.out.println("Numero Filas:"+matriz.getNumeroF());
        System.out.println("Numero Columnas:"+matriz.getNumeroC());

       matriz.calcularMatriz();       
    }
}
