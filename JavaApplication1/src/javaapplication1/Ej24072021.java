/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author estua
 */
public class Ej24072021 {
    public static void main ( String[] args ) { 
        float numero1 = 90.5f;
        float numero2 = 89.5f;
        
        System.out.println("La suma es: " + (numero1 + numero2));
        System.out.println("La resta es: " + (numero1 - numero2));
        System.out.println("La multiplicacion es: " + (numero1 * numero2));
        if(numero2 != 0){
            System.out.println("La division es: " + (numero1 / numero2));
        }else{
            System.out.println("No se puede dividir entre 0");
        }
        
    }
}
