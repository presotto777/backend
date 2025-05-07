package com.mycompany;

public class Aula03Operadores {
    public static void main(String[] args) {
        /**
         * tipo de comentarios
         */

        //Comentario de uma linha

        /**
         * Comentarios de
         * multiolas
         * linhas
         */

        /**
         * Declaração de variaveis
         */

        String var1; //Toda variavel declarada sem valor, automaticamente é null,
        String var2 = null; // Variavel declarada com valor null
        String var3 = ""; // variavel declarada com valor vazio (dierente de null)

        /**
         * Operadores Matematicos
         */

        int num1 = 10;
        int num2 = 2;

        System.out.println();
        
        // Soma
        int soma = num1 + num2;
        System.out.println("A soma de " + num1 + " e " + num2 + "é:" + soma);

        // Subtração
        int subtracao = num1 - num2;
        System.out.println("A subtração de " + num1 + " e " + num2 + "é:" + subtracao);

        // Multiplicação
        int multiplicacao = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " e " + num2 + "é:" + multiplicacao);

        // Divisão
        int divisao = num1 / num2;
        System.out.println("A divisão de " + num1 + " e " + num2 + "é:" + divisao);
    }
}