package br.com.entrega03;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número: ");
        Scanner teclado = new Scanner(System.in);
        double numeroInformado = teclado.nextDouble();

        if (numeroInformado <= 10) {
            System.out.println("F1");
        } else if (numeroInformado > 10 && numeroInformado <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }

}
