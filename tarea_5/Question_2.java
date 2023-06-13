package tarea_5;


import java.util.Scanner;

/*
Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas ==>");
        Double millas = sc.nextDouble();
        System.out.println("la conversion de "+ millas+" millas "+ " es "+ millas*1.60934);
    }

}
