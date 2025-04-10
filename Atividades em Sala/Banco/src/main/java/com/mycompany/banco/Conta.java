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

    // Construtor com quatro parâmetros
    public Conta(String n, Pessoa t, Data c, Gerente g) {
        this.numero = n;
        this.titular = t;
        this.saldo = 0; // Saldo inicial padrão
        this.criacao = c;
        this.gerente = g;
    }
   
    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + this.saldo);
    }
    
}

