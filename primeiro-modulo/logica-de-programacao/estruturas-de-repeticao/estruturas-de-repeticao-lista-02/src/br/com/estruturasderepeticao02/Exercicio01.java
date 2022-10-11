package br.com.estruturasderepeticao02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.println("Por favor, informe sua média final: ");
            double mediaFinal = teclado.nextDouble();

            System.out.println("Por fim, informe o número de faltas que você teve: ");
            int numeroFaltas = teclado.nextInt();

            if (mediaFinal >= 7 && numeroFaltas < 15) {
                System.out.println("a) Parabéns, você foi aprovado por média e presença.");
            } else if (mediaFinal >= 7 && numeroFaltas >= 15) {
                System.out.println("b) Você foi aprovado por média, mas foi reprovado por presença.");
            } else if (mediaFinal < 7 && numeroFaltas < 15) {
                System.out.println("c) Você foi reprovado por média, mas foi aprovado por presença.");
            } else if (mediaFinal < 7 && numeroFaltas > 15) {
                System.out.println("d) Você foi reprovado por média e por presença.");
            }
        }
    }

}
