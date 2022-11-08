package br.com.lista01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu salário: ");
        Scanner teclado = new Scanner(System.in);
        double salarioCliente = teclado.nextDouble();

        System.out.println("Por fim, informe o valor total das suas vendas este mês: ");
        double valorTotalVendas = teclado.nextDouble();

        double salarioTotal = 0;

        if (valorTotalVendas > 1000 && valorTotalVendas < 5000) {
            double bonificacao = 200;
            salarioTotal = salarioCliente + bonificacao;
            System.out.printf("Seu salário total é: %.2f", salarioTotal);
        } else if (valorTotalVendas > 5000 && valorTotalVendas < 10000) {
            double bonificacao = 700;
            salarioTotal = salarioCliente + bonificacao;
            System.out.printf("Seu salário total é: %.2f", salarioTotal);
        } else if (valorTotalVendas > 10000) {
            double bonificacao = 1200;
            salarioTotal = salarioCliente + bonificacao;
            System.out.printf("Seu salário total é: %.2f", salarioTotal);
        }
    }

}