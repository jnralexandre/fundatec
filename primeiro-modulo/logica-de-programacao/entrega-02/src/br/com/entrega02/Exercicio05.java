package br.com.entrega02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Informe um valor A: ");
        Scanner teclado = new Scanner(System.in);
        double valorA = teclado.nextDouble();

        System.out.println("Informe um valor B: ");
        double valorB = teclado.nextDouble();

        System.out.println("Informe um valor C: ");
        double valorC = teclado.nextDouble();

        double mediaValores = (valorA + valorB + valorC) / 3;

        if (valorA > valorB && valorA > valorC && valorB > valorC) {
            System.out.printf("O maior valor é: %f%nA média dos valores é: %f", valorA, mediaValores);
        } else if (valorA > valorB && valorA > valorC && valorC > valorB) {
            System.out.printf("O maior valor é: %f%nA média dos valores é: %f", valorA, mediaValores);
        } else if (valorB > valorA && valorB > valorC && valorA > valorC) {
            System.out.printf("O maior valor é: %f%nA média dos valores é: %f", valorB, mediaValores);
        } else if (valorB > valorA && valorB > valorC && valorC > valorA) {
            System.out.printf("O maior valor é: %f%nA média dos valores é: %f", valorB, mediaValores);
        } else if (valorC > valorA && valorC > valorB && valorA > valorB) {
            System.out.printf("O maior valor é: %f%nA média dos valores é: %f", valorC, mediaValores);
        } else {
            System.out.printf("O maior valor é: %f%nA média dos valores é: %f", valorC, mediaValores);
        }
    }

}
