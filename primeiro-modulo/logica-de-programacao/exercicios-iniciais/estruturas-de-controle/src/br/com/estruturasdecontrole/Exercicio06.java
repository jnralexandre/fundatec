package br.com.estruturasdecontrole;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Digite uma letra: ");
        Scanner teclado = new Scanner(System.in);
        char letraDigitada = teclado.next().charAt(0);

        if (letraDigitada == 'a' || letraDigitada == 'e' || letraDigitada == 'i' || letraDigitada == 'o' || letraDigitada == 'u') {
            System.out.println("A letra digitada é uma vogal.");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }
    }

}
