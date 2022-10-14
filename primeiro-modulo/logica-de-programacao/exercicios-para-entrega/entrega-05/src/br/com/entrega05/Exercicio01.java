package br.com.entrega05;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int numeroInformado = 0;
        int somaPares = 0;
        int somaImpares = 0;

        Scanner teclado = new Scanner(System.in);

        while (numeroInformado < 1000) {
            System.out.println("Por favor, informe um número inteiro e positivo: ");
            numeroInformado = teclado.nextInt();

            if (numeroInformado % 2 == 0 && numeroInformado < 1001) {
                somaPares += numeroInformado;
            } else if (numeroInformado % 2 != 0 && numeroInformado < 1001) {
                somaImpares += numeroInformado;
            }
        }

        System.out.printf("A soma dos números pares é: %d%nA soma dos números ímpares é: %d%n", somaPares, somaImpares);
    }

}
