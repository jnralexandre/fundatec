package br.com.entrega03;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Informe o valor das porcas: ");
        double valorPorcas = teclado.nextDouble();

        System.out.println("Informe o valor dos parafusos: ");
        double valorParafusos = teclado.nextDouble();

        System.out.println("Informe o valor das arrulas: ");
        double valorArruelas = teclado.nextDouble();

        System.out.println("Informe a quantidade de porcas que deseja comprar: ");
        int quantidadePorcas = teclado.nextInt();

        System.out.println("Informe a quantidade de parafusos que deseja comprar: ");
        int quantidadeParafusos = teclado.nextInt();

        System.out.println("Informe a quantidade de arruelas que deseja comprar: ");
        int quantidadeArruelas = teclado.nextInt();

        double percentualDescontoPorcas = 0.1;
        double percentualDescontoParafusos = 0.2;
        double percentualDescontoArruelas = 0.3;

        double valorPorcasDesconto = valorPorcas - (percentualDescontoPorcas * valorPorcas);
        double valorParafusosDesconto = valorParafusos - (percentualDescontoPorcas * valorParafusos);
        double valorArruelasDesconto = valorArruelas - (percentualDescontoPorcas * valorArruelas);

        double valorFinalPorcas = valorPorcasDesconto * quantidadePorcas;
        double valorFinalParafusos = valorParafusosDesconto * quantidadeParafusos;
        double valorFinalArruelas = valorArruelasDesconto * quantidadeArruelas;

        double quantidadeDescontoPorcas = (percentualDescontoArruelas * valorPorcas) * quantidadePorcas;
        double quantidadeDescontoParafusos = (percentualDescontoParafusos * valorParafusos) * quantidadeParafusos;
        double quantidadeDescontoArruelas = (percentualDescontoArruelas * valorArruelas) * quantidadeArruelas;

        double totalDescontos = quantidadeDescontoPorcas + quantidadeDescontoParafusos + quantidadeDescontoArruelas;
        double valorTotalCompra = valorFinalPorcas + valorFinalParafusos + valorFinalArruelas;

        System.out.printf("%s, você comprou %d de porcas, %d de parafusos e %d arruelas.%nVocê economizou R$%.2f nesta compra.%nValor total a pagar pela compra: R$%.2f", nomeCliente, quantidadePorcas, quantidadeParafusos, quantidadeArruelas, totalDescontos, valorTotalCompra);
    }

}