package br.com.prova02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean continua = true;
        String jogador1 = "";
        int opcaoJogador1 = 0;
        String jogador2 = "";
        int opcaoJogador2 = 0;
        String opcao = "S";
        int opcaoTesoura = 1;
        int opcaoPapel = 2;
        int opcapPedra = 3;

        while (continua) {
            System.out.println("Por favor, informe o nome do jogador 1: ");
            jogador1 = teclado.nextLine();

            System.out.println("Agora informe qual será a sua jogada: (opções: tesoura = 1, papel = 2, pedra = 3: ");
            opcaoJogador1 = teclado.nextInt();

            teclado.nextLine();

            System.out.println("Por favor, informe o nome do jogador 2: ");
            jogador2 = teclado.nextLine();

            System.out.println("Agora informe qual será a sua jogada: (opções: tesoura = 1, papel = 2, pedra = 3: ");
            opcaoJogador2 = teclado.nextInt();

            if (opcaoJogador1 == 1 && opcaoJogador2 == 2) {
                System.out.printf("O jogador %s ganhou!%n", jogador1);
            } else if (opcaoJogador1 == 2 && opcaoJogador2 == 3) {
                System.out.printf("O jogador %s ganhou!%n", jogador1);
            } else if (opcaoJogador1 == 3 && opcaoJogador2 == 1) {
                System.out.printf("O jogador %s ganhou!%n", jogador1);
            } else if (opcaoJogador1 == 1 && opcaoJogador2 == 1) {
                System.out.printf("Os jogadores empataram!%n");
            } else if (opcaoJogador1 == 2 && opcaoJogador2 == 2) {
                System.out.printf("Os jogadores empataram!%n");
            } else if (opcaoJogador1 == 3 && opcaoJogador2 == 3) {
                System.out.printf("Os jogadores empataram!%n");
            } else if (opcaoJogador2 == 1 && opcaoJogador1 == 2) {
                System.out.printf("O jogador %s ganhou!%n", jogador2);
            } else if (opcaoJogador2 == 2 && opcaoJogador1 == 3) {
                System.out.printf("O jogador %s ganhou!%n", jogador2);
            } else if (opcaoJogador2 == 3 && opcaoJogador1 == 1) {
                System.out.printf("O jogador %s ganhou!%n", jogador2);
            } else if (opcaoJogador2 == 1 && opcaoJogador1 == 1) {
                System.out.printf("Os jogadores empataram!%n");
            } else if (opcaoJogador2 == 2 && opcaoJogador1 == 2) {
                System.out.printf("Os jogadores empataram!%n");
            } else if (opcaoJogador2 == 3 && opcaoJogador1 == 3) {
                System.out.printf("Os jogadores empataram!%n");
            }

            teclado.nextLine();

            System.out.println("Vocês desejam continuar jogando?: (S para Sim e N para não");
            opcao = teclado.nextLine();

            if (!opcao.equalsIgnoreCase("S")) {
                continua = true;
                break;
            }
        }
    }
}
