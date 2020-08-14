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
public class coche {
    private String Marca;
    private int Año;
    private String Color;
    
    
    public coche(String pMarca,int pAño,String pColor){
    
    Marca = pMarca;
    Año = pAño;
    Color = pColor;
    
    }

    @Override
    public String toString() {
        return "coche{" + "Marca=" + Marca + ", A\u00f1o=" + Año + ", Color=" + Color + '}';
    }
    
    
    
}
