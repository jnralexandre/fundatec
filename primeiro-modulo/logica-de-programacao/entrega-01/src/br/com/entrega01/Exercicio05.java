package br.com.entrega01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Informe um valor: ");
        Scanner teclado = new Scanner(System.in);
        double valorInformado = teclado.nextDouble();

        double dolar = 4.67;

        double valorConvertido = valorInformado / dolar;

        System.out.printf("Você tem %.2f Dólares", valorConvertido);
    }

}
