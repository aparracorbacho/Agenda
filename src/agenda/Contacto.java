/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author MotherFoquita
 */
public class Contacto {
    Utils util = new Utils();
    String nombre, apellido, email;
    int numero;
    Contacto(){
        util.imprime("Introduce el nombre");
        this.nombre = util.qstring();
        util.imprime("Introduce el apellido");
        this.apellido = util.qstring();
        util.imprime("Introduce el email");
        this.email = util.qstring();
        util.imprime("Introduce el numero");
        this.numero = util.qint();
       
    }
    Contacto(String nombre, String apellido, String email, int numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numero = numero;
      
    }

       
}
