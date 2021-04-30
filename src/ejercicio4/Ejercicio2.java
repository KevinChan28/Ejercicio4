/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int numero;
        int cont=1;
        int suma=0;
        int media=0;
               
        System.out.println("Ingrese un numero");
        numero=teclado.nextInt();
        while (cont<=numero) {
            suma=suma+cont;
            cont=cont+1;
            media=suma/numero;
        }
        System.out.println("La suma es "+suma);
        System.out.println("La media es: "+media);
    }
    
}
