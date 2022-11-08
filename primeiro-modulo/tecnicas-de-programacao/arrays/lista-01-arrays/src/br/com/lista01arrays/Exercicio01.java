package br.com.lista01arrays;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numerosInformados = new int[5];

        numerosInformados[0] = -1;
        numerosInformados[1] = 4;
        numerosInformados[2] = 10;
        numerosInformados[3] = -2;
        numerosInformados[4] = -17;

        int contador = 0;

        for (int i = 0; i < 5; i++) {
            if (numerosInformados[i] < 0) {
                contador++;
            }
        }

        System.out.printf("A quantidade de números negativos dentro do array são de: %d%n", contador);
    }

}
