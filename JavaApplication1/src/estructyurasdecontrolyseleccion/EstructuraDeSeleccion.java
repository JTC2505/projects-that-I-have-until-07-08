    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructyurasdecontrolyseleccion;
import java.util.Scanner;

/**
 *
 * @author estua
 */
public class EstructuraDeSeleccion {
    public static void main(String[] args){
        System.out.println("Ejemplo de la estructura de control simple");
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Adulto mayor");
        System.out.println("2. Adulto");
        System.out.println("3. Adolecente");
        System.out.println("4. niño");
        switch(edad){
            case 1:
                System.out.println("Edad mayor a 60 años");
                break;
            case 2:
                System.out.println("Edad de 18 a 59 años");
                break;
            case 3:
                System.out.println("Edad de 13 a 17 años");
                break;
            case 4:
                System.out.println("Edad menor a 13 años");
                break;
            default:
                System.out.println("edad no registrada");
                break;
             
        }
        
    }
}
