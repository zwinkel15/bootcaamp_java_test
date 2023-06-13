package tarea_5;

import java.util.Scanner;
/*
Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/

public class Question_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el nombre de tu perro?");
        String nombrePerro = sc.nextLine();
        System.out.println("Ingrese la cantidad de años del perro por favor!! =>");
        Integer edadPerro = sc.nextInt();

        Integer edadAñosDePerro = edadPerro * 7;

        System.out.println("Su perro de nombre " + nombrePerro + " tiene la edad en años perros de " + edadAñosDePerro);


    }
}