package br.com.estruturasdecontrolelista02;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String primeiroCliente = teclado.nextLine();

        System.out.println("Agora informe sua idade: ");
        int idadePrimeiroCliente = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Agora informe um segundo nome: ");
        String segundoCliente = teclado.nextLine();

        System.out.println("Por fim, informe sua idade: ");
        int idadeSegundoCliente = teclado.nextInt();

        if (idadePrimeiroCliente > idadeSegundoCliente) {
            int diferencaIdades = idadePrimeiroCliente - idadeSegundoCliente;
            System.out.printf("A pessoa mais velha é %s%nA diferença de idade é de: %d", primeiroCliente, diferencaIdades);
        } else {
            int diferencaIdades = idadeSegundoCliente - idadePrimeiroCliente;
            System.out.printf("A pessoa mais velha é %s%nA diferença de idade é de: %d", segundoCliente, diferencaIdades);
        }
    }

}
