package br.com.estruturasderepeticao02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numerosInformados = 0;
        int somaNumerosPositivos = 0;
        int quantidadeNumerosNegativos = 0;

        for (int i = 0; i < 20; i++) {
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
