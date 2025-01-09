/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media;
        double desviacionEstandar;

        media = obtenerMedia(informacion);
        desviacionEstandar = calcularDesviacionEstandar(informacion, media);
        

        System.out.printf("La media aritmética es: %.2f \n" , media);
        System.out.printf("La desviación estándar es: %.2f\n" , desviacionEstandar);
    }

    public static double obtenerMedia(int[] arreglo) {
        double media;
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {

            suma = suma + arreglo[i];

        }
        media = suma / arreglo.length;
        return media;
    }

    public static double calcularDesviacionEstandar(int[] arreglo, double media) {
        double sumaDeCuadrados = 0;
        double desviacionEstandar;
        for (int i = 0; i < arreglo.length; i++) {
            sumaDeCuadrados += Math.pow(arreglo[i] - media, 2); 
        }
        desviacionEstandar=Math.sqrt(sumaDeCuadrados / arreglo.length);
        return desviacionEstandar;
    }
}
