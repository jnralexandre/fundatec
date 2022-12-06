package br.com.lista01oo.exercicio01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Estado estado01 = new Estado();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe o nome de um Estado: ");
        estado01.setNomeEstado(teclado.nextLine());

        System.out.println("Por fim, informe a sigla do Estado: ");
        estado01.setSigla(teclado.nextLine());

        System.out.println(estado01.getNomeEstado());
        System.out.println(estado01.getSigla());
    }

}
