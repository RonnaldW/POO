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
    
    void extrato(){
        System.out.println("ESTRATO DA CONTA POUPANCA");
        super.extrato();
    }
    
    void rendimentos(double juros){
        this.saldo = this.saldo + (juros*this.saldo)/100;
    }
        
}
