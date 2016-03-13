/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author MotherFoquita
 */
public class Gestion {
    ArrayList<Contacto> contactos = new ArrayList<>();
    Utils util = new Utils();
    int salir = 0;
    int osalir = 0;
    
    
    public void agregar(){
        contactos.add(new Contacto());
    }
    public void ver(){
        for (int i=0;i<contactos.size();i++){
        util.imprime(" Nombre: "+contactos.get(i).nombre+" Apellido: "+contactos.get(i).apellido+" Email: "+contactos.get(i).email+" Numero: "+contactos.get(i).numero);      
        }      
    }
    
    public void eliminar(){
        util.imprime("Que contacto quieres eliminar? Indica el nombre");
        String bnombre = util.qstring();
        int contador = 0;
         for (int i=0;i<contactos.size();i++){
             if (bnombre.equals(contactos.get(i).nombre)){
                 contactos.remove(i);
                 util.imprime("Contacto borrado");
                }
         }
        if (contador ==0) { util.imprime("El contacto que quieres buscar no existe"); }
    }
   
     public void buscar(){
        util.imprime("Que contacto quieres buscar? Indica el nombre");
        String bnombre = util.qstring();
        int contador = 0;
         for (int i=0;i<contactos.size();i++){
             if (bnombre.equals(contactos.get(i).nombre)){
                 util.imprime("Nombre: "+contactos.get(i).nombre+" Apellido: "+contactos.get(i).apellido+" Email: "+contactos.get(i).email+" Numero: "+contactos.get(i).numero);
                 contador++;
                }
         }
         if (contador ==0) { util.imprime("El contacto que quieres buscar no existe"); }
    }
    public void menu(){
    do{
    tmenu();
    util.imprime("Elige tu opcion");
        int Opcion = util.qint();
        switch (Opcion){
            case 1:
               util.imprime("La lista de contactos es:");
               ver();
               pmenu();
               break;
            case 2:
                agregar();
                pmenu();
                break;
            case 3:
                eliminar();
                pmenu();
                break;
            case 4:
                buscar();
                pmenu();
                break;
            case 5:
                
                break;
            case 0:
                
                break;
            default:     
                util.imprime("No es una opcion valida, vuelve a probar");
                break;    
                
            
        }          
    }while (salir==0);
    }
    
    
    public void tmenu(){
         util.imprime("  Quieres ver la lista de contactos? (Opcion 1)\n  Quieres agregar un contacto? (Opcion 2)\n  Quieres eliminar un contacto? (Opcion 3)\n  Quieres buscar los datos de un contacto? (Opcion 4)\n  Quieres salir de la agenda (Opcion 0)");
    }
    public void pmenu(){
        util.imprime("Quieres ver el menu (Opcion 1) o salir de la agenda? (Opcion 2)");
        int omenu = util.qint();
        do {
        switch (omenu){
            case 1:
               menu();
               osalir = 1;
               break;
            case 2:
                osalir = 1;
                salir = 1;
               break;
            default:
                util.imprime("No es una opcion valida");
               break;
        }
      } while (osalir ==0);
   }
    
    
    
    public void agregarp(){
        // Agregamos contactos de prueba para tener en la agenda
        contactos.add(new Contacto("Nombre1","Apellido1","Email",111111111));
        contactos.add(new Contacto("Nombre2","Apellido2","Emai2",222222222));
        contactos.add(new Contacto("Nombre3","Apellido3","Emai3",333333333));
        contactos.add(new Contacto("Nombre4","Apellido4","Emai4",444444444));
        contactos.add(new Contacto("Nombre5","Apellido5","Emai5",555555555));
        contactos.add(new Contacto("Nombre6","Apellido6","Emai6",666666666));
        contactos.add(new Contacto("Nombre7","Apellido7","Emai7",777777777));
        contactos.add(new Contacto("Nombre8","Apellido8","Emai8",888888888));
        contactos.add(new Contacto("Nombre9","Apellido9","Emai9",999999999));
        contactos.add(new Contacto("Nombre10","Apellido10","Email0",658974568));
    }
    
}

