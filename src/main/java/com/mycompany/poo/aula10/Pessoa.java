package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de acesso
     * Quando trabalhamos com o cenceito de poo, utilizamos modificadores de acesso, 
     * para dar segurança para nossas classes.
     * 
     * Utilizamos ela como prefixo para:
     * -Classes
     * -Interfaces
     * -Atributos
     * -Métodos
     */
    public string nome; // Públio, é visivel em qualquer classe.
    protected int idade; //Protegido, é viivel somente em classes filhas (Herança).
    private double salario; // Privado, é visível somente dentro da propria classe.
    double altura; //Friendely ou público, apesar de não estar explicitado, ele também é visivel.

    public void exibirDados() {
        System.out.println("--- Dados da pessoa ---");
       System.out.println("Nome: " + pessoa1.nome);
       System.out.println("Idade: " + pessoa1.idade);
       System.out.println("Altura (m): " + pessoa1.altura);
    }

}
