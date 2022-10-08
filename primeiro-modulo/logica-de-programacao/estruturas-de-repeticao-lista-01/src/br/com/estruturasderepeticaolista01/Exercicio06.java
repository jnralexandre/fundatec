package br.com.estruturasderepeticaolista01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe um número: ");
        long numero = teclado.nextLong();
        long fatorial = 1;

        for (long i = numero; i > 0; i--) {
            fatorial = fatorial * i;

            if (i == numero) {
                System.out.print(numero + "! = " + numero + "x");
            } else if (i == 1) {
                System.out.print("1 = " + fatorial);
            } else {
                System.out.print(i + "x");
            }
        }
    }

}
