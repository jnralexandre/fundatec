package br.com.estruturasderepeticaolista01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número inteiro maior que 1: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d é par.%n", i);
            } else {
                System.out.printf("%d%n", i);
            }
        }
    }

}
