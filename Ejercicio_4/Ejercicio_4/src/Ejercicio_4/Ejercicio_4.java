/**
 * Ejercicio_4
 Una compañia de venta de carros usados paga a su personal de ventas un salrio de $1000 mensuales
 mas una comisión de de $150 por cada carro vendido, mas el 5% del valor  de la venta por carro.
 Cada mes el capturista de la empresa ingresa en la computadora los datos petinentes.
 Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 */
package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double carros,valorCarros,nomina;
        System.out.println("Ingrese el numero de carros vendidos: $");
        carros = entrada.nextDouble();
        System.out.println("Ingrese el monto vendido: $");
        valorCarros = entrada.nextDouble();

        nomina = 1000 + (150*carros)+(valorCarros*0.05);

        System.out.println("La nomina es: $"+nomina);
        }
    
}