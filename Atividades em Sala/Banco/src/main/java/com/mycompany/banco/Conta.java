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
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;
    Gerente gerente;

    
    Conta(Gerente g){
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
   
    double disponivel(){
        return this.saldo;
    }
    
    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + this.saldo);
    }
    
    void extrato(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo disponível para saque: " + this.disponivel() + "\n");
    }
    
    void sacar(double valor) {
    if (valor <= this.disponivel()) {
        System.out.println("Saque de " + valor + " realizado com sucesso.");
        this.saldo -= valor;
        System.out.println("Novo saldo: R$" + this.saldo);
    }else {
        System.out.println(" Erro: não foi possível sacar R$" + valor);
        System.out.println(" Valor disponível para saque: R$" + this.disponivel());
    }
    }
    
    void transferir(double valor, Conta destino) {
        if (valor <= this.disponivel()) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferencia de R$" + valor + " realizado com sucesso.");
            System.out.println("Origem: " + this.numero + " - Destino: " + destino.numero);
        } else {
            System.out.println("Erro: não foi possível transferir R$" + valor);
            System.out.println("Valor disponivel para transferencia: R$" + this.disponivel());
        }
    }
    
}

