package Ejercicio1;

public class Ecuacion{
    double a;
    double b;
    double c;
public Ecuacion(double numA, double numB, double numC){
    a = numA;
    b = numB;
    c = numC;
}
public double getA(){
    return a;
}
public double getB(){
    return b;
}
public double getC(){
    return c;
}
public double discriminante(){
    double expresion;
    expresion = Math.pow(getB(), 2) - 4*getA()*getC();
    return expresion;
}
public double raices(){
    double solucion1;
    double solucion2;
    if (discriminante()> 0)
    {
        solucion1=((getB()*(-1))+(Math.sqrt(Math.pow(getB(), 2)- 4*getA()*getC())))/(2*getA());
        solucion2=((getB()*(-1))-(Math.sqrt(Math.pow(getB(), 2)- 4*getA()*getC())))/(2*getA());
        System.out.println("La primera raiz es: " + solucion1);
        System.out.println("La segunda raiz es: " + solucion2);
    }else{
        if (discriminante() == 0)
        {
           solucion1=(getB()*-1)/(2*getA());
           System.out.println("Su raiz es unica y es: " + solucion1);
        }else{
            System.out.println("No tiene raices reales"); 
        }
    }
    return 0;
}
}

