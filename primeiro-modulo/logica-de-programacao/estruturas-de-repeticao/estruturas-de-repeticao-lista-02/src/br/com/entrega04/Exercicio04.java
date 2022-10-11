package br.com.entrega04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idadeCliente = 0;
        int menorIdade = 0;
        int maiorIdade = 0;
        String sexoCliente = "";
        double salarioCliente = 0;
        double salarioTotal = 0;
        double mediaSalarios = 0;
        int quantidadeSalarioAte200 = 0;

        for (int i = 0; i < 300; i++) {
            System.out.println("Por favor informe sua idade: ");
            idadeCliente = teclado.nextInt();

            teclado.nextLine();

            System.out.println("Por favor informe seu sexo (Masculino/Feminino): ");
            sexoCliente = teclado.nextLine();

            System.out.println("Por favor informe seu salário: ");
            salarioCliente = teclado.nextDouble();

            salarioTotal += salarioCliente;

            if (sexoCliente.equalsIgnoreCase("feminino") && salarioCliente >= 200.00 && salarioCliente < 200.01) {
                quantidadeSalarioAte200 = quantidadeSalarioAte200 + 1;
            }

            if (i == 0) {
                maiorIdade = idadeCliente;
                menorIdade = idadeCliente;
            } else if (idadeCliente > maiorIdade) {
                maiorIdade = idadeCliente;
            } else if (idadeCliente < menorIdade) {
                menorIdade = idadeCliente;
            }
        }

        mediaSalarios = salarioTotal / 300;
        System.out.printf("A média dos salário é de: %f%nA maior idade é: %d%nA menor idade é %d%nA quantidade de mulheres com salários até R$200,00 é: %d", mediaSalarios, maiorIdade, menorIdade, quantidadeSalarioAte200);
    }

}
