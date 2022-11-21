package br.com.entrega01;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe uma palavra: ");
        Scanner teclado = new Scanner(System.in);
        String palavra = teclado.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavraInvertida.equalsIgnoreCase(palavra)) {
            System.out.println("A palavra informada é um palíndromo.");
        } else {
            System.out.println("A palavra informada não é um palíndromo.");
        }
    }

}
