package br.com.prova02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continua = true;
        int numeroCliente = 0;
        int somaNumerosPositivos = 0;
        int contadorPositivos = 0;
        int somaNegativos = 0;
        int multiplicacaoNegativos = 0;
        int contadorNegativos = 0;
        String opcao = "S";

        while (continua) {
            System.out.println("Por favor, informe um valor inteiro: ");
            numeroCliente = teclado.nextInt();

            if (numeroCliente > 0) {
                somaNumerosPositivos += numeroCliente;
                contadorPositivos++;
            }

            if (numeroCliente < 0) {
                somaNegativos = numeroCliente;
                multiplicacaoNegativos = -(somaNegativos) * (somaNegativos);
                contadorNegativos++;
            }

            teclado.nextLine();

            System.out.println("Você deseja continuar inserindo números? (S para Sim e N para não: ");
            opcao = teclado.nextLine();
            if (!opcao.equalsIgnoreCase("S")) {
                continua = false;
                break;
            }
        }

        System.out.printf("a) A soma dos números positivos é: %d%nb) A quantidade de números positivos é: %d%nc) A multiplicação dos números negativos é: %d%nd) A quantidade de valores negativos é: %d", somaNumerosPositivos, contadorPositivos, multiplicacaoNegativos, contadorNegativos);
    }

}
