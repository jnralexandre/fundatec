package br.com.entrega02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe os valores dos catetos A, B:");
        System.out.println("Informe o valor de A: ");
        Scanner teclado = new Scanner(System.in);
        double catetoA = teclado.nextDouble();

        System.out.println("Informe o valor de B: ");
        double catetoB = teclado.nextDouble();

        double catetoAQuadrado = Math.pow(catetoA, 2);
        double catetoBQuadrado = Math.pow(catetoB, 2);
        double hipotenusa = catetoAQuadrado + catetoBQuadrado;

        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }

}
