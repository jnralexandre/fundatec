package br.com.prova02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroCliente = 0;
        int somaPares = 0;
        int contadorPares = 0;
        int somaImpares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, informe um número positivo: ");
            numeroCliente = teclado.nextInt();

            if (numeroCliente % 2 == 0) {
                somaPares += numeroCliente;
                contadorPares++;
            } else {
                somaImpares += numeroCliente;
                contadorImpares++;
            }
        }

        System.out.printf("a) A soma dos pares é: %d%nb) A quantidade de pares digitados é: %d%nc) A soma dos ímpares é: %d%nd) A quantidade de ímpares digitados é: %d", somaPares, contadorPares, somaImpares, contadorImpares);
    }

}
