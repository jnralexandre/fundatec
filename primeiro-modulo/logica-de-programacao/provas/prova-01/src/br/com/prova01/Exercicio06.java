package br.com.prova01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um numéro para A: ");
        Scanner teclado = new Scanner(System.in);
        double numeroA = teclado.nextDouble();

        System.out.println("Agora, informe um número para B: ");
        double numeroB = teclado.nextDouble();

        System.out.println("Por fim, informe um número para C: ");
        double numeroC = teclado.nextDouble();

        if (numeroA > numeroB && numeroA > numeroC) {
            System.out.printf("%na)%nO maior número é A.");
        } else if (numeroB > numeroA && numeroB > numeroC) {
            System.out.printf("%na)%nO maior número é B.");
        } else if (numeroC > numeroA && numeroC > numeroB) {
            System.out.printf("%na)%nO maior número é C.");
        } else if (numeroA == numeroB && numeroA == numeroC) {
            System.out.printf("%na)%nOs número são todos iguais.");
        }

        if (numeroA < numeroB && numeroA < numeroC) {
            System.out.printf("%nb)%nO menor número é A.");
        } else if (numeroB < numeroA && numeroB < numeroC) {
            System.out.printf("%nb)%nO menor número é B.");
        } else if (numeroC < numeroA && numeroC < numeroB) {
            System.out.printf("%nb)%nO menor número é C.");
        } else if (numeroA == numeroB && numeroA == numeroC) {
            System.out.printf("%nb)%nOs número são todos iguais.");
        }

        double mediaNumerosABC = numeroA + numeroB + numeroC / 3;

        System.out.printf("%nc)%nA média dos números é: %f", mediaNumerosABC);
    }

}
