/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */
public class Poupanca extends Conta{
    
    Poupanca(String n, Pessoa t, Data c, Gerente g){
        super(n, t, c, g); // Passa os parâmetros corretos para o construtor da classe pai
    }
    
    double disponivel(){
        return this.saldo;
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
}
