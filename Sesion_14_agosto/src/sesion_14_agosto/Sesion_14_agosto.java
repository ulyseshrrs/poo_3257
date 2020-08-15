/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_14_agosto;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import mx.lenovo.Computadora;

/**
 *
 * @author uliw8
 */
public class Sesion_14_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora cl=new Computadora();
        System.out.println(cl);
        Computadora c2= new Computadora("Lenovo", "LN2010",
                new Monitor("Samsung", 32),
                new Cpu("Intel", 3.2F, 8),
                null, null);
        System.out.println(c2);
        
    }
    
}
