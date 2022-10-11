package br.com.exercicios02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Agora informe sua profissão: ");
        String profissaoCliente = teclado.nextLine();

        System.out.println("Por último informe seu salário: ");
        double salarioCliente = teclado.nextDouble();

        System.out.printf("Olá, seu nome é: %s; " +
                "\nSua profissão é: %s; \n" +
                "E o seu salário é de: RS " +
                "%.2f ", nomeCliente, profissaoCliente, salarioCliente);
    }

}
