package br.com.entrega05;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        int idadeCliente = 0;
        int quantidadeIdadesMenores = 0;
        int quantidadeIdadesMaiores = 0;

        Scanner teclado = new Scanner(System.in);

        while (idadeCliente >= 0) {
            System.out.println("Por favor, informe sua idade: ");
            idadeCliente = teclado.nextInt();

            if (idadeCliente < 21 && idadeCliente >= 0) {
                quantidadeIdadesMenores++;
            } else if (idadeCliente > 50 && idadeCliente >= 0) {
                quantidadeIdadesMaiores++;
            }
        }

        System.out.printf("a) A quantidade de pessoas com idade abaixo de 21 anos é: %d%nb) A quantidade de pessoas com idade acima de 50 anos é: %d%n", quantidadeIdadesMenores, quantidadeIdadesMaiores);
    }

}
