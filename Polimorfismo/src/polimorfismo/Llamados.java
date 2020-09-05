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
public class Llamados {
    public static void main(String[] args) {
   Perro peero = new Perro("palomo","carnivoro",2);
   
   Gato gato = new Gato("canelo","carnivoro", 3);
   
   peero.alimentarse();
   
   gato.alimentarse();
   
   
          
   
}


}
