package br.com.exercicios02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();

        System.out.println("Agora informe sua idade: ");
        int idade = teclado.nextInt();

        System.out.printf("Olá, seu nome é: %s; " +
                "\nE a sua idade é: %d", nome, idade);
    }

}
