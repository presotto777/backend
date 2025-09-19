package com.mycompany.poo.aula12;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

   public Pessoa() {
    System.out.println("Chamando o construtor padrão");
   }

   public Pessoa(String nome) {
    this.nome = nome;
    System.out.println("chamando construtor 2 ");
   }

   public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Chamando construtor 3");
    }

    public Pessoa(double altura) {
        this.altura = altura;
        System.out.println("Chamando construtor 4");
    }

    // Não pode ter a mesma quantidade de parâmetros e tipos
    // public Pessoa(double peso) {
    //    this.peso = peso;
    //}

    public Pessoa(String nome, double altura){
        this.nome=nome;
        this.altura=altura;
        System.out.println("chamando construtor 5 ");

        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int nome) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}