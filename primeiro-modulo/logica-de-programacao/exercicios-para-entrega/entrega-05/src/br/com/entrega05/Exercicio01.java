package br.com.entrega05;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int numerosPositivos = 0;
        int somaPares = 0;
        int somaImpares = 0;
        boolean continua = true;

        Scanner teclado = new Scanner(System.in);

        while (continua) {
            System.out.println("Por favor, informe números inteiros positivos: ");
            numerosPositivos = teclado.nextInt();

            if (numerosPositivos > 1000) {
                continua = false;
            } else if (numerosPositivos % 2 == 0) {
                somaPares += numerosPositivos;
                System.out.printf("A soma dos números pares é: %d%n", somaPares);
            } else {
                somaImpares += numerosPositivos;
                System.out.printf("A soma dos números ímpares é: %d%n", somaImpares);
            }
        }
    }

}
