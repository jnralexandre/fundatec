package br.com.prova02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continua = true;
        String aluno = "";
        String alunoMaiorNota = "";
        String alunoMenorNota = "";
        double primeiraNota = 0;
        double segundaNota = 0;
        double terceiraNota = 0;
        double somaNotaAluno = 0;
        int contadorAlunos = 0;
        double mediaAluno = 0;
        double maiorMedia = 0;
        double menorMedia = 0;
        double somaTotalNotas = 0;
        double mediaAritmeticaTurma = 0;
        double mediaTotal = 0;
        String opcao = "S";

        while (continua) {
            System.out.println("Por favor, informe seu nome: ");
            aluno = teclado.nextLine();

            System.out.println("Agora informe sua primeira nota: ");
            primeiraNota = teclado.nextDouble();

            System.out.println("Agora informe sua segunda nota: ");
            segundaNota = teclado.nextDouble();

            System.out.println("Agora informe sua terceira nota: ");
            terceiraNota = teclado.nextDouble();

            somaNotaAluno += (primeiraNota + segundaNota + terceiraNota);
            mediaAluno += somaNotaAluno / 3;

            System.out.printf("%s, sua média é: %f%n", aluno, mediaAluno);

            teclado.nextLine();

            if (contadorAlunos == 0) {
                maiorMedia = 0;
                menorMedia = 0;
            }

            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
            } else if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
            }

            System.out.println("Você deseja continuar dando informações?: (S para Sim e N para não");
            opcao = teclado.nextLine();

            if (!opcao.equalsIgnoreCase("S")) {
                continua = true;
                break;
            }

            contadorAlunos++;

            System.out.printf("a) A maior média é: %f%nb) A menor média é: %f%nc) A média Aritmética da turma é: %f%n", maiorMedia, menorMedia, mediaAritmeticaTurma);
        }

        somaTotalNotas += mediaAluno;

        mediaAritmeticaTurma += somaTotalNotas / contadorAlunos;
    }

}