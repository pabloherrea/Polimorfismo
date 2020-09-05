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
public abstract class Animal {

    private String nombre;
    private String tipo_alimentación;
    private int edad;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Animal(String nombre, String tipo_alimentación, int edad) {
        this.nombre = nombre;
        this.tipo_alimentación = tipo_alimentación;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentación() {
        return tipo_alimentación;
    }

    public void setTipo_alimentación(String tipo_alimentación) {
        this.tipo_alimentación = tipo_alimentación;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void alimentarse();
    
    public abstract void corer();

            }