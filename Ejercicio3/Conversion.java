package Ejercicio3;

public class Conversion {
    double celsius;
    public void getCelsius(double gradosCelsius){
        celsius=gradosCelsius;
    }
    public double setCelsius(){
        return celsius;
    }
    public double ConversionCelsiusFarenheit(){
     double farenheit=(setCelsius()*1.8)+32;
     return farenheit;
    }
    public double ConversionCelsiusKelvin(){
        double kelvin=setCelsius()+273;
        return kelvin;
       }
    public double ConversionCelsiusRankine(){
        double rankine=(1.8*setCelsius())+492;
        return rankine;
       }
}
