package br.com.exercicioscomscanner;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        int antecessor = valor - 1;

        System.out.println(antecessor);
    }

}
