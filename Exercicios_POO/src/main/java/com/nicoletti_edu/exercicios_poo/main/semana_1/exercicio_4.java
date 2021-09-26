package com.nicoletti_edu.exercicios_poo.main.semana_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nicoletti.edu
 */
public class exercicio_4 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Buscar menor numero e todos positivos\n");
        Integer a = random.nextInt(), b = random.nextInt(),
                c = random.nextInt();
        System.out.println(a.toString() + " " + b.toString() + " " + c.toString() + "\n");
        int menor = (a < b ? a : b);
        menor = menor < c ? menor : c;
        System.out.println("Menor: " + menor + "\n");
        System.out.println("Positivos: ");
        Integer[] ints = {a, b, c};
        List<Integer> numeros = new ArrayList<>(Arrays.asList(ints));
        for (Integer numero : numeros) {
            if (numero > 0) {
                System.out.println(numero + " ");
            }
        }
    }
}
