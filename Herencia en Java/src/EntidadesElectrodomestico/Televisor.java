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
public class Televisor extends Electrodomestico{
    private int resolucion; // En pulgadas
    private boolean sintonizadorTDT;

    // Constructor vacío
    public Televisor() {
        super();
        this.resolucion = 32;
        this.sintonizadorTDT = false;
    }

    // Constructor con la resolucion, sintonizador TDT y el resto de atributos heredados
    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Método getter para obtener el valor de la resolución
    public int getResolucion() {
        return resolucion;
    }

    // Método setter para asignar el valor de la resolución
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    // Método getter para obtener el valor del sintonizador TDT
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // Método setter para asignar el valor del sintonizador TDT
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Método para llenar los atributos del televisor
    public void crearTelevisor() {
        crearElectrodomestico(); // Llenamos los atributos heredados del padre
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la resolución del televisor (en pulgadas): ");
        int resolucion = scanner.nextInt();

        System.out.print("¿El televisor tiene sintonizador TDT? (Si/No): ");
        char tieneTDT = scanner.next().charAt(0);

        // Convertimos el char ingresado por el usuario a un booleano
        boolean sintonizadorTDT = (tieneTDT == 'S' || tieneTDT == 's');
        setResolucion(resolucion);
        setSintonizadorTDT(sintonizadorTDT);
    }

    // Método para calcular el precio final del televisor
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Invocamos el método del padre para calcular el precio base

        if (resolucion > 40) {
            precioFinal += precioFinal * 0.3; // Incremento del 30% si la resolución es mayor a 40 pulgadas
        }

        if (sintonizadorTDT==true) {
            precioFinal += 500;
        }
        System.out.println("El precio final del televisor es= "+precioFinal);
        return precioFinal;
    }
}
