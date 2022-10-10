package br.com.estruturasdecontrolelista01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe sua idade: ");
        int idadeCliente = teclado.nextInt();

        if (idadeCliente >= 18) {
            System.out.println("Você está apto a tirar a carteira de motorista.");
        } else {
            System.out.println("Você ainda não tem a idade mínima para tirar a carteira de motorista.");
        }
    }

}
