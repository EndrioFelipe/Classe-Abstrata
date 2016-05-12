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
public class Gato extends Mamifero {
    private String raca;

    @Override
    public String amamentar() {
        super.setNome("gato");
        
        return "Põe a boca de "+super.getNome()+" na teta e mama.";        
    }
    
    @Override 
    public String emitirSom(){
        return "Miau";
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
