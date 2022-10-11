package br.com.estruturasdecontrolelista03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um valor A: ");
        Scanner teclado = new Scanner(System.in);
        double valorA = teclado.nextDouble();

        System.out.println("Agora informe um valor B: ");
        double valorB = teclado.nextDouble();

        System.out.println("Por fim, informe um valor C: ");
        double valorC = teclado.nextDouble();

        if (valorA < valorB && valorA < valorC && valorB < valorC) {
            System.out.printf("Valores em ordem crescente: %n%f;%n%f;%n%f;", valorA, valorB, valorC);
        } else if (valorA < valorB && valorA < valorC && valorC < valorB) {
            System.out.printf("Valores em ordem crescente: %n%f;%n%f;%n%f;", valorA, valorC, valorB);
        } else if (valorB < valorA && valorB < valorC && valorA < valorC) {
            System.out.printf("Valores em ordem crescente: %n%f;%n%f;%n%f;", valorB, valorA, valorC);
        } else if (valorB < valorA && valorB < valorC && valorC < valorA) {
            System.out.printf("Valores em ordem crescente: %n%f;%n%f;%n%f;", valorB, valorC, valorA);
        } else if (valorC < valorA && valorC < valorB && valorA < valorB) {
            System.out.printf("Valores em ordem crescente: %n%f;%n%f;%n%f;", valorC, valorA, valorB);
        } else {
            System.out.printf("Valores em ordem crescente: %n%f;%n%f;%n%f;", valorC, valorB, valorA);
        }

    }

}
