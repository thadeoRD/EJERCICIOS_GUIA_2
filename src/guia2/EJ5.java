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
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
      int num;
      int doble;
      int triple;
      double raiz;
        System.out.println("Ingrese un numero entero: ");
        num=leer.nextInt();
        doble=num*2;
        triple=num*3;
        raiz=Math.sqrt(num);
        System.out.println("El doble es: "+doble);
        System.out.println("El triple es: "+triple);
        System.out.println("La raiz cuadrada es: "+raiz);
    }
    
}
