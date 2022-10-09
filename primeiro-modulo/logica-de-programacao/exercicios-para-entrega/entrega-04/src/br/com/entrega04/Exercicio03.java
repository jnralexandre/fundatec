package br.com.entrega04;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.printf("Os números múltiplos são: %d%n", i);
            }
        }

    }

}
