package br.com.lista01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu salário: ");
        Scanner teclado = new Scanner(System.in);
        double salario = teclado.nextDouble();

        System.out.println("Por fim, informe o valor total das suas vendas: ");
        double valorVendas = teclado.nextDouble();

        if (valorVendas <= 1500) {
            double percentual = 0.03;
            double salarioTotal = salario + (percentual * valorVendas);
            System.out.printf("O salário total é: R$%.2f", salarioTotal);
        } else {
            double percentual = 0.05;
            double salarioTotal = salario + (percentual * valorVendas);
            System.out.printf("O salário total é: R$%.2f", salarioTotal);
        }
    }

}
