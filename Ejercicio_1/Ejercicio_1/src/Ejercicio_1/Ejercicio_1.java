/*Ejercicio1: Hacer un programa que calcule e imprima la suma de tres calificaciones */
package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;

        //Guardamos las 3 notas
        System.out.println("Digite las 3 calificaciones separadas por espacio: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1+nota2+nota3;

        System.out.println("\nLa suma es:"+suma);
    }
}
