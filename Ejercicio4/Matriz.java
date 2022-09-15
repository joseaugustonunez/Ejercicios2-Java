package Ejercicio4;

public class Matriz {
    int fila;
    int columna;
    public Matriz(int numF, int numC){
        fila = numF;
        columna = numC;
    }
    public int getNumeroF(){
        return fila;
    }
    public int getNumeroC(){
        return columna;
    }
    public int[][] calcularMatriz(){
        int matriz[][] = new int[getNumeroF()][getNumeroC()]; 
        for (int i = 0; i < getNumeroF(); i++) {
            for (int j = 0; j < getNumeroC(); j++) {
                matriz[i][j] = (i *getNumeroF()) + (j + 1);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        return matriz;
    }
}