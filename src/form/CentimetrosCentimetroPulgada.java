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
public class CentimetrosCentimetroPulgada extends Conversor{

    
    private static final Double UNA_PULGADA = 2.54;
    
    @Override
    public double convertirAValor2(double centimetros) {
     
    return centimetros / UNA_PULGADA;
    
    
    }

    @Override
    public double convertirAValor1(double pulgadas) {
    
    return pulgadas * UNA_PULGADA;
    
    }

    @Override
    public String toString() {
        return "Cm <-> Pul"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelValor1() {
        return "Centimetros"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelValor2() {
        return "Pulgadas"; //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
