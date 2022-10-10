package br.com.estruturasdecontrolelista02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número A: ");
        Scanner teclado = new Scanner(System.in);
        double numeroA = teclado.nextDouble();

        System.out.println("Por fim, informe um número B: ");
        double numeroB = teclado.nextDouble();

        if (numeroA < numeroB) {
            System.out.printf("O menor número é: %f%n", numeroA);
        } else if (numeroB < numeroA) {
            System.out.printf("O menor número é: %f%n", numeroB);
        }
    }

}
