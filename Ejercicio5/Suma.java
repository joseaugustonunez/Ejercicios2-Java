package Ejercicio5;

public class Suma {
   int fila;
   int columna;
   public Suma(int numF, int numC){
    fila = numF;
    columna = numC;
   }
   public int getNumF(){
    return fila;
   }
   public int getNumC(){
    return columna;
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
    int matriz2[][] = new int[getNumF()][getNumC()]; 
        for (int i = 0; i < getNumF(); i++) {
            for (int j = 0; j < getNumC(); j++) {
                matriz2[i][j] = (i *getNumF()) + (j + 1); 
            }
        }
        return matriz2;
   }
   public void segundaMatriz(){
    for (int i = 0; i < getNumF(); i++) {
        for (int j = 0; j < getNumC(); j++) {
        System.out.print("[" + matrizDos()[i][j] + "]");
       }
       System.out.println("");
    }
}
   public int[][] sumaMatriz(){
    int matrizResultado[][] = new int[getNumF()][getNumC()];
    for (int i = 0; i < getNumF(); i++) {
        for (int j = 0; j < getNumC(); j++) {
            matrizResultado[i][j] = matrizUno()[i][j]+matrizDos()[i][j];
        }
    }
    return matrizResultado;
}
    public void mostrarSuma(){
    for (int i = 0; i < getNumF(); i++) {
        for (int j = 0; j < getNumC(); j++) {
        System.out.print("[" + sumaMatriz()[i][j] + "]");
       }
       System.out.println("");
    }
    }
}
