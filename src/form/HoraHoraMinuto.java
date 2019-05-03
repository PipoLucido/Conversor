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
public class HoraHoraMinuto extends Conversor{
    
    private static final double UNA_HORA = 60;
    
    @Override
    public double convertirAValor2(double hora) {
     
    return hora * UNA_HORA;
    
    
    }

    @Override
    public double convertirAValor1(double minutos) {
    
    return minutos / UNA_HORA;
    
    }

    @Override
    public String toString() {
        return "Hs <-> Mn"; //To change body of generated methods, choose Tools | Templates.
    }
    
        @Override
    public String getLabelValor1() {
        return "Minutos"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelValor2() {
        return "Horas"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
