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
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Utils util = new Utils();
        Gestion gestion = new Gestion();
        
        util.imprime("Bienvenido a tu libreta de contactos\nIntroduce tu nombre");
        String nagenda = util.qstring();
        gestion.agregarp();
        gestion.menu();
        
    }
}
    

