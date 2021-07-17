package model;

import java.util.Scanner;

/**
 * EntradaDatos
 */
public class EntradaDatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero;
        String name;

        System.out.println("Digite un numero: ");
        numero = entrada.nextFloat();
        System.out.println("Digite su nombre y apellidos: ");
        name = entrada.next();

        System.out.println("El numero digitado es: "+ numero);
        System.out.println("Su nombre es: "+name);

    }
}