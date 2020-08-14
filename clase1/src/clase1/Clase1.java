/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author stanley
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       funcionesMatematicasSuma Funciones = new funcionesMatematicasSuma();
//         System.out.println(Funciones.diviciones());
        coche miCarro = new coche("TOYOTA",2019,"ROJO");
        coche tuCarro = new coche("NISSAN",2019,"AZUL");
        
        System.out.println(miCarro.toString());
        System.out.println(tuCarro.toString());
    }
    
}
