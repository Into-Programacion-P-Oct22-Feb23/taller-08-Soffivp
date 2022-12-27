/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problematica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreJugador;
        String posicionJugador;
        int num;
        int contador;
        int promedioEdad = 0;
        int edad;
        double estatura;
        double promedioEstatura = 0;
        String mensaje = "";

        System.out.println("Ingrese la cantidad de jugadores  que "
                + "desea ingresar: ");
        num = entrada.nextInt();

        for (contador = 1; contador <= num; contador++) {
            entrada.nextLine();

            System.out.println("Ingrese el nombre del jugador:");
            nombreJugador = entrada.nextLine();

            System.out.println("Ingrese la posicion en el campo:");
            posicionJugador = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            promedioEdad = promedioEdad + edad;
            promedioEstatura = promedioEstatura + estatura;
            mensaje = String.format("%s%d. %s -%s-, edad %d, estatura %.2f"
                    + "\n",
                    mensaje,
                    contador,
                    nombreJugador,
                    posicionJugador,
                    edad,
                    estatura);
        }
        promedioEstatura = promedioEstatura / num;
        promedioEdad = promedioEdad / num;
        System.out.printf("Listado de edades.%sPromedio de edades:%s "
                + "Promedio de estaturas:%.2f",
                mensaje,
                promedioEdad,
                promedioEstatura);

    }

}
