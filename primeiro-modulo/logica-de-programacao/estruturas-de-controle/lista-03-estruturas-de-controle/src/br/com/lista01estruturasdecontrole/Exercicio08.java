package br.com.lista01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeCliente = teclado.nextLine();

        System.out.println("Agora informe sua nota em Portugues: ");
        double notaPortugues = teclado.nextDouble();

        System.out.println("Agora informe sua nota em Matemática: ");
        double notaMatematica = teclado.nextDouble();

        System.out.println("Agora informe sua nota em Conhecimentos Gerais: ");
        double notaConhecimentosGerais = teclado.nextDouble();

        double mediaProvas = (notaPortugues + notaMatematica + notaConhecimentosGerais) / 3;

        if (mediaProvas > 7 && notaPortugues >= 5 && notaMatematica >= 5 && notaConhecimentosGerais >= 5) {
            System.out.printf("Seu nome é: %s, e suas notas foram: %n%.2f em Português, %n%.2f em Matemática, %n%.2f em Conhecimentos Gerais.%nSua média foi de: %.2f.%nSituação: Aprovado!", nomeCliente, notaPortugues, notaMatematica, notaConhecimentosGerais, mediaProvas);
        } else {
            System.out.printf("Seu nome é: %s, e suas notas foram: %n%.2f em Português, %n%.2f em Matemática, %n%.2f em Conhecimentos Gerais.%nSua média foi de: %.2f.%nSituação: Reprovado!", nomeCliente, notaPortugues, notaMatematica, notaConhecimentosGerais, mediaProvas);
        }
    }

}
