/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herançaclasseabstratapolimorfismofinal;

/**
 *
 * @author endrio
 */
public abstract class Mamifero extends Animal {

    

    
    
    public abstract String amamentar();
    
    @Override
    public String emitirSom() {
        return "nada";
    }
    
    
}
