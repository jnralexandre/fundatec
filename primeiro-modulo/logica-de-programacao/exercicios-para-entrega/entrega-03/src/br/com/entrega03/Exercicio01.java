package br.com.entrega03;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe o número de maçãs que você deseja comprar: ");
        Scanner teclado = new Scanner(System.in);
        int numeroMacas = teclado.nextInt();

        if (numeroMacas < 12 && numeroMacas > 0) {
            double precoMacas = 1.30;
            double valorTotal = numeroMacas * precoMacas;
            System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
        } else {
            double precoMacas = 1.00;
            double valorTotal = numeroMacas * precoMacas;
            System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
        }
    }

}
