package br.com.exercicios03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Informe o número de votos válidos: ");
        Scanner teclado = new Scanner(System.in);
        int quantidadeVotosValidos = teclado.nextInt();

        System.out.println("Agora informe o número de votos brancos: ");
        int quantidadeVotosBrancos = teclado.nextInt();

        System.out.println("Agora informe o número de votos nulos: ");
        int quantidadeVotosNulos = teclado.nextInt();

        int quantidadeTotalEleitores = quantidadeVotosValidos + quantidadeVotosBrancos + quantidadeVotosNulos;

        double percentualVotosValidos = quantidadeVotosValidos - (quantidadeVotosBrancos + quantidadeVotosNulos);

        //double percentualVotosBrancos =;

        System.out.printf("Número total de eleitores : %d; %nA porcentagem de votos válidos é: %.2f%s%nA porcentagem de votos brancos é: %.2f%s", quantidadeTotalEleitores, percentualVotosValidos, "%", percentualVotosBrancos, "%");
    }

}
