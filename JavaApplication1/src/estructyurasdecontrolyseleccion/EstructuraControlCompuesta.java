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
public class EstructuraControlCompuesta {
    public static void main(String[] args){
        System.out.println("Ejemplo de la estructura de control simple");
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Edad: ");
        edad = teclado.nextInt();
        if(edad > 18){
            System.out.println("saque su dpi");
        }else{
            System.out.println("es menor");
        }
    }
}
