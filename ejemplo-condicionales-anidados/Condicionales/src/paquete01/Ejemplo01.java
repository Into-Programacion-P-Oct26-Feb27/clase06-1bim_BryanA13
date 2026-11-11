/*
 * Dada una opción (1,2,3), imprimir los valores de verdad
 * para la operación de a y b. Donde 1 es para AND, 2 para OR, 3 para NOT
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la operación que requiere generar\n"
                + "1. AND\n"
                + "2. OR\n"
                + "3. NOT");
        opcion = entrada.nextInt();
        
        if (opcion > 0 && opcion <= 3) {
            if (opcion==1) {
                System.out.printf("%s\n", "Trabajar con AND");
                
            }else{
                if (opcion==2) {
                    System.out.printf("%s\n", "Trabajar con OR");
                }else{
                    // se asume opción = 3
                    // sería con NOT
                    System.out.printf("%s\n", "Trabajar con NOT");
                }
            }
        }else{
            System.out.printf("%s\n", "Opción inválida");
        }

    }

}


/*
    Para que el mensaje "Trabajar con And" salga en pantalla, el ususario debe
de ingresar el valor 1, de ahi comparar con la linea 27, para que s ecumpla debe
salir en ambas condiciones TRUE, si sale TRUE sale la opcion uno que seria igual 
a 1 y ya saldria el mensaje en pantalla 
*/