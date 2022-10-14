package br.com.entrega05;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
//        2. Faça um programa que leia as médias finais de vários alunos de uma turma e mostre a maior média, a menor média e a média aritmética da turma.
//        O programa para quando o usuário digitar uma média negativa.

        double mediaAlunos = 0;
        boolean continua = true;
        double maiorMedia = 0;
        double menorMedia = 0;
        double somaMediaAlunos = 0;
        int quantidadeMedias = 0;
        double mediaAritmetica = 0;

        Scanner teclado = new Scanner(System.in);

        while (continua) {
            System.out.println("Por favor, informe sua média: ");
            mediaAlunos = teclado.nextDouble();

            if (mediaAlunos < 0) {
                continua = false;
                break;
            }

            if (mediaAlunos == 0) {
                maiorMedia = mediaAlunos;
                menorMedia = mediaAlunos;

            }

            if (mediaAlunos > maiorMedia) {
                maiorMedia = mediaAlunos;
            } else if (mediaAlunos < menorMedia) {
                menorMedia = mediaAlunos;
            }

            quantidadeMedias++;

            somaMediaAlunos += mediaAlunos;
        }

        mediaAritmetica = somaMediaAlunos / quantidadeMedias;

        System.out.printf("A maior média foi: %f%nA menor média foi: %f%nE a média aritmética é: %f%n", maiorMedia, menorMedia, mediaAritmetica);
    }

}
