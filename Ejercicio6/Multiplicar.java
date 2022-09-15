package Ejercicio6;

public class Multiplicar {

    int fila;
    int columna;
    int fila2;
    int columna2;
    public Multiplicar(int numF, int numC,int numF2,int numC2){
     fila = numF;
     columna = numC;
     fila2 = numF2;
     columna2 = numC2;
    }
    public int getNumF(){
     return fila;
    }
    public int getNumC(){
     return columna;
    }
    public int getNumF2(){
        return fila2;
    }
    public int getNumC2(){
        return columna2;
    }
    public int[][] matrizUno(){
     int matriz1[][] = new int[getNumF()][getNumC()]; 
         for (int i = 0; i < getNumF(); i++) {
             for (int j = 0; j < getNumC(); j++) {
                 matriz1[i][j] = (i *getNumF()) + (j + 1); 
             }
         }
         return matriz1;
    }
    public void primerMatriz(){
     for (int i = 0; i < getNumF(); i++) {
         for (int j = 0; j < getNumC(); j++) {
         System.out.print("[" + matrizUno()[i][j] + "]");
        }
        System.out.println("");
     }
 }
    public int[][] matrizDos(){
     int matriz2[][] = new int[getNumF2()][getNumC2()]; 
         for (int i = 0; i < getNumF2(); i++) {
             for (int j = 0; j < getNumC2(); j++) {
                 matriz2[i][j] = (i *getNumF2()) + (j + 1); 
             }
         }
         return matriz2;
    }
    public void segundaMatriz(){
     for (int i = 0; i < getNumF2(); i++) {
         for (int j = 0; j < getNumC2(); j++) {
         System.out.print("[" + matrizDos()[i][j] + "]");
        }
        System.out.println("");
     }
 }
    public int[][] productoMatriz(){
        int[][] producto = new int[getNumF2()][getNumC2()];
        for (int a = 0; a < getNumC2(); a++) {
            for (int i = 0; i < getNumF(); i++) {
                int suma = 0;
                for (int j = 0; j < getNumC(); j++) {
                    suma += matrizUno()[i][j] * matrizDos()[j][a];
                }
                producto[i][a] = suma;
            }
        }
        return producto;
    }
    public void mostrandoProducto(){
        for(int i = 0; i < getNumF(); i++) {
            for(int j = 0; j < getNumC(); j++) {
                System.out.print("Valor en la posicion ["+i+"]["+j+"]: " +productoMatriz()[i][j] + " \n");
            }
        }
    }
}
