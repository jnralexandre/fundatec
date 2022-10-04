package br.com.prova01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um valor para A: ");
        Scanner teclado = new Scanner(System.in);
        double valorA = teclado.nextDouble();

        System.out.println("Agora, informe um valor para B: ");
        double valorB = teclado.nextDouble();

        System.out.println("Por fim, informe um valor para C: ");
        double valorC = teclado.nextDouble();

        double somaBC = valorB + valorC;

        if (valorA < somaBC) {
            System.out.printf("a)%nO valor de A é menor do que a soma dos valores B + C.");
        } else {
            System.out.printf("a)%nO valor de A é maior do que a soma dos valores B + C.");
        }

        double sucessorA = valorA + 1;

        if (valorB > sucessorA) {
            System.out.printf("%nb)%nO valor B é maior que o sucessor de valor A.");
        } else {
            System.out.printf("%nb)%nO valor B é menor que o sucessor de valor A.");
        }

        double valorBAoQuadrado = Math.pow(valorB, 2);

        if (valorC == valorBAoQuadrado) {
            System.out.printf("%nc)%nO valor de C é igual ao quadrado de B.");
        } else {
            System.out.printf("%nc)%nO valor de C é diferente ao quadrado de B.");
        }

        double somaAB = valorA + valorB;

        if (somaAB > somaBC) {
            System.out.printf("%nd)%nA soma dos valores A + B é maior do que a soma dos valores B + C.");
        } else if (somaAB < somaBC) {
            System.out.printf("%nd)%nA soma dos valores A + B é menor do que a soma dos valores B + C.");
        } else {
            System.out.printf("%nd)%nA soma dos valores A + B é igual do que a soma dos valores B + C.");
        }

        double antecessorA = valorA - 1;
        double sucessorB = valorB - 1;
        double cuboC = Math.pow(valorC, 3);

        System.out.printf("%ne)%nO antecessor de valor A é: %f,%nO sucessor de valor B é: %f,%nO cubo de valor C é: %f", antecessorA, sucessorB, cuboC);
    }

}
