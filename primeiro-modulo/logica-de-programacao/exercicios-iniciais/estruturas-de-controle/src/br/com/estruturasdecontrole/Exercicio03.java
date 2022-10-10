package br.com.estruturasdecontrole;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Informe um valor A: ");
        Scanner teclado = new Scanner(System.in);
        double valorA = teclado.nextDouble();

        System.out.println("Informe um valor B: ");
        double valorB = teclado.nextDouble();

        System.out.println("Informe um valor c: ");
        double valorC = teclado.nextDouble();

        if (valorA > valorB && valorA > valorC) {
            System.out.println("O maior valor é: " + valorA);
        } else if (valorB > valorA && valorB > valorC) {
            System.out.println("O maior valor é: " + valorB);
        } else {
            System.out.println("O maior valor é: " + valorC);
        }
    }

}
