package br.com.estruturasdecontrolelista02;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número para o início da comparação: ");
        Scanner teclado = new Scanner(System.in);
        int inicio = teclado.nextInt();

        System.out.println("Agora informe um número para o final da final da compararação: ");
        int fimComparacao = teclado.nextInt();

        System.out.println("Por favor, informe um valor para comparar: ");
        int valorComparar = teclado.nextInt();

        if (valorComparar >= inicio && valorComparar <= fimComparacao) {
            System.out.printf("O valor %d, está no intervalo entre inicio %d e fim %d", valorComparar, inicio, fimComparacao);
        } else {
            System.out.printf("o valor %d, não está no intervalo entre inicio %d e fim %d", valorComparar, inicio, fimComparacao);
        }
    }

}
