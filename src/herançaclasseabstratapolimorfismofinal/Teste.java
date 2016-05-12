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
public class Teste {
    
    public static void main(String[] args) {
        //classes abstratas não podem ser instanciadas na classe teste
    Mamifero cao = new Cachorro("Cachorro", "1m", "vira-lata");
    
    System.out.println(cao);
    System.out.println(cao.emitirSom());
    System.out.println(cao.amamentar());
    
    }


    
}
