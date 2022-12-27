/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica02;

/**
 *
 * @author sofiv
 */
public class Problematica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite = 1;
        int operacion;
        String cadena = "";

        for (int tabla = 25; tabla >= limite; tabla--) {

            for (int num = 1; num <= 4; num++) {

                operacion = tabla * num;
                cadena = cadena + operacion + "\t";
            }
            cadena = cadena + "\n";
        }
        System.out.printf("N°\tx2\tx3\tx4\n%s", cadena);
    }

}
