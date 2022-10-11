package br.com.estruturasdecontrolelista03;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Agora, informe seu salário: ");
        double salarioCliente = teclado.nextDouble();

        System.out.println("Por fim, informe sua categoria: ");
        char categoriaCliente = teclado.next().charAt(0);

        if (categoriaCliente == 'A' || categoriaCliente == 'C' || categoriaCliente == 'F' || categoriaCliente == 'H') {
            double percentualAumento = 0.10;
            salarioCliente = salarioCliente + (salarioCliente * percentualAumento);
            System.out.printf("Olá %s, sua categoria é: %c. Seu salário foi reajustado para: %.2f", nomeCliente, categoriaCliente, salarioCliente);
        } else if (categoriaCliente == 'B' || categoriaCliente == 'D' || categoriaCliente == 'E' || categoriaCliente == 'I' || categoriaCliente == 'J' || categoriaCliente == 'T') {
            double percentualAumento = 0.15;
            salarioCliente = salarioCliente + (salarioCliente * percentualAumento);
            System.out.printf("Olá %s, sua categoria é: %c. Seu salário foi reajustado para: %.2f", nomeCliente, categoriaCliente, salarioCliente);
        } else if (categoriaCliente == 'K' || categoriaCliente == 'R') {
            double percentualAumento = 0.25;
            salarioCliente = salarioCliente + (salarioCliente * percentualAumento);
            System.out.printf("Olá %s, sua categoria é: %c. Seu salário foi reajustado para: %.2f", nomeCliente, categoriaCliente, salarioCliente);
        } else if (categoriaCliente == 'L' || categoriaCliente == 'M' || categoriaCliente == 'N' || categoriaCliente == 'O' || categoriaCliente == 'P' || categoriaCliente == 'Q' || categoriaCliente == 'S') {
            double percentualAumento = 0.35;
            salarioCliente = salarioCliente + (salarioCliente * percentualAumento);
            System.out.printf("Olá %s, sua categoria é: %c. Seu salário foi reajustado para: %.2f", nomeCliente, categoriaCliente, salarioCliente);
        } else if (categoriaCliente == 'U' || categoriaCliente == 'V' || categoriaCliente == 'X' || categoriaCliente == 'Y' || categoriaCliente == 'W' || categoriaCliente == 'Z') {
            double percentualAumento = 0.50;
            salarioCliente = salarioCliente + (salarioCliente * percentualAumento);
            System.out.printf("Olá %s, sua categoria é: %c. Seu salário foi reajustado para: %.2f", nomeCliente, categoriaCliente, salarioCliente);
        }
    }

}
