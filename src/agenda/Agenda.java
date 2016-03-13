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
public class Agenda {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Utils util = new Utils();
        Gestion gestion = new Gestion();
        
        util.imprime("Bienvenido a tu libreta de contactos\nIntroduce tu nombre");
        String nagenda = util.qstring();
        //Agregamos los usuarios de prueba 
        gestion.agregarp();
        //Lanzamos el menu de la agenda
        gestion.menu();
        
    }
}
    

