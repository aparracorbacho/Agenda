/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author aparracorbacho
 * @version 1.0
 */
public class Contacto {
    //Atributos usado para los contactos
    Utils util = new Utils();
    String nombre, apellido, email;
    int numero;
    /**
     * Agregamos un contacto preguntando el usuario los campos
     */
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
    /**
     * Usamos este para agregar los uaurios de prueba al inicio
     */
    Contacto(String nombre, String apellido, String email, int numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numero = numero;
      
    }

       
}
