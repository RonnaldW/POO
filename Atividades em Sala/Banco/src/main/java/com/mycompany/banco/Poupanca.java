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
    
    public Poupanca(String n, Pessoa t, Data c, Gerente g){
        super(n, t, c, g); // Passa os parâmetros corretos para o construtor da classe pai
    }
    
    public void extrato(){
        System.out.println("EXTRATO DA CONTA POUPANCA");
        super.extrato();
    }
    
    public void rendimentos(double juros){
        this.setSaldo(this.getSaldo() + (juros * this.getSaldo()) / 100);
    }
        
}
