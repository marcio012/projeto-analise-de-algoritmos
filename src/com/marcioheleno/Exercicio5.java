package com.marcioheleno;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Exercicio5 {

    public static void main(String[] args) {
        int[] A;
        double inicio1, fim1, tempo1;
        double inicio2, fim2, tempo2;

        System.out.printf("%5s%10s%10s%10s%10s\n", "n", "soma1", "tempo1", "soma2", "tempo2");
        System.out.println("-------------------------");
        for (int n = 1; n <= 50; n++) {
            A = criaVetorAleatorio(n);
            inicio1 = System.currentTimeMillis();
            int soma1 = soma1(A, n);
            fim1 = System.currentTimeMillis();
            tempo1 = fim1 - inicio1;
            inicio2 = System.currentTimeMillis();
            int soma2 = soma2(A, 0, n - 1);
            fim2 = System.currentTimeMillis();
            tempo2 = fim2 - inicio2;
            System.out.printf("%5d%10d%10.0f%10d%10.0f\n", n, soma1, tempo1, soma2, tempo2);
        }
    }

    static int soma1(int[] vetor, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            total = total + vetor[i];
        }
        return total;
    }

    static int soma2(int[] vetor, int i, int f) {
        if (i > f) {
            return 0;
        }

        if (i == f) {
            return vetor[i];
        }
//        m1 = (2*i + f) / 3;
//        m2 = (i + 2*f) / 3
        int m1 = (2*i + f) / 3;
        int m2 = (i + 2*f) / 3;

        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int a = soma2(vetor, i, m1-1);
        int b = soma2(vetor, m1 + i, m2 -1);
        int c = soma2(vetor, m2+1, f);
//        System.out.println(a + b + c);
        return a + b + c;

    }

    static int[] criaVetorAleatorio(int n) {
        Random randomGenerator = new Random();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = randomGenerator.nextInt(100 * n);
        }
        return A;
    }
}
