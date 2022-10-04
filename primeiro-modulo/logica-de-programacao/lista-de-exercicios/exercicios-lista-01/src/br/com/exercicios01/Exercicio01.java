package br.com.exercicios01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe um número: ");
        Scanner teclado = new Scanner(System.in);
        double primeiroValor = teclado.nextDouble();

        System.out.println("Agora informe um segundo número: ");
        double segundoValor = teclado.nextDouble();

        double resultado = primeiroValor + segundoValor;

        System.out.println("O resultado da soma dos dois números informados é: " + resultado);
    }

}
