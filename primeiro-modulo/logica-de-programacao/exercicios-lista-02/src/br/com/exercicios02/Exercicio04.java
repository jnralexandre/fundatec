package br.com.exercicios02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("informe o nome do seu pai: ");
        Scanner teclado = new Scanner(System.in);
        String nomePai = teclado.nextLine();

        System.out.println("Agora informe a idade do seu pai: ");
        int idadePai = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Agora informe o nome da sua mãe: ");
        String nomeMae = teclado.nextLine();

        System.out.println("Agora informe a idade da sua mãe: ");
        int idadeMae = teclado.nextInt();

        System.out.printf("Olá, o nome do seu pai é: %s" +
                "\nO seu pai tem: %d anos" +
                "\nO nome da sua mãe é: %s" +
                "\nA sua mãe tem: %d anos", nomePai, idadePai, nomeMae, idadeMae);
    }

}
