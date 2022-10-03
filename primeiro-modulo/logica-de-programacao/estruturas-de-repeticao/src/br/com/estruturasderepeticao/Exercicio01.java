package br.com.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            int multiplicacao = numero * i;
            System.out.printf("%d * %d = %d%n", numero, i, multiplicacao);
        }
    }

}
