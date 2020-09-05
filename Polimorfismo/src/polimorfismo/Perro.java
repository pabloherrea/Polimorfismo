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
public class Perro extends Animal{

    public Perro(String nombre, String tipo_alimentación, int edad) {
        super(nombre, tipo_alimentación, edad);
    }

 
    @Override
    public void alimentarse() {
        System.out.println("me alimento de concentrado");
    }

    /**
     *
     */
    @Override
    public void corer() {
        System.out.println("corro muy veloz con mis cuatro patas");
    }
    
}
