package br.com.estruturasderepeticao03;

import java.util.Scanner;

public class Exercicio05 {

//    5. Desenvolva um programa que receba o raio de um círculo enquanto o usuário não informar um valor negativo.
//    Para cada valor lido o sistema deve efetuar o cálculo de sua área.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int raio = 0;
        double pi = 3.14;
        double circulo = 0;

        while (raio >= 0) {
            System.out.println("Informe um valor para o raio: ");
            raio = teclado.nextInt();
            circulo = pi * (raio * raio);

            if (raio > 0) {
                System.out.printf("O cálculo da área é: %f%n", circulo);
            }
        }
    }

}
