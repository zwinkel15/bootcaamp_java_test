package tarea_5;


import java.util.Scanner;

/*
Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
* */
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio original del producto ==>");
        Double precioOriginal= sc.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento ==>");
        Double descuento = sc.nextDouble();
        Double precioFinal = (100-descuento)*precioOriginal/100;
        System.out.println("El precio final del producto es: " + precioFinal);
    }




}
