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

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }
    private double limite;

    // Construtor com quatro parâmetros
    public ContaCorrente(String n, Pessoa t, Data c, Gerente g) {
        super(n, t, c, g); // Chama o construtor da classe pai com os quatro argumentos
        this.limite = 200; // Define o limite específico para contas correntes
    }
    
    public double disponivel(){
        return this.getSaldo() + this.getLimite();
    }
    
    public void extrato(){
        System.out.println("EXTRATO DA CONTA-CORRENTE");
        super.extrato();
    }

    
    public void chequeEspecial (double juro){
        if(this.getSaldo() < 0){
            this.setSaldo(this.getSaldo() + (juro * this.getSaldo()) / 100);
        }
    }
    
    void alterarLimite(){
        //Só deve ser executado após validar o acesso do gerente, utilizando a senha recebida como parâmetro.
    }
}
