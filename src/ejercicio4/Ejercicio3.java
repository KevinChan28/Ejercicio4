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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int cant;
        int i=0;
        float suma=0;
        int num[];
        float prom=0;
        int mayor,menor;
   
        
        System.out.println("Ingresa la cantidad de numeros a pedir");
        cant=teclado.nextInt();
         num=new int[cant];
         
        while (i<cant) {
            System.out.println("Ingresa el numero ");
            num[i]=teclado.nextInt();
            
            suma=num[i]+suma;
            i=i+1;
            prom=suma/cant;
    
        }
        mayor=menor=num[0];
        while(i<cant){
         
     if(num[i]>mayor)
          
                 mayor=num[i];
         else
                 if(num[i]<menor)
                     menor=num[i];
    
        }
    
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+prom);
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        
    }
    
}
