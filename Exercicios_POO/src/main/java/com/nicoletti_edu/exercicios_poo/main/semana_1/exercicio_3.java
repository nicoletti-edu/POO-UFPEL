package com.nicoletti_edu.exercicios_poo.main.semana_1;

import java.util.Random;

/**
 *
 * @author nicoletti.edu
 */
public class exercicio_3 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Calcular Delta\n");
        Integer a = random.nextInt(100), b = random.nextInt(100),
                c = random.nextInt(100);
        System.out.println("A - " + a.toString() + " B - " + b.toString() + " C - " + c.toString() + "\n"
                + " Resultado: " + Integer.toString(b * b - (4 * a * c)) + "\n");

        System.out.println("Calcular Média Aritmética e Ponderara( Peso 2 e 3)");
        a = random.nextInt(10);
        b = random.nextInt(10);
        System.out.println("Média Aritmética: \nA - " + a.toString() + " B - " + b.toString() + " Resultado: " + (a + b) / 2.0 + "\n");
        System.out.println("Média Ponderada: \nA - " + a.toString() + " B - " + b.toString() + " Resultado: " + ((a * 2) + (b * 3)) / 5.0 + "\n");
    }
}
