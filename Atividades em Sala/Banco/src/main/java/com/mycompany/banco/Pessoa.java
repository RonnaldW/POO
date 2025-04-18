/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */

import java.util.Scanner;

public class Pessoa {
    String nome ;
    Data dtNasc ;
    char sexo ;
    String cpf ;
    
    Pessoa(){
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o nome: ");
        this.nome = s.nextLine();
        
        System.out.printf("Digite o cpf: ");
        this.cpf = s.nextLine();    
        
        System.out.printf("Data de Nascimento: ");
        this.dtNasc = new Data();
        
        System.out.printf("Informe o sexo: ");
        this.sexo = s.nextLine().charAt(0);
    }
    
    
    Pessoa(String n, Data dt, char s, String c){
        this.nome = n;
        this.dtNasc = dt;
        this.sexo = s;
        this.cpf = c;
        
        System.out.println("Nova pessoa criada no sistema.");
        
    }
    
    int calcularIdade(Data dataAtual) {
        int idade = dataAtual.ano - this.dtNasc.ano;

        if (dataAtual.mes < this.dtNasc.mes || (dataAtual.mes == this.dtNasc.mes && dataAtual.dia < this.dtNasc.dia)) {
            idade--;
        }

        return idade;
    }
    
    /*
    void aniversario(){
        this.idade = this.idade + 1;
    }

    
    void atribuiCPF(String c){
        this.cpf = c;
    }
    

    int getIdade(){
        return this.idade ;
    }
    */
}

