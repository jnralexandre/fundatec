package br.com.entrega01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe um valor: ");
        Scanner teclado = new Scanner(System.in);
        double primeiroValor = teclado.nextDouble();

        System.out.println("Informe mais um valor: ");
        double segundoValor = teclado.nextDouble();

        double soma = primeiroValor + segundoValor;
        double subtracao = primeiroValor - segundoValor;
        double multiplicacao = primeiroValor * segundoValor;
        double divisao = primeiroValor / segundoValor;
        double resto = primeiroValor % segundoValor;

        System.out.printf("O resultado da soma dos valores informados é: %.2f;" +
                "%nO resultado da subtração dos valores informados é: %.2f; " +
                "%nO resultado da multiplicação dos valores informados é: %.2f" +
                "%nO resultado da divisão dos valores informados é: %.2f;" +
                "%nO resultado do resto da divisão dos valores informados é: %.2f", soma, subtracao, multiplicacao, divisao, resto);
    }

}
