/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesElectrodomestico;

import java.util.Scanner;

/**
 *
 * @author never
 */
public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constructor vacío
    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }

    // Constructor con todos los atributos pasados por parámetro
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Métodos getters y setters

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color =comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

    // Método para comprobar el consumo energético
    private char comprobarConsumoEnergetico(char letra) {
        char[] letrasValidas = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char c : letrasValidas) {
            if (Character.toUpperCase(letra) == c) {    
                return Character.toUpperCase(letra);
            }
        }
        return 'F'; // Letra por defecto si no es correcta
    }

    // Método para comprobar el color
    private String comprobarColor(String color) {
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String c : coloresValidos) {
            if (color.equalsIgnoreCase(c)) {
                return c;
            }    
        }
        return "blanco"; // Color por defecto si no es correcto
    }

    // Método para llenar los atributos del electrodoméstico
    public void crearElectrodomestico() {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del electrodoméstico: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el color del electrodoméstico: ");
        String color = scanner.next();

        System.out.print("Ingrese el consumo energético del electrodoméstico (letra entre A y F): ");
        char consumoEnergetico = scanner.next().charAt(0);

        System.out.print("Ingrese el peso del electrodoméstico: ");
        double peso = scanner.nextDouble();

        // Asignamos los valores ingresados a los atributos del electrodoméstico
        setPrecio(precio);
        setColor(color);
        setConsumoEnergetico(consumoEnergetico);
        setPeso(peso);
        }

    // Método para calcular el precio final
    public double precioFinal() {
        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}
