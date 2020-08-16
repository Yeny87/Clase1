/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author Sandra
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
//        funcionesMatematicasSuma Funciones = new funcionesMatematicasSuma(); 
//        System.out.println(Funciones.Division());
       

    Coche miCarro = new Coche("TOYOTA",2019,"ROJO");
    Coche tuCarro = new Coche("Nissan",2019,"Azul");
    Coche CarroConMasParametros = new Coche("Nissan",2019,"Azul",4);
    
//        System.out.println(tuCarro.toString());
        System.out.println(miCarro.toString());
    }
    
}
