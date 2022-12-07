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

        System.out.println("Cor: ");
        carro.setCor(teclado.nextLine());

        System.out.println("Tipo do chassi: ");
        carro.setChassi(teclado.nextLine());

        System.out.println("Velocidade Máxima: ");
        carro.setVelocidadeMaxima(teclado.nextDouble());

        System.out.println("Número de marchas: ");
        carro.setNumeroMarchas(teclado.nextInt());

        for (int i = 0; i < carro.getVelocidadeMaxima(); i++) {
            carro.acelerar();
        }

        System.out.println(carro.getVelocidadeAtual());

        for (int i = 0; i < carro.getNumeroMarchas(); i++) {
            carro.aumentarMarcha();
        }

        System.out.println(carro.getMarchaAtual());

        for (int i = 0; i < carro.getNumeroMarchas(); i++) {
            carro.reduzirMarcha();
        }

        System.out.println(carro.getMarchaAtual());
    }

}
