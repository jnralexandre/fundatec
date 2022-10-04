package br.com.entrega01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Informe a nota da sua primeira prova: ");
        Scanner teclado = new Scanner(System.in);
        double primeiraProva = teclado.nextDouble();

        System.out.println("Informe a nota da sua segunda prova: ");
        double segundaProva = teclado.nextDouble();

        System.out.println("Informe a nota da sua terceira prova: ");
        double terceiraProva = teclado.nextDouble();

        System.out.println("Informe a nota da sua quarta prova: ");
        double quartaProva = teclado.nextDouble();

        double mediaProvas = (primeiraProva + segundaProva + terceiraProva + quartaProva) / 4;

        System.out.printf("A sua média nas provas é: %.2f", mediaProvas);
    }

}
