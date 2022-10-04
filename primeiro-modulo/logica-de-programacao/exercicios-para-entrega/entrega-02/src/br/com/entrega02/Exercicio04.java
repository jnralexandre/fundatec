package br.com.entrega02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int numeroCliente = teclado.nextInt();

        int tabuada1 = numeroCliente * 1;
        int tabuada2 = numeroCliente * 2;
        int tabuada3 = numeroCliente * 3;
        int tabuada4 = numeroCliente * 4;
        int tabuada5 = numeroCliente * 5;
        int tabuada6 = numeroCliente * 6;
        int tabuada7 = numeroCliente * 7;
        int tabuada8 = numeroCliente * 8;
        int tabuada9 = numeroCliente * 9;
        int tabuada10 = numeroCliente * 10;

        System.out.printf("A tabuada de %d é: %n%d;%n%d;%n%d;%n%d;%n%d;%n%d;%n%d;%n%d;%n%d;%n%d;", numeroCliente, tabuada1, tabuada2, tabuada3, tabuada4, tabuada5, tabuada6, tabuada7, tabuada8, tabuada9, tabuada10);
    }

}
