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
public class EstructuraControlAnidado {
    public static void main(String[] args){
        System.out.println("Ejemplo de la estructura de control simple");
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Edad: ");
        edad = teclado.nextInt();
        if(edad >= 60){
            System.out.println("adulto mayor");
        }else if(edad >= 18 && edad <= 59){
            System.out.println("adulto");
        }
        else if(edad >= 13 && edad <= 17){
            System.out.println("adolecente");
        }else{
            System.out.println("niño");
        }
        
    }
}
