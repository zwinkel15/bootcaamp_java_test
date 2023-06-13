package tarea_5;

import java.util.Scanner;

/*
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/
public class Question_5 {
    public static void main(String[] args) {
        double numeroAleatorio = Math.random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivine el numero que pienso==>");
        double numeroIntroducido = sc.nextDouble();
        if(numeroAleatorio == numeroIntroducido){
            System.out.println("adivinaste el numero y es = "+numeroIntroducido);

        }else {
            System.out.println("No adivinaste el numero y era ==> " + numeroAleatorio);
        }


    }



    }

