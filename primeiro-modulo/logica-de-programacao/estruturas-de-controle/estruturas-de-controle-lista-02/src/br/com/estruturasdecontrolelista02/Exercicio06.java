package br.com.estruturasdecontrolelista02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um valor inteiro para A: ");
        Scanner teclado = new Scanner(System.in);
        int valorA = teclado.nextInt();

        System.out.println("Por favor, informe um valor inteiro para B: ");
        int valorB = teclado.nextInt();

        int diferencaEntreValores = 0;

        if (valorA > valorB) {
            diferencaEntreValores = valorA - valorB;
            if (diferencaEntreValores > 1000) {
                System.out.println("A difença é maior que 1000.");
                if (diferencaEntreValores % 2 == 0) {
                    System.out.println("Par");
                } else {
                    System.out.println("ímpar");
                }
            }
        } else {
            diferencaEntreValores = valorB - valorA;
            if (diferencaEntreValores > 1000) {
                System.out.println("A difença é maior que 1000.");
                if (diferencaEntreValores % 2 == 0) {
                    System.out.println("Par");
                } else {
                    System.out.println("ímpar");
                }
            }
        }
    }

}
