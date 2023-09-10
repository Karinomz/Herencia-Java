/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHerencia;

import EntidadesAnimales.Caballo;
import EntidadesAnimales.Gato;
import EntidadesAnimales.Perro;

/**
 *
 * @author never
 */
public class JavaHerencia1 {
     public static void main(String[] args) {
        // Declaración del objeto PERRO
        Perro perro = new Perro("Stich", "Carne", 15, "Doberman");
        perro.Alimentarse();
        perro.InformacionAnimal();

        // Declaración de otro objeto PERRO
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        perro1.InformacionAnimal();
        // Declaración del objeto Gato
        Gato gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();
        gato.InformacionAnimal();
        // Declaración del objeto Caballo
        Caballo caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
        caballo.InformacionAnimal();
    }
}
