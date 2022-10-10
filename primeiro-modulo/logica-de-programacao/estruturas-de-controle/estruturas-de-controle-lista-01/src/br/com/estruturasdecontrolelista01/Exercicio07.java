package br.com.estruturasdecontrolelista01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe o nome do time A: ");
        Scanner teclado = new Scanner(System.in);
        String nomeTimeA = teclado.nextLine();

        System.out.println("Agora, informe o número de gols: ");
        int golsTimeA = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Por favor, informe o nome do time B: ");
        String nomeTimeB = teclado.nextLine();

        System.out.println("Agora, informe o número de gols: ");
        int golsTimeB = teclado.nextInt();

        if (golsTimeA > golsTimeB) {
            System.out.printf("O vencedor foi: %s", nomeTimeA);
        } else if (golsTimeB > golsTimeA) {
            System.out.printf("O vencedor foi: %s", nomeTimeB);
        } else if (golsTimeA == 0 && golsTimeB == 0) {
            System.out.printf("Empate.");
        }
    }

}
