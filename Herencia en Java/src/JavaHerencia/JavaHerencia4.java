/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHerencia;

import EntidadesGeometria.CalculosFormas;
import EntidadesGeometria.Circulo;
import EntidadesGeometria.Rectangulo;

/**
 *
 * @author never
 */
public class JavaHerencia4 {
     public static void main(String[] args) {
        CalculosFormas circulo = new Circulo(5);
        CalculosFormas rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}
