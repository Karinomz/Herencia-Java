/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHerencia;

import EntidadesElectrodomestico.Electrodomestico;
import EntidadesElectrodomestico.Lavadora;
import EntidadesElectrodomestico.Televisor;
import java.util.ArrayList;

/**
 *
 * @author never
 */
public class JavaHerencia3 {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        // Agregar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados
        Lavadora lavadora1 = new Lavadora(1500, "blanco", 'B', 40, 10);
        Lavadora lavadora2 = new Lavadora(2000, "gris", 'A', 60, 12);
        Televisor televisor1 = new Televisor(2500, "negro", 'A', 20, 42, true);
        Televisor televisor2 = new Televisor(1800, "azul", 'C', 15, 32, false);

        // Agregar los electrodomésticos al ArrayList
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);

        double precioTotalElectrodomesticos = 0;
        double precioTotalTelevisores = 0;
        double precioTotalLavadoras = 0;

        // Recorrer el ArrayList y ejecutar el método precioFinal() en cada electrodoméstico
        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            } else if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            }
        }

        System.out.println("Precio total de todos los electrodomésticos: $" + precioTotalElectrodomesticos);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
    }
}
