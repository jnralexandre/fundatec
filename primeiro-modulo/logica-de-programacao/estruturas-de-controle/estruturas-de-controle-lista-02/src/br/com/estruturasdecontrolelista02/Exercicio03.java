package br.com.estruturasdecontrolelista02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe sua idade: ");
        Scanner teclado = new Scanner(System.in);
        int idadeCliente = teclado.nextInt();

        if (idadeCliente >= 10 && idadeCliente <= 14) {
            System.out.println("Infatil.");
        } else if (idadeCliente >= 15 && idadeCliente <= 17) {
            System.out.println("Juvenil.");
        } else if (idadeCliente >= 18 && idadeCliente <= 59) {
            System.out.println("Adulto.");
        } else if (idadeCliente >= 60) {
            System.out.println("Terceira idade.");
        }
    }

}
