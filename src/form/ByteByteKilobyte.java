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
public class ByteByteKilobyte extends Conversor{

    private static final double UN_KB = 1000;
    
    @Override
    public double convertirAValor2(double B) {
        return B / UN_KB;
    }

    @Override
    public double convertirAValor1(double KB) {
        return KB * UN_KB;
    }

     @Override
    public String toString() {
        return "Kb <-> Bytes"; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getLabelValor1() {
         return "Byte"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabelValor2() {
         return "Kilobyte"; //To change body of generated methods, choose Tools | Templates.
    }
}
