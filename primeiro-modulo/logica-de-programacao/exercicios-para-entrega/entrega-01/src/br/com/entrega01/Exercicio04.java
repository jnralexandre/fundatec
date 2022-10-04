package br.com.entrega01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Informe a sua altura: ");
        Scanner teclado = new Scanner(System.in);
        double alturaCliente = teclado.nextDouble();

        double metrosParaCentimetros = alturaCliente * 100;

        System.out.printf("Sua altura em centímetros é: %.0f", metrosParaCentimetros);
    }

}
