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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre;
        String cedula;
        System.out.printf("Menu;\n1.Valor luz\n2. Valor predio\n");
        opcion =entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del cliente");
        nombre= entrada.nextLine();
        System.out.println("Ingrese la cedula del cliente");
        cedula=entrada.nextLine();
        
        switch (opcion) {
            case 1:
                calcularValorLuz(nombre,cedula);
                break;
            case 2:
                calcularPredio(nombre,cedula);
                break;
            

        }
    }
    public static void calcularValorLuz(String nombre, String cedula){
        Scanner entrada = new Scanner(System.in);
        double valorKilowatio;
        int numeroKilowatios;
        double totalPagar;
        String cadena ="";
        System.out.println("Ingrese el valor de Kilowatios");
        valorKilowatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios consumidos");
        numeroKilowatios = entrada.nextInt();
        totalPagar = valorKilowatio*numeroKilowatios;
        cadena = String.format("Cliente %s con cedula %s debe cancelar el valor"
                + "de $ %.2f", nombre, cedula,totalPagar);
        System.out.printf("%s\n",cadena);
    }
    
    public static void calcularPredio(String nombre, String cedula){
        Scanner entrada = new Scanner(System.in);
        double valorMueble;
        double totalPredio;
        String cadena; 
        System.out.println("Ingrese el valor del bien inmueble");
        valorMueble = entrada.nextDouble();
        totalPredio = valorMueble * 0.02;
        cadena = String.format("Cliente %s con cedula %s tiene un bien inmueble"
                + "valorado en $ %.2f y tiene que pagar de predio $ %.2f"
                , nombre, cedula,valorMueble,totalPredio);
        System.out.printf("%s\n",cadena);
        
    }
}
