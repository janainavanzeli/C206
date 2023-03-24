package org.media;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double np1, np2;

        System.out.println("Entre com a NP1: ");
        np1 = input.nextDouble();

        System.out.println("Entre com a NP2: ");
        np2 = input.nextDouble();

        System.out.println("Média final do aluno: " + (np1 + np2) / 2);

    }
}