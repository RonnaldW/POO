/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */
public class ContaCorrente extends Conta {
    double limite;

    // Construtor com quatro parâmetros
    public ContaCorrente(String n, Pessoa t, Data c, Gerente g) {
        super(n, t, c, g); // Chama o construtor da classe pai com os quatro argumentos
        this.limite = 200; // Define o limite específico para contas correntes
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
