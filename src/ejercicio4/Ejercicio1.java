/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author USER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=102;
        int i=1;
        long fact=1;
        while (i<=num) {
            fact=fact*i;
            i=i+1;
            System.out.println("El factorial es: "+fact);
        }
        
    }
    
}
