package br.com.slide01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe um valor A: ");
        Scanner teclado = new Scanner(System.in);
        double valorA = teclado.nextDouble();

        System.out.println("Informe um valor B: ");
        double valorB = teclado.nextDouble();

        if (valorA % valorB == 0) {
            System.out.println("A é múltiplo de B.");
        } else {
            System.out.println("A não é múltiplo de B.");
        }

    }

}