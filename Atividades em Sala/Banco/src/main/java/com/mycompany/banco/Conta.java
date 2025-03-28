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
    String numero ;
    Pessoa titular ;
    double saldo ;
    double limite ;
    
    Conta(String n, Pessoa t){
        this.numero = n;
        this.titular = t;
        this.saldo = 0;
        this.limite = 200;
    }
    
    Conta(String n, Pessoa t, double l){
        this(n, t);
        this.limite = l;
    }
    
    double disponivel(){
        return this.saldo + this.limite;
    }
    
    void extrato(){
        System.out.println("*** EXTRATO DA CONTA ***");
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
    
    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + this.saldo);
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
    
    void chequeEspecial (double juro){
        if(this.saldo < 0){
            this.saldo = this.saldo + (juro*this.saldo)/100;
        }
    }
    
}

