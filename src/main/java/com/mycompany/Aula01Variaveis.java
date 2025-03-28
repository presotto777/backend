package com.mycompany;

public class Aula01Variaveis {

    public static void main(String[] args) {
        // variavel lógica

        // tipo primitivo
        boolean valorLogicoPrimitivo = true;

        //Exibe o Valor
        System.out.println(valorLogicoPrimitivo);

        // Topo abstrato
        Boolean valorLogicoAbstrato = false;

        //Exibe o texto
        System.out.println("O valor da variavel alorogicoAbstrato é : " + valorLogicoAbstrato);

        // Variaveis inteiras

        // Tipo primitivo
        int valorInteiro = 10; // 32bits
        long valorInteiroLongo = 10L; // 64bits

        // Tipo abstrato 
        Integer valorInteiroAbs = 20;
        Long valorLongoAbs = 20L;

        System.out.println("O valorInteiro é: " + valorInteiro + ", e o valor de valorInteiroLongo é: " + valorInteiroLongo);

    }
}