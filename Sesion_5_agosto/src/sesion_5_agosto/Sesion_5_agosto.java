/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5_agosto;

import ico.fes.poo.Automovil;   /*Paquete*/

/**
 *
 * @author uliw8
 */
public class Sesion_5_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Automovil miCarro=new Automovil();  /*objeto1*/
       // miCarro.marca="VW";
        miCarro.subMarca="Golf";
        float x =miCarro.setMarca(mar)
        //miCarro.modelo=1990;
        //miCarro.color="Gris";
        miCarro.setModelo(1990);
        float x = miCarro.avanzar(1000);
        System.out.println("Avanzados="+ x);
       //  TODO code application logic here
        
        Automovil miCarroDos=new Automovil();  /*objeto2*/
        //miCarroDos.marca="Ford";
        //miCarroDos.subMarca="Mustang";
        //miCarroDos.modelo=2010;
        //miCarroDos.color="Amarillo";
        System.out.println("Avanzados"+miCarroDos.avanzar(500));
        
        
        Automovil miCarroTres=new Automovil(); /*objeto3*/
        //miCarroDos.marca="Acura";
        //miCarroDos.subMarca="NSX";
        //miCarroDos.modelo=2013;
        //miCarroDos.color="Gris";
        //System.out.println("avanzados"+miCarroTres.avanzar(500));
        //System.out.println(miCarro.toString()); // povee informacion al usuario
    }
    
}
