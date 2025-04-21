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

        // Criando 4 objetos da classe Pessoa
        
        Data dataNascimento1 = new Data(15, 8, 1990); // Supondo que Data tenha um construtor assim
        Pessoa pessoa1 = new Pessoa("Marta", dataNascimento1, 'F', "123.456.189-00");

        Data dataNascimento2 = new Data(20, 5, 1985); // Supondo que Data tenha um construtor assim
        Pessoa pessoa2 = new Pessoa("Marcos", dataNascimento2, 'M', "987.654.221-00");

        Data dataNascimento3 = new Data(15, 8, 1990); // Supondo que Data tenha um construtor assim
        Pessoa pessoa3 = new Pessoa("Maria Silva", dataNascimento3, 'F', "123.456.789-00");

        Data dataNascimento4 = new Data(20, 5, 1985); // Supondo que Data tenha um construtor assim
        Pessoa pessoa4 = new Pessoa("João Souza", dataNascimento4, 'M', "987.654.321-00");

        
        // Criando 2 objetos da classe Gerente
        Gerente gerente1 = new Gerente();

        Data dataNascimentoGerente2 = new Data(10, 5, 1980); // Supondo que Data tenha um construtor assim
        Gerente gerente2 = new Gerente(
            "senha123", // Senha
            "João Silva", // Nome
            dataNascimentoGerente2, // Data de nascimento
            'M', // Sexo
            "123.456.789-00", // CPF
            "G12345", // Matrícula
            5000.0 // Salário
        );
        
        // Criando 2 objetos da classe ContaCorrente

        Data dataCriacao = new Data(10, 10, 2023); 

        ContaCorrente conta1 = new ContaCorrente("12345-6", pessoa1, dataCriacao, gerente1);
        conta1.saldo = 1000.0; 

        ContaCorrente conta2 = new ContaCorrente("65432-1", pessoa3, dataCriacao, gerente2);
        conta2.saldo = -50.0; 

        // Criando 2 objetos da classe Poupanca
        
        Data dataCriacaoPoupanca = new Data(10, 10, 2023); 

        Poupanca contaPoupanca1 = new Poupanca("98765-4", pessoa2, dataCriacaoPoupanca, gerente1);
        contaPoupanca1.saldo = 2000.0; 

        Poupanca contaPoupanca2 = new Poupanca("45678-9", pessoa4, dataCriacaoPoupanca, gerente2);
        contaPoupanca2.saldo = 500.0; 


    }
}
