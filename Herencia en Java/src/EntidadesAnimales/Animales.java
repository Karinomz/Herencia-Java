/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesAnimales;

/**
 *
 * @author never
 */
public class Animales {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animales (String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void Alimentarse() {
        System.out.println(nombre + " se alimenta de " + alimento);
    }
    
    public void InformacionAnimal(){
        System.out.println("Es un "+raza+ " de unos "+edad+" años de edad" );
    }
}
