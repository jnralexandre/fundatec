package br.com.entrega05;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int numeroInformado = 0;
        int quantidadeNumerosInformados = 0;
        int somaTodosNumeros = 0;
        int somaPares = 0;
        int somaImpares = 0;
        boolean continua = true;

        Scanner teclado = new Scanner(System.in);

        while (continua) {
            System.out.println("Por favor, informe números positivos: ");
            numeroInformado = teclado.nextInt();

            if (numeroInformado <= 0) {
                continua = false;
            }

            if (numeroInformado > 0) {
                quantidadeNumerosInformados++;
            }

            somaTodosNumeros += numeroInformado;

            if (numeroInformado % 2 == 0) {
                somaPares += numeroInformado;
            } else {
                somaImpares += numeroInformado;
            }
        }

        System.out.printf("A quantidade de números informados foi: %d%nA soma de todos os números informados é: %d%nA soma dos pares é: %d%nA soma dos ímpares é: %d%n", quantidadeNumerosInformados, somaTodosNumeros, somaPares, somaImpares);
    }

}
