import java.util.Scanner;

/**
 * Ejercicio_3
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,suma;

        System.out.println("Digite el dinero que tiene Guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        suma = guillermo+luis+juan;
        System.out.println("Guillermo tiene: $"+guillermo);
        System.out.println("Luis tiene: $"+luis);
        System.out.println("Juan tiene: $"+juan);
        System.out.println("Los tres tienen en total: $"+suma);
    }
}