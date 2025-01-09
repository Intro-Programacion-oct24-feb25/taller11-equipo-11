/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.printf("Menu:\n1.Area Cuadrado\n2.Area triangulo\n3.Area rectangulo\n");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;

        }

    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (base*altura)/2;
        System.out.printf("El area del triangulo es: %.2f\n",area );
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El area del cuadrado es:%.2f \n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (base*altura);
        System.out.printf("El area del rectangulo es: %.2f\n",area );
    }
}
