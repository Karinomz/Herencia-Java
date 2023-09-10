/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHerencia;

import EntidadesElectrodomestico.Lavadora;
import EntidadesElectrodomestico.Televisor;

/**
 *
 * @author never
 */
public class JavaHerencia2 {
    public static void main(String[] args) {
        //Creamos una Lavadora
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        if ("blanco".equals(lavadora.getColor())) {
            System.out.println("Color no valido");
        }
        
        System.out.println("Se le otorgara un producto color "+lavadora.getColor());
        lavadora.precioFinal();

        //Creamos un Televisor
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        if ("blanco".equals(televisor.getColor())) {
           System.out.println("Color no valido"); 
        }
        
        System.out.println("Se le otorgara un producto color "+televisor.getColor());
        televisor.precioFinal();
        
        
  }
}
