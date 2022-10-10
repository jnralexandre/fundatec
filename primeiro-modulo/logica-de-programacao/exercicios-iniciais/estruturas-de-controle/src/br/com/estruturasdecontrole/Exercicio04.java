package br.com.estruturasdecontrole;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Informe um ano com 4 digitos: ");
        Scanner teclado = new Scanner(System.in);
        int anoDigitado = teclado.nextInt();

        if ((anoDigitado % 4 == 0 && anoDigitado % 100 != 0) || anoDigitado % 400 == 0) {
            System.out.printf("O ano %d é bissexto: ", anoDigitado);
        } else {
            System.out.printf("O ano %d não é bissexto", anoDigitado);
        }
    }

}
