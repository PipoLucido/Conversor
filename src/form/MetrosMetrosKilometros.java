/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Rodrigo
 */
public class MetrosMetrosKilometros extends Conversor{
    
    
    private static final double UN_KILOMETRO = 1000;
    
    @Override
    public double convertirAValor2(double metros) {
     
    return metros/ UN_KILOMETRO;
    
    
    }

    @Override
    public double convertirAValor1(double kilometros) {
    
    return kilometros * UN_KILOMETRO;
    
    }

    @Override
    public String toString() {
        return "M <-> Km"; //To change body of generated methods, choose Tools | Templates.
    }
    
        @Override
    public String getLabelValor1() {
        return "Metros"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelValor2() {
        return "Kilometros"; //To change body of generated methods, choose Tools | Templates.
    }

}
