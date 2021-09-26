package com.nicoletti_edu.exercicios_poo.main.semana_1;

import java.util.Scanner;

/**
 *
 * @author nicoletti.edu
 */
public class exercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu peso: ");

        int peso = scanner.nextInt();
        if (peso < 20) {
            System.out.println("Magro");
            return;
        }
        if (peso < 25) {
            System.out.println("Normal");
            return;
        }
        if (peso < 29) {
            System.out.println("Acima do Peso");
            return;
        }
        if (peso < 30) {
            System.out.println("Obeso");
            return;
        }
        System.out.println("Muito Obeso");
    }
}
