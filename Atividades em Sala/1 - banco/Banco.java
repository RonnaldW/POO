/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */
public class Banco {            
    public static void main(String[] args) {
        
        //Criando um objeto da classe Pessoa
    
        Pessoa p1 = new Pessoa();
        p1.nome = "Ronnald";
        p1.idade = 23;
        p1.sexo = 'F';
        p1.cpf = "123.456.789-00";
        
        //Criando outro objeto da classe Pessoa
        
        Pessoa p2 = new Pessoa();
        p2.nome = "João";
        p2.idade = 22;
        p2.sexo = 'M';
        p2.cpf = "234.567.890-12";
        
        //Criando um objeto da classe Conta
        
        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.titular = p1; //Pessoa titular pela conta
        c1.saldo = 200.0;
        c1.limite = 300.0;
        
        //Criando outro objeto da classe Conta
        Conta c2 = new Conta();
        c2.numero = "2345-6";
        c2.titular = p2;
        c2.saldo = 2;
        c2.limite = 250;
        
        //Executando o metodo que imprime o extrato
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: "+ c2.numero);
        System.out.println("Titular: " + c2.titular.nome);
        System.out.println("Saldo da conta: " + c2.saldo);
    }
}
