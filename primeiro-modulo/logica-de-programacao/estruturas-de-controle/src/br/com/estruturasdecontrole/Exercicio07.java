package br.com.estruturasdecontrole;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println("Informe o horário, com exceção dos minútos: ");
        Scanner teclado = new Scanner(System.in);
        int horarioInformado = teclado.nextInt();

        System.out.println("Agora informe somente os minútos: ");
        int minutosInformados = teclado.nextInt();


        if (horarioInformado > 5 && horarioInformado < 13) {
            System.out.println("Bom dia!");
        } else if (horarioInformado >= 13 && horarioInformado <= 18) {
            System.out.println("Boa tarde!");
        } else if (horarioInformado >= 19 & horarioInformado <= 24 || horarioInformado == 00) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("O horário informado não está de acordo com o pedido.");
        }
    }

}
