package br.com.exercicioscomscanner;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        int antecessor = valor - 1;
        int sucessor = valor + 1;
        double valorAoQuadrado = Math.pow(valor, 2);
        double valorAoCubo = Math.pow(valor, 3);
        System.out.printf("O antecessor do seu número é: %d, " +
                "\nO sucessor é: %d, \nO valor ao quadrado é: %.0f, \nO valor ao cubo é: %.0f,", antecessor, sucessor, valorAoQuadrado, valorAoCubo);
        if (valor % 2 == 0) {
            System.out.println("\nO número é par");
        } else {
            System.out.println("\nO número é ímpar.");
        }
    }

}
