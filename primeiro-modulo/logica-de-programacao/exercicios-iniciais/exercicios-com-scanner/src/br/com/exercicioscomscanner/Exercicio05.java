package br.com.exercicioscomscanner;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Informe sua nota na primeira prova: ");
        Scanner teclado = new Scanner(System.in);
        double primeiraProva = teclado.nextDouble();

        System.out.println("Informe sua nota na segunda prova: ");
        double segundaProva = teclado.nextDouble();

        System.out.println("Informe sua nota na terceira prova: ");
        double terceiraProva = teclado.nextDouble();

        double calculaMedia = (primeiraProva + segundaProva + terceiraProva) / 3;

        System.out.println(calculaMedia);
    }

}
