package Ejercicio2;

public class Bases {
    int n;
    int base ;
    int inverso;
public Bases(int num, int bases){
    n = num;
    base = bases;
}
public int getNumero(){
    return n;
}
public int getBase(){
    return base;
}
public int convertir()
{
    while (getNumero()> 0) {

        inverso = 10*inverso + getNumero()%getBase();

        n = getNumero()/getBase();
    }

    return inverso;
}
public int invertir()
{
    while (inverso> 0) {    
    n=10*getNumero()+inverso%10;
    inverso=inverso/10;
    }
 return n;
}
}
