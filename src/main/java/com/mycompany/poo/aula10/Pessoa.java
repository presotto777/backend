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
    public String nome; // Públio, é visivel em qualquer classe.
    protected int idade; //Protegido, é viivel somente em classes filhas (Herança).
    private double salario; // Privado, é visível somente dentro da propria classe.
    double altura; //Friendely ou público, apesar de não estar explicitado, ele também é visivel.

    public void exibirDados() {
        System.out.println("--- Dados da pessoa ---");
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Altura (m): " + altura);
    }

    /**
     * Nomenclatura de metodos
     * 
     * Métodos/Funções indicam ações, e por padrão utilizamos verbos.
     * 
     * Ex.: correr, andar, caminhar ...
     */

    public void atribuirSalario(double valor) {
        this.salario = valor;

        System.out.println("O novo salario de " + this.nome + " é: " + this.salario);
    }

    public void atribuirSalario(double valor, double bonus) {
        this.salario = valor + bonus;

        System.out.println("O novo salário de " + this.nome + " é: " + this.salario + " mais um bônus de " + bonus);
    }


}
