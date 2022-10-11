package br.com.estruturasderepeticao03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int raio = 0;
        double pi = 3.14;
        double circulo = 0;

        while (raio >= 0) {
            System.out.println("Informe um valor para o raio: ");
            Scanner teclado = new Scanner(System.in);
            raio = teclado.nextInt();
            circulo = pi * (raio * raio);

            if (raio > 0) {
                System.out.printf("O cálculo da área é: %f%n", circulo);
            }
        }
    }

}
