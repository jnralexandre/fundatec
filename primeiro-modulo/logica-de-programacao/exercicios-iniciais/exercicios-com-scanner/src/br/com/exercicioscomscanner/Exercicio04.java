package br.com.exercicioscomscanner;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Informe sua idade em anos: ");
        Scanner teclado = new Scanner(System.in);
        int anos = teclado.nextInt();

        System.out.println("Informe sua idade em meses: ");
        int meses = teclado.nextInt();

        System.out.println("Informe sua idade em dias: ");
        int dias = teclado.nextInt();

        int anosEmDias = anos * 365;
        int mesesEmDias = meses * 30;

        int idadeEmDias = anosEmDias + mesesEmDias + dias;

        System.out.println("Sua idade expressa em dias é: " + idadeEmDias);
    }

}
