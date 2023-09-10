/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesElectrodomestico;

/**
 *
 * @author never
 */
public class Lavadora  extends Electrodomestico{
   private double carga;

    // Constructor vacío
    public Lavadora() {
        super();
        this.carga = 5;
    }
    
    // Método getter para obtener el valor de la carga
    public double getCarga() {
        return carga;
    }

    // Método setter para asignar el valor de la carga
    public void setCarga(double carga) {
        this.carga = carga;
    }

    // Constructor con la carga y el resto de atributos heredados
    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Métodos getters y setters para la carga

    // Método para llenar los atributos de la lavadora
    public void crearLavadora() {
        crearElectrodomestico(); // Llenamos los atributos heredados del padre
        // Aquí puedes solicitar al usuario que ingrese el valor para la carga y asignarlo al atributo de la lavadora.
    }

    // Método para calcular el precio final de la lavadora
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Invocamos el método del padre para calcular el precio base

        if (carga > 30) {
            precioFinal += 500;
        }
        System.out.println("El precio final de la lavadora es= "+precioFinal);
        return precioFinal;
    } 
}
