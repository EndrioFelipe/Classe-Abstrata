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
public class Cachorro extends Mamifero{
    
    private String tamanho;
    private String raca;

    public Cachorro(String nome, String tamanho, String raca) {
        nome = super.getNome();
        this.tamanho = tamanho;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "tamanho=" + tamanho + ", raca=" + raca + '}';
    }
    
    
    

    @Override
    public String amamentar() {
        super.setNome("cachorro");
        
        return "Põe a boca de "+super.getNome()+" na teta e mama.";      
    }
    
    @Override 
    public String emitirSom(){
        return "Au au";
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
