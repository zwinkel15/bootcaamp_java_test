package tarea_5;

import java.util.Scanner;

/*4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/
public class Question_4 {
    public static void main(String[] args) {
        System.out.println("Ingrese el total de la cuenta de un restaurante por favor ==>");
        Scanner sc = new Scanner(System.in);
        Double cuentaRestaurante = sc.nextDouble();
        System.out.println("Que porcentaje de propina desea dejar?");
        Double porcentajePropina = sc.nextDouble();

        Double montoPropina = porcentajePropina*cuentaRestaurante/100;

        System.out.println("El monto total del la propina obtenida es = " + montoPropina);

    }
}
