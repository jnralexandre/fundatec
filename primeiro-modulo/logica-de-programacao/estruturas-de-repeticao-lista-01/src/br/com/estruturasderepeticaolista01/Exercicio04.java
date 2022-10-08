package br.com.estruturasderepeticaolista01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Por favor, informe um número inteiro: ");
            int numero = teclado.nextInt();
            if (i == 0) {
                maior = numero;
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        System.out.printf("O número maior é: %d%nO número menor é: %d", maior, menor);
    }

}


