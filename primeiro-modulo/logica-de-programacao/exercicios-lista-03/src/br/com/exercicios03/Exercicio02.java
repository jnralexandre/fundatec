package br.com.exercicios03;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe quantos quilômetros você deseja percorrer: ");
        Scanner teclado = new Scanner(System.in);
        double quantidadeKmInformados = teclado.nextDouble();

        double kmPorlitro = 12;

        double resultado = quantidadeKmInformados / kmPorlitro;

        System.out.printf("A quantidade de gasolina necessária para percorrer essa distância é de: %.2f litros", resultado);
    }

}
