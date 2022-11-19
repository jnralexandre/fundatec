package br.com.entrega01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        String[] clientes = new String[10];

        clientes[0] = "Carlos";
        clientes[1] = "Rodrigo";
        clientes[2] = "Amanda";
        clientes[3] = "Diego";
        clientes[4] = "Francisco";
        clientes[5] = "Pedro";
        clientes[6] = "Luana";
        clientes[7] = "Eduarda";
        clientes[8] = "Yasmin";
        clientes[9] = "Alexandre";

        System.out.println("Informe um nome de uma pesssoa para pesquisar no nosso array: ");
        Scanner teclado = new Scanner(System.in);
        String pesquisaNomeArray = teclado.nextLine();

        boolean encontrei = false;

        for (int i = 0; i < clientes.length; i++) {
            if (pesquisaNomeArray.equalsIgnoreCase(clientes[i])) {
                encontrei = true;
                System.out.println("Este nome está presente no array.");
                break;
            }
        }
    }

}
