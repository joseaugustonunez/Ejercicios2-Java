package Ejercicio3;

public class Main {
    public static void main(String args []){

        Conversion conversion=new Conversion();

        conversion.getCelsius(5);

        System.out.println("La conversion de C a F:"+conversion.ConversionCelsiusFarenheit());
        System.out.println("La conversion de C a K:"+conversion.ConversionCelsiusKelvin());
        System.out.println("La conversion de C a R:"+conversion.ConversionCelsiusRankine());

    }
}
