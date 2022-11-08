package br.com.lista01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Agora informe quantos dias pretende ficar hospedado: ");
        int diasHospedado = teclado.nextInt();

        if (diasHospedado > 15) {
            double taxaServico = 5.50 * diasHospedado;
            double valorDiaria = 60;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá %s, o valor total a pagar é: R$%.2f", nomeCliente, valorTotal);
        } else if (diasHospedado == 15) {
            double taxaServico = 6.00 * diasHospedado;
            double valorDiaria = 60;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá %s, o valor total a pagar é: R$%.2f", nomeCliente, valorTotal);
        } else if (diasHospedado < 15) {
            double taxaServico = 8.00 * diasHospedado;
            double valorDiaria = 60;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá %s, o valor total a pagar é: R$%.2f", nomeCliente, valorTotal);
        }
    }

}
