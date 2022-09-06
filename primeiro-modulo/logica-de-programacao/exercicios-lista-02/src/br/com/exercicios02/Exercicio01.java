package br.com.exercicios02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe o nome do seu estado: ");
        Scanner teclado = new Scanner(System.in);
        String estado = teclado.nextLine();

        System.out.println("Informe o nome da sua cidade: ");
        String cidade = teclado.nextLine();

        System.out.println("Informe o seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("Olá, você mora no estado: %s, na cidade: %s, e seu nome é: %s", estado, cidade, nome);
    }

}
