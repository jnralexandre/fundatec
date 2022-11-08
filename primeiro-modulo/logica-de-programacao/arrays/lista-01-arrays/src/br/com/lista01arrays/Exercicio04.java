package br.com.lista01arrays;

public class Exercicio04 {

    public static void main(String[] args) {
//        4. Crie um algoritmo que receba um valor qualquer. Após preencha um array com 20
//        valores. Em um terceiro passo multiplique e imprima o resultado do valor recebido
//        pelos valores armazenados no array.
        int numeroRecebido = 3;

        int[] numerosRecebidos = new int[20];

        numerosRecebidos[0] = 2;
        numerosRecebidos[1] = 9;
        numerosRecebidos[2] = 13;
        numerosRecebidos[3] = 8;
        numerosRecebidos[4] = 9;
        numerosRecebidos[5] = 40;
        numerosRecebidos[6] = 21;
        numerosRecebidos[7] = 27;
        numerosRecebidos[8] = 17;
        numerosRecebidos[9] = 19;
        numerosRecebidos[10] = 14;
        numerosRecebidos[11] = 45;
        numerosRecebidos[12] = 7;
        numerosRecebidos[13] = 3;
        numerosRecebidos[14] = 31;
        numerosRecebidos[15] = 24;
        numerosRecebidos[16] = 15;
        numerosRecebidos[17] = 20;
        numerosRecebidos[18] = 12;
        numerosRecebidos[19] = 4;

        int somaResultadoArray = 0;
        int multiplicaResultado = 0;

        for (int i = 0; i < 20; i++) {
            somaResultadoArray += numerosRecebidos[i];
        }

        multiplicaResultado = somaResultadoArray * numeroRecebido;

        System.out.printf("O resultado da multiplicação é: %d", multiplicaResultado);
    }

}
