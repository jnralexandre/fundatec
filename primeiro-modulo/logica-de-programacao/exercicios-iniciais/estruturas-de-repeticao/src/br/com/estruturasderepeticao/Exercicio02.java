package br.com.estruturasderepeticao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número inteiro para A: ");
        Scanner teclado = new Scanner(System.in);
        int numeroA = teclado.nextInt();

        System.out.println("Por fim, informe um valor para B: ");
        int numeroB = teclado.nextInt();

        for (int i = numeroA; i <= numeroB; i++) {
            System.out.println(i);
        }
    }

}
