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

import java.util.Scanner;

public class Ex31072021 {
    public static void main ( String[] args ) { 
        Scanner entrada = new Scanner(System.in);
        Float numero;
        
            System.out.println("Digite un numero: ");
            numero = entrada.nextFloat();
            
            System.out.println("El numero es: " + numero);
            
        String cadena;
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        
        System.out.println("La cadena es: " + cadena);
    }
}
