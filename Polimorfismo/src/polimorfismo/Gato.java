/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Usuario
 */
public class Gato extends Animal{

    public Gato(String nombre, String tipo_alimentación, int edad) {
        super(nombre, tipo_alimentación, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("soy carnivoro");
    }

    @Override
    public void corer() {
        System.out.println("corro con cuatro patas");
    }
    
}
