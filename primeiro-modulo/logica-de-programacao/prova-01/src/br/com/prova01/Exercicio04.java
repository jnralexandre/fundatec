package br.com.prova01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe quantos dias pretende ficar hospedado: ");
        int diasHospedado = teclado.nextInt();

        if (diasHospedado < 3) {
            double taxaServico = 15 * diasHospedado;
            double valorDiaria = 120;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá o valor total a pagar é: R$%.2f", valorTotal);
        } else if (diasHospedado >= 3 && diasHospedado <= 7) {
            double taxaServico = 12 * diasHospedado;
            double valorDiaria = 120;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá o valor total a pagar é: R$%.2f", valorTotal);
        } else if (diasHospedado >= 8 && diasHospedado <= 12) {
            double taxaServico = 10 * diasHospedado;
            double valorDiaria = 120;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá o valor total a pagar é: R$%.2f", valorTotal);
        } else if (diasHospedado == 13) {
            double taxaServico = 8.50 * diasHospedado;
            double valorDiaria = 120;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá o valor total a pagar é: R$%.2f", valorTotal);
        } else if (diasHospedado > 13) {
            double taxaServico = 6.50 * diasHospedado;
            double valorDiaria = 120;
            double valorTotal = (valorDiaria * diasHospedado) + taxaServico;
            System.out.printf("Olá o valor total a pagar é: R$%.2f", valorTotal);
        }
    }

}
