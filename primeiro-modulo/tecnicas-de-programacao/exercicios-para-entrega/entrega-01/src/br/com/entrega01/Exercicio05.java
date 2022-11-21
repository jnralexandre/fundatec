package br.com.entrega01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] arrayA = new int[5];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Por favor, informe um valor de posição : " + i);
            arrayA[i] = teclado.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == i) {
                System.out.println("O valor informado e a posição do array são iguais.");
            } else {
                System.out.println("O valor informado e a posição do array não são iguais.");
            }
        }
    }

}
