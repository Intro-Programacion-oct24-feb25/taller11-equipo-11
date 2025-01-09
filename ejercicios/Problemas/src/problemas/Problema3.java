/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1 ;
        double nota2 ;
        double nota3 ;
        double nota4 ;
        String promediocualitativo;
        String cadena;
         System.out.println("Ingrese la nota 1");
         nota1=entrada.nextDouble();
         System.out.println("Ingrese la nota 2");
         nota2=entrada.nextDouble();
         System.out.println("Ingrese la nota 3");
         nota3=entrada.nextDouble();
         System.out.println("Ingrese la nota 4");
         nota4=entrada.nextDouble();
         promediocualitativo=obtenerPromedioCualitativo(nota1, nota2, nota3, nota4);
         cadena=String.format("El promedio de las notas: %.2f, %.2f, %.2f, %.2f}"
                 + " es %s",nota1,nota2,nota3,nota4,promediocualitativo);
         cadena= obtenerMayuscula(cadena);
         System.out.printf("%s\n",cadena);
         
    }
    
    public static String obtenerMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    public static String obtenerPromedioCualitativo(double nota1,double nota2,
            double nota3,double nota4){
        String promedioCualitativo="";
        double promedio;
        promedio= (nota1+nota2+nota3+nota4)/4;
        //<>
        System.out.println(promedio);
        if (promedio >= 0 && promedio  <= 5 ) {
            promedioCualitativo="Regular";
        } else {
            if (promedio > 5 && promedio  <= 8) {
                promedioCualitativo="Bueno";
            } else {
                if (promedio > 8 && promedio  <= 9) {
                    promedioCualitativo= " Muy bueno";
                } else {
                    if (promedio > 9  && promedio  <= 10) {
                        promedioCualitativo="Sobresaliente";
                    }
                }
            }
        }
        return promedioCualitativo;
    }
    
}
