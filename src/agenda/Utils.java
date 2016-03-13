/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 * @version 1.0
 */
public class Utils {
    //Estos metodos se usarán para no repetir codigo
    
    /**
     * @param texto Se imprimira el texto que se envie a traves del metodo
     */
      public void imprime(String texto){
        System.out.println(texto);
    }
     /**
     * @return Devuelve un valor string despues de pedirlo al usuario
     */
     public String qstring(){
         Scanner respuestaTeclado = new Scanner(System.in);
         String respuesta = respuestaTeclado.nextLine();
         return respuesta;
     }
     /**
     * @return Devuelve un valor int despues de pedirlo al usuario
     */
      public int qint(){
         Scanner respuestaTeclado = new Scanner(System.in);
         int respuesta = respuestaTeclado.nextInt();
         return respuesta;
     }
    
}
