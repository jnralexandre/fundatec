package br.com.estruturasdecontrolelista01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um valor para A: ");
        Scanner teclado = new Scanner(System.in);
        double valorA = teclado.nextDouble();

        System.out.println("Por favor, informe um valor para A: ");
        double valorB = teclado.nextDouble();

        System.out.println("Por favor, informe um valor para A: ");
        double valorC = teclado.nextDouble();

        if (valorA > valorB && valorA > valorC) {
            System.out.printf("O maior valor é A: %f", valorA);
        } else if (valorB > valorA && valorB > valorC) {
            System.out.printf("O maior valor é B: %f", valorB);
        } else {
            System.out.printf("O maior valor é C: %f", valorC);
        }
    }

}
