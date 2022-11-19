package br.com.entrega01;

public class Exercicio09 {

    public static void main(String[] args) {
        int[] arrayA = new int[10];

        arrayA[0] = 1;
        arrayA[1] = 2;
        arrayA[2] = 15;
        arrayA[3] = 12;
        arrayA[4] = 6;
        arrayA[5] = 10;
        arrayA[6] = 3;
        arrayA[7] = 4;
        arrayA[8] = 9;
        arrayA[9] = 5;

        int[] arrayB = new int[10];
        int[] arrayC = new int[10];
        int[] arrayD = new int[10];

        System.out.println("arrayA:");

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i] * 2;
        }

        System.out.println("arrayB: ");

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }

        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayB[i] * 3;
        }

        System.out.println("arrayC: ");

        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }

        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = arrayC[i] / 2;
        }

        System.out.println("arrayD: ");

        for (int i = 0; i < arrayD.length; i++) {
            System.out.println(arrayD[i]);
        }
    }

}
