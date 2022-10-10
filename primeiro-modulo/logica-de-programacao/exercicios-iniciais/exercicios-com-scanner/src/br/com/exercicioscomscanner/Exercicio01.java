package br.com.exercicioscomscanner;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe a base do retângulo: ");
        Scanner teclado = new Scanner(System.in);
        double base = teclado.nextDouble();

        System.out.println("Informe a altura do retângulo: ");
        double altura = teclado.nextDouble();

        double resultado = base * altura;

        System.out.println("A área do triângulo é: " + resultado);


    }

}

