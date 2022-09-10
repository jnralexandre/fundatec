package br.com.exercicios03;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe a sua carga horária: ");
        Scanner teclado = new Scanner(System.in);
        double cargaHoraria = teclado.nextDouble();

        int producaoDePaes = 25;

        double resultado = cargaHoraria * producaoDePaes;

        System.out.println("A quantidade de pães produzidos foi de: " + resultado);
    }

}
