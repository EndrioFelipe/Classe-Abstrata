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
public class Papagaio extends Ave{

    @Override
    public String voar() {
       String s = "batendo as asas";
       s += " e flutuando no ar! WHOOOOOLL";
       return s;
    }
    
    @Override 
    public String emitirSom(){
        return "AAAArrrgrrhhhh";
    }
    
    
    
}
