package br.com.entrega02.exercicio01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Por favor, informe as seguintes informações do carro: ");
        System.out.println("Marca: ");
        Carro carro = new Carro();
        Scanner teclado = new Scanner(System.in);
        carro.setMarca(teclado.nextLine());

        System.out.println("Modelo: ");
        carro.setModelo(teclado.nextLine());

        System.out.println("Ano de lançamento: ");
        carro.setAno(teclado.nextInt());

        teclado.nextLine();

        System.out.println("Cor: ");
        carro.setCor(teclado.nextLine());

        System.out.println("Tipo do chassi: ");
        carro.setChassi(teclado.nextLine());

        System.out.println("Velocidade Máxima: ");
        carro.setVelocidadeMaxima(teclado.nextDouble());

        System.out.println("Número de marchas: ");
        carro.setNumeroMarchas(teclado.nextInt());

        teclado.nextLine();

        System.out.println("Para acelerar o carro, digite A: ");
        String acelerar = teclado.nextLine();

        if (acelerar.equalsIgnoreCase("A")) {
            for (int i = 0; i < carro.getVelocidadeMaxima(); i++) {
                carro.acelerar();
            }

            System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());
        }

        System.out.println("Para aumentar a marcha do carro, digite B: ");
        String aumentarMarcha = teclado.nextLine();

        if (aumentarMarcha.equalsIgnoreCase("B")) {
            for (int i = 0; i < carro.getNumeroMarchas(); i++) {
                carro.aumentarMarcha();
            }

            System.out.println("Marcha atual: " + carro.getMarchaAtual());
        }

        System.out.println("Para reduzir a marcha do carro, digite C: ");
        String reduzirMarcha = teclado.nextLine();

        if (reduzirMarcha.equalsIgnoreCase("C")) {
            for (int i = 0; i < carro.getNumeroMarchas(); i++) {
                carro.reduzirMarcha();
            }

            System.out.println("Marcha atual: " + carro.getMarchaAtual());
        }
    }

}
