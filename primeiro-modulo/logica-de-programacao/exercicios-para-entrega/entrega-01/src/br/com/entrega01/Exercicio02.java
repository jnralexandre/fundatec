package br.com.entrega01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Informe a sua idade: ");
        int idadeCliente = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Agora informe a cidade em que você mora: ");
        String cidadeCliente = teclado.nextLine();

        System.out.printf("Olá, meu nome é %s, tenho %d anos e moro em %s.", nomeCliente, idadeCliente, cidadeCliente);
    }

}
