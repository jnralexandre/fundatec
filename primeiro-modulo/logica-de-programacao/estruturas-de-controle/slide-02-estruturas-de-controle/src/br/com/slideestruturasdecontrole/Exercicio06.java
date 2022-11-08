package br.com.slideestruturasdecontrole;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Informe seu cargo: ");
        Scanner teclado = new Scanner(System.in);
        String cargoCliente = teclado.nextLine();

        System.out.println("Agora informe seu salário: ");
        double salarioCliente = teclado.nextDouble();

        double percentualAumentoTesteOuSuporte = 0.08;
        double percentualAumentoDemaisCargos = 0.05;

        if (cargoCliente.equalsIgnoreCase("desenvolvedor")) {
            double percentualAumento = 0.09;
            double salarioClienteFinal = salarioCliente + (percentualAumento * salarioCliente);
            System.out.println("Seu aumento foi para: R$" + salarioClienteFinal);
        } else if (cargoCliente.equalsIgnoreCase("tester")) {
            double salarioClienteFinal = salarioCliente + (percentualAumentoTesteOuSuporte * salarioCliente);
            System.out.println("Seu aumento foi para: " + salarioClienteFinal);
        } else if (cargoCliente.equalsIgnoreCase("suporte")) {
            double salarioClienteFinal = salarioCliente + (percentualAumentoTesteOuSuporte * salarioCliente);
            System.out.println("Seu aumento foi para: " + salarioClienteFinal);
        } else {
            double salarioClienteFinal = salarioCliente + (percentualAumentoDemaisCargos * salarioCliente);
            System.out.println("Seu aumento foi para: " + salarioClienteFinal);
        }
    }

}
