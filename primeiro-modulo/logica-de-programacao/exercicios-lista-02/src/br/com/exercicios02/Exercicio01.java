package br.com.exercicios02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe o nome do estado em que você mora: ");
        Scanner teclado = new Scanner(System.in);
        String nomeEstado = teclado.nextLine();

        System.out.println("Informe o nome da cidade em que você mora: ");
        String nomeCidade = teclado.nextLine();

        System.out.println("Agora informe o seu nome: ");
        String nomeCliente = teclado.nextLine();

        System.out.printf("Olá, você mora no estado: %s, sua cidade é: %s, e seu nome é: %s", nomeEstado, nomeCidade, nomeCliente);
    }

}
