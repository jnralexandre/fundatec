package br.com.entrega01;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe uma palavra: ");
        Scanner teclado = new Scanner(System.in);
        String palavra = teclado.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        System.out.println(palavraInvertida);
    }

}
