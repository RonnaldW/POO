/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */
public class Conta {

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the titular
     */
    public Pessoa getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the criacao
     */
    public Data getCriacao() {
        return criacao;
    }

    /**
     * @param criacao the criacao to set
     */
    public void setCriacao(Data criacao) {
        this.criacao = criacao;
    }

    /**
     * @return the gerente
     */
    public Gerente getGerente() {
        return gerente;
    }

    /**
     * @param gerente the gerente to set
     */
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    protected String numero;
    protected Pessoa titular;
    protected double saldo;
    protected Data criacao;
    protected Gerente gerente;

    
    public Conta(Gerente g){
       //Solicitar os outros atributos e criar um novo objeto para armazenar o titular da conta. Apenas o saldo nao deve ser informado, pois começa zerado. 
    }
    
    // Construtor com quatro parâmetros
    public Conta(String n, Pessoa t, Data c, Gerente g) {
        this.numero = n;
        this.titular = t;
        this.saldo = 0; // Saldo inicial padrão
        this.criacao = c;
        this.gerente = g;
    }
   
    protected double disponivel(){
        return this.getSaldo();
    }
    
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + this.getSaldo());
    }
    
    public void extrato(){
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Saldo disponível para saque: " + this.disponivel() + "\n");
    }
    
    public void sacar(double valor) {
    if (valor <= this.disponivel()) {
        System.out.println("Saque de " + valor + " realizado com sucesso.");
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Novo saldo: R$" + this.getSaldo());
    }else {
        System.out.println(" Erro: não foi possível sacar R$" + valor);
        System.out.println(" Valor disponível para saque: R$" + this.disponivel());
    }
    }
    
    public void transferir(double valor, Conta destino) {
        if (valor <= this.disponivel()) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferencia de R$" + valor + " realizado com sucesso.");
            System.out.println("Origem: " + this.getNumero() + " - Destino: " + destino.getNumero());
        } else {
            System.out.println("Erro: não foi possível transferir R$" + valor);
            System.out.println("Valor disponivel para transferencia: R$" + this.disponivel());
        }
    }
    
}

