package com.nicoletti_edu.exercicios_poo.main.semana_1;

/**
 *
 * @author nicoletti.edu
 */
public class exercicio_1 {
    public static void main(String[] args) {
        System.out.println("Tabuada\n");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                StringBuilder sb = new StringBuilder();
                System.out.println(sb.append(i)
                        .append(" * ").append(j).append(" = ").append(i*j)
                        .append("\n").toString());
            }
        }
    }
}
