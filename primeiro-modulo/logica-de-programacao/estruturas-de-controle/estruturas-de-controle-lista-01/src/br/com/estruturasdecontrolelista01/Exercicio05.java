package br.com.estruturasdecontrolelista01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int numeroInformado = teclado.nextInt();

        int antecessor = numeroInformado - 1;

        if (antecessor % 2 == 0) {
            System.out.printf("O antecessor é par: %d%n", antecessor);
        } else {
            System.out.printf("O antecessor é ímpar: %d%n", antecessor);
        }

        if (antecessor > 0) {
            System.out.printf("O antecessor é positivo: %d%n", antecessor);
        } else if (antecessor < 0) {
            System.out.printf("O antecessor é negativo: %d%n", antecessor);
        } else {
            System.out.printf("O antecessor não é positivo e nem negativo: %d%n", antecessor);
        }
    }

}
