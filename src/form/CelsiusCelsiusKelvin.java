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
public class CelsiusCelsiusKelvin extends Conversor {

    private static final double UN_KELVIN = 273.15;
    
    @Override
    public double convertirAValor2(double celsius) {
        return celsius + UN_KELVIN;
    }

    @Override
    public double convertirAValor1(double celsius) {
        return celsius - UN_KELVIN;
    }

     @Override
    public String toString() {
        return "Cels <-> Kelv"; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getLabelValor1() {
         return "Celsius"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelValor2() {
         return "Kelvin"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
