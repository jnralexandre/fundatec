package br.com.estruturasderepeticao02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numerosInformados = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Por favor, informe um número inteiro: ");
            numerosInformados = teclado.nextInt();

            int antecessor = numerosInformados - 1;
            System.out.printf("a) O antecessor é: %d%n", antecessor);

            int sucessor = numerosInformados + 1;
            System.out.printf("b) O sucessor é: %d%n", sucessor);

            double numeroAoQuadrado = Math.pow(numerosInformados, 2);
            System.out.printf("c) O número ao quadrado é: %f%n", numeroAoQuadrado);

            int numeroAoDobro = numerosInformados * 2;
            System.out.printf("d) O dobro do número é: %d%n", numeroAoDobro);

            double numeroMetade = numerosInformados / 2;
            System.out.printf("e) A metade do número é: %f%n", numeroMetade);
        }

    }

}
