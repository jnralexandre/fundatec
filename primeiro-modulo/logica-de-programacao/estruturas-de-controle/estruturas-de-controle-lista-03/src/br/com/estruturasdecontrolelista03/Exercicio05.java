package br.com.estruturasdecontrolelista03;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe o número da sua conta: ");
        Scanner teclado = new Scanner(System.in);
        String numeroConta = teclado.nextLine();

        System.out.println("Agora, informe seu saldo: ");
        double saldo = teclado.nextDouble();

        System.out.println("Agora, informe o débito: ");
        double debito = teclado.nextDouble();

        System.out.println("Agora, informe o crédito: ");
        double credito = teclado.nextDouble();

        double saldoAtual = saldo - (debito + credito);

        if (saldoAtual > 0) {
            System.out.printf("Saldo positivo: R$%.2f", saldoAtual);
        } else {
            System.out.printf("Saldo negativo: R$%.2f", saldoAtual);
        }
    }

}
