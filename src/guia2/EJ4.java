/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;
import java.util.Scanner;
/**
 *
 * @author Thadeo RD
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gradoc;
        int gradof;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados");
        gradoc=leer.nextInt();
        gradof=32+(9*gradoc/5);
        System.out.println("La temperatura en grados Fahrenheit es: "+gradof);
    }
    
}
