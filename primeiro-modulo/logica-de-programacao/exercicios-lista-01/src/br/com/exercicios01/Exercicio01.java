package br.com.exercicios01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe um valor: ");
        Scanner teclado = new Scanner(System.in);
        double primeiroValor = teclado.nextDouble();

        System.out.println("Informe um valor: ");
        double segundoValor = teclado.nextDouble();

        double resultado = primeiroValor + segundoValor;

        System.out.println("O resultado da soma é: " + resultado);
    }

}
