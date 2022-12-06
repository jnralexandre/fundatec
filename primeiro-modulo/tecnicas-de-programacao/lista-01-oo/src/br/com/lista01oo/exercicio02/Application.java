package br.com.lista01oo.exercicio02;

import br.com.lista01oo.exercicio01.Estado;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Cidade cidade01 = new Cidade();
        Estado estado01 = new Estado();

        System.out.println("Por favor, informe o nome da cidade: ");
        Scanner teclado = new Scanner(System.in);
        cidade01.setNomeCidade(teclado.nextLine());
        cidade01.setEstado(estado01);

        System.out.println("Informe o nome do Estado: ");
        estado01.setNomeEstado(teclado.nextLine());

        System.out.println("Por fim, informe a sigla do Estado: ");
        estado01.setSigla(teclado.nextLine());

        System.out.println(cidade01.getNomeCidade());
        System.out.println(cidade01.getEstado().getNomeEstado());
        System.out.println(cidade01.getEstado().getSigla());
    }

}
