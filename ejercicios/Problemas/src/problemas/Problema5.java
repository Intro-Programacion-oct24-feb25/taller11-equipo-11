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
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] suma = new int[3][3];
        for (int i = 0; i < informacion2.length; i++) {
            for (int j = 0; j < informacion[i].length; j++) {
                suma[i][j] = obtenerSuma(informacion[i][j],
                        informacion2[i][j]);
            }
        }

        String cadena = "";
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, suma[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerSuma(int valor1, int valor2) {
        int operacion;
        operacion = valor1 + valor2;
        return operacion;
    }

}
