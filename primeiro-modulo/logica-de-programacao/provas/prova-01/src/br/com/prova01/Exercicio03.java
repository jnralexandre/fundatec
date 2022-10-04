package br.com.prova01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Informe seu cargo: ");
        String cargoCliente = teclado.nextLine();

        System.out.println("Informe seu salário bruto: ");
        double salarioBrutoClinte = teclado.nextDouble();

        System.out.println("Informe o número de horas extras: ");
        double numeroHorasExtras = teclado.nextDouble();

        if (cargoCliente.equalsIgnoreCase("desenvolvedor")) {
            double valorPorHorasExtras = numeroHorasExtras * 11.00;
            double salarioBrutoMenosInss = salarioBrutoClinte * 0.11;
            double salarioBrutoMenosImpostoRenda = salarioBrutoClinte * 0.07;
            double salarioLiquidoCliente = (salarioBrutoClinte - (salarioBrutoMenosInss + salarioBrutoMenosImpostoRenda)) + valorPorHorasExtras;
            System.out.printf("Olá %s, seu salário líquido é: R$%.2f", nomeCliente, salarioLiquidoCliente);
        } else if (cargoCliente.equalsIgnoreCase("testador")) {
            double valorPorHorasExtras = numeroHorasExtras * 11.00;
            double salarioBrutoMenosInss = salarioBrutoClinte * 0.11;
            double salarioBrutoMenosImpostoRenda = salarioBrutoClinte * 0.07;
            double salarioLiquidoCliente = (salarioBrutoClinte - (salarioBrutoMenosInss + salarioBrutoMenosImpostoRenda)) + valorPorHorasExtras;
            System.out.printf("Olá %s, seu salário líquido é: R$%.2f", nomeCliente, salarioLiquidoCliente);
        } else if (cargoCliente.equalsIgnoreCase("suporte")) {
            double valorPorHorasExtras = numeroHorasExtras * 9.00;
            double salarioBrutoMenosInss = salarioBrutoClinte * 0.11;
            double salarioBrutoMenosImpostoRenda = salarioBrutoClinte * 0.07;
            double salarioLiquidoCliente = (salarioBrutoClinte - (salarioBrutoMenosInss + salarioBrutoMenosImpostoRenda)) + valorPorHorasExtras;
            System.out.printf("Olá %s, seu salário líquido é: R$%.2f", nomeCliente, salarioLiquidoCliente);
        } else if (cargoCliente.equalsIgnoreCase("atendimento")) {
            double valorPorHorasExtras = numeroHorasExtras * 8.00;
            double salarioBrutoMenosInss = salarioBrutoClinte * 0.11;
            double salarioBrutoMenosImpostoRenda = salarioBrutoClinte * 0.07;
            double salarioLiquidoCliente = (salarioBrutoClinte - (salarioBrutoMenosInss + salarioBrutoMenosImpostoRenda)) + valorPorHorasExtras;
            System.out.printf("Olá %s, seu salário líquido é: R$%.2f", nomeCliente, salarioLiquidoCliente);
        } else {
            double valorPorHorasExtras = numeroHorasExtras * 6.50;
            double salarioBrutoMenosInss = salarioBrutoClinte * 0.11;
            double salarioBrutoMenosImpostoRenda = salarioBrutoClinte * 0.07;
            double salarioLiquidoCliente = (salarioBrutoClinte - (salarioBrutoMenosInss + salarioBrutoMenosImpostoRenda)) + valorPorHorasExtras;
            System.out.printf("Olá %s, seu salário líquido é: R$%.2f", nomeCliente, salarioLiquidoCliente);
        }

    }

}
