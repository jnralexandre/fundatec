package br.com.entrega01;

public class Exercicio04 {

    public static void main(String[] args) {
        int[] arrayA = new int[10];

        arrayA[0] = 5;
        arrayA[1] = 10;
        arrayA[2] = -11;
        arrayA[3] = -1;
        arrayA[4] = 13;
        arrayA[5] = -2;
        arrayA[6] = -4;
        arrayA[7] = 5;
        arrayA[8] = 19;
        arrayA[9] = 5;

        int inteiroX = 5;

        int quantidadeValorXArray = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == inteiroX) {
                quantidadeValorXArray++;
            }
        }

        System.out.printf("A quantidade de vezes que o valor (%d) apareceu no arrayA são (%d) vezes", inteiroX, quantidadeValorXArray);
    }

}
