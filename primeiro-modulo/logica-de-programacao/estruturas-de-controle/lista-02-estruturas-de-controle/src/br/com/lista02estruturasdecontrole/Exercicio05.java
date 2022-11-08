package br.com.lista02estruturasdecontrole;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número: ");
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero = teclado.nextInt();

        System.out.println("Agora, informe um segundo número: ");
        int segundoNumero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Escolha uma opcção (A, B ou C): ");
        String opcao = teclado.nextLine();

        String sinalPorcentagem = "%";

        switch (opcao.toUpperCase()) {
            case "A":
                int opcaoA = primeiroNumero + (segundoNumero * 2);
                System.out.printf("a) O primeiro número mais o dobro do segundo número é: %d", opcaoA);
                break;
            case "B":
                double opcaoB = primeiroNumero * 0.25;
                System.out.printf("b) 25%s do primeiro valor informado é: %f", sinalPorcentagem, opcaoB);
                break;
            case "C":
                double opcaoC = segundoNumero + (segundoNumero * 0.20);
                System.out.printf("O segundo número aumentado em 20%s é: %f", sinalPorcentagem, opcaoC);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

}
