package br.com.estruturasderepeticaolista01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;

        }
        if (soma > 100) {
            System.out.printf("O resultado é maior que 100: %d%n", soma);
        } else if (soma < 100) {
            System.out.printf("O resultado é menor que 100: %d%n", soma);
        } else {
            System.out.printf("O resultado é igual a 100: %d%n", soma);
        }
    }

}
