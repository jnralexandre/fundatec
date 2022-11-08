package br.com.lista02estruturasdecontrole;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Agora, informe sua primeira nota: ");
        double primeiraNota = teclado.nextDouble();

        System.out.println("Agora, informe sua segunda nota: ");
        double segundaNota = teclado.nextDouble();

        System.out.println("Por fim, informe sua terceira nota: ");
        double terceiraNota = teclado.nextDouble();

        double mediaNotas = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (mediaNotas <= 5) {
            System.out.printf("Olá %s, sua situação é: reprovado.%n", nomeCliente);
        } else if (mediaNotas >= 5.1 && mediaNotas <= 6.9) {
            System.out.printf("Olá %s, sua situação é: recuperação.%n", nomeCliente);
        } else {
            System.out.printf("Olá %s, sua situação é: aprovado.%n", nomeCliente);
        }
    }

}
