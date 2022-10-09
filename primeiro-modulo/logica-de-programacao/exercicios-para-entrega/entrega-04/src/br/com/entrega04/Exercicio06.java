package br.com.entrega04;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
//        6. Escreva um algoritmo que leia 20 valores e ao final exiba:
//        a. a soma dos números positivos;
//        b. a quantidade de valores negativos.

        Scanner teclado = new Scanner(System.in);

        int numerosInformados = 0;
        int somaNumerosPositivos = 0;
        int quantidadeNumerosNegativos = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor, informe um número inteiro");
            numerosInformados = teclado.nextInt();
            if (numerosInformados > 0) {
                somaNumerosPositivos += numerosInformados;
            } else if (numerosInformados < 0) {
                quantidadeNumerosNegativos++;
            }
        }

        System.out.printf("A soma dos números positivos é: %d%nA quantidade de números negativos é: %d", somaNumerosPositivos, quantidadeNumerosNegativos);
    }

}
