package br.com.estruturasdecontrolelista02;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int numeroInformado = teclado.nextInt();

        if (numeroInformado > 10) {
            System.out.println("O número informado é maior que 10.");
        }
    }

}
