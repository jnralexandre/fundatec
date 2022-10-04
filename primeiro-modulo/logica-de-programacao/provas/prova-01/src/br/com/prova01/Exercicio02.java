package br.com.prova01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um valor para N1: ");
        Scanner teclado = new Scanner(System.in);
        double n1 = teclado.nextDouble();

        System.out.println("Agora, informe um valor para N2: ");
        double n2 = teclado.nextDouble();

        System.out.println("Escolha somente uma letra entre as opções A, B, C, D, E");

        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'A':
                double n1AoQuadrado = Math.pow(n1, 2);
                double n2AoCubo = Math.pow(n2, 3);
                double soma = n1AoQuadrado + n2AoCubo;
                System.out.printf("%n%f", soma);
                break;
            case 'B':
                double percentualPrimeiroNumero = n1 - (n1 * 0.43);
                System.out.printf("%n%f", percentualPrimeiroNumero);
                break;
            case 'C':
                double n2PercentualAumento = n2 + (n2 * 0.27);
                System.out.printf("%n%f", n2PercentualAumento);
                break;
            case 'D':
                if (n1 % n2 == 0) {
                    System.out.printf("%nO primeiro número é múltiplo do segundo número.");
                } else {
                    System.out.printf("%nO primeiro número não é múltiplo do segundo número.");
                }
                break;
            case 'E':
                if (n1 % 2 == 0) {
                    System.out.printf("%nO primeiro número é par.");
                } else {
                    System.out.printf("%nO primeiro número é ímpar.");
                }

                if (n2 > 0) {
                    System.out.printf("%nO segundo número é positivo.");
                } else if (n2 < 0) {
                    System.out.printf("%nO segundo número é negativo.");
                } else if (n2 == 0) {
                    System.out.printf("%nO segundo número é neutro.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

}
