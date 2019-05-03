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
public abstract class Conversor {
    
    
   public abstract double convertirAValor2(double valor1);
   public abstract double convertirAValor1(double valor2);
    //si tenemos un metodo abstracto en una clase, la clase debe ser abstracta

   public abstract String getLabelValor1();
   public abstract String getLabelValor2();
   
   
    @Override
    public String toString() {
        return "Conversor{" + '}';
    }
   
   
   
   
}
