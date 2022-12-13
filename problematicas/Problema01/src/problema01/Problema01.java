package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int veces;
        int contador;
        String nombre = " ";
        String posicion = " ";
        int edad = 0;
        double estatura = 0;
        System.out.println("Ingrese el número de jugadores a los que "
                + "ingresará información: ");
        veces = entrada.nextInt();

        for (contador = 1; contador <= veces; contador++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();

            String mensaje = String.format("%d. %s -%s-, edad %d, estatura %.2f" + "\n", 
             contador, nombre, posicion,edad, estatura);
            System.out.println("\n" + mensaje);
                
        }

        
    
    }

}
