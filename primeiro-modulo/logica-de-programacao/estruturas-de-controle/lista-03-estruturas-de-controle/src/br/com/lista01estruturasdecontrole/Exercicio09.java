package br.com.lista01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um valor A: ");
        Scanner teclado = new Scanner(System.in);
        double valorA = teclado.nextDouble();

        System.out.println("Agora, informe um valor B: ");
        double valorB = teclado.nextDouble();

        System.out.println("Por fim, informe um valor C: ");
        double valorC = teclado.nextDouble();

        double somaValorAComValorB = valorA + valorB;

        if (somaValorAComValorB >= valorC) {
            System.out.printf("A soma dos valores A + B são maiores que valor C.%nSoma de A + B: %f, valor C: %f", somaValorAComValorB, valorC);
        } else {
            System.out.printf("A soma dos valores A + B são menores que valor C.%nSoma de A + B: %f, valor C: %f", somaValorAComValorB, valorC);
        }
    }

}
