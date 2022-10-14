package br.com.entrega05;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        boolean continua = true;
        int numeroInformado = -1;
        int somaPositivos = 0;
        int quantidadePositivos = 0;
        int somaNegativos = 0;
        int quantidadeNegativos = 0;
        int quantidadeNumerosParesPositivos = 0;

        Scanner teclado = new Scanner(System.in);

        while (continua) {
            System.out.println("Por favor, informe um número: ");
            numeroInformado = teclado.nextInt();

            if (numeroInformado == 0) {
                continua = false;
                break;
            }

            if (numeroInformado > 0) {
                somaPositivos += numeroInformado;
                quantidadePositivos++;
            } else {
                somaNegativos += numeroInformado;
                quantidadeNegativos++;
            }

            if (numeroInformado % 2 == 0) {
                quantidadeNumerosParesPositivos++;
            }

        }

        double mediaPositivos = somaPositivos / quantidadePositivos;
        double mediaNegativos = somaNegativos / quantidadeNegativos;

        System.out.printf("a) A soma dos positivos é: %d%nb) A soma dos negativos é: %d%nc) A média dos positivos é: %f%nd) A média dos negativos é: %f%ne) Quantidade de números pares positivos: %d", somaPositivos, somaNegativos, mediaPositivos, mediaNegativos, quantidadeNumerosParesPositivos);
    }

}
