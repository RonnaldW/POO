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
        System.out.println("ESTRATO DA CONTA-CORRENTE");
        super.extrato();
    }

    
    void chequeEspecial (double juro){
        if(this.saldo < 0){
            this.saldo = this.saldo + (juro*this.saldo)/100;
        }
    }
    
    void alterarLimite(){
        //Só deve ser executado após validar o acesso do gerente, utilizando a senha recebida como parâmetro.
    }
}
