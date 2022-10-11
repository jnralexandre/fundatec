package br.com.estruturasdecontrolelista03;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe o ano atual: ");
        Scanner teclado = new Scanner(System.in);
        int anoAtual = teclado.nextInt();

        System.out.println("Agora informe o ano do seu nascimento: ");
        int anoNascimento = teclado.nextInt();

        int poderaOuNaoVotar = anoAtual - anoNascimento;

        if (poderaOuNaoVotar >= 16) {
            System.out.println("Você poderá votar este ano.");
        } else {
            System.out.println("Você não poderá votar este ano.");
        }
    }

}
