/**
 * Ejercicio_5
 */
package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        float participacion,primerExamen,segundoExamen,examenFinal,definitiva;

        System.out.println("Ingrese el Participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Ingrese el Examen 1: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Ingrese el Examen 2: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Ingrese el Examen Final: ");
        examenFinal = entrada.nextFloat();

        definitiva = (float) ((participacion*0.1)+(primerExamen*0.25)+(segundoExamen*0.25)+(examenFinal*0.4));
        System.out.println("La nota definitiva es: "+definitiva);
    }
    
}