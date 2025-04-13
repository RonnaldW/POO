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

public class Gerente extends Funcionario{
    String senha;
       
    public Gerente() {
        super(); // Chama o construtor padrão de Funcionario

        Scanner s = new Scanner(System.in);

        System.out.printf("Digite a senha: ");
        this.senha = s.nextLine();
    }
    
    public Gerente(String senha, String nome, Data dtNasc, char sexo, String cpf, String matricula, double salario) {
        super(nome, dtNasc, sexo, cpf, matricula, salario);
        this.senha = senha;
    }
    
    double bonificacao(){
        return this.salario*0.15;
    }
    
    boolean validarAcesso(String s){
        return s.equals(this.senha);
    }
    
    boolean validarAcesso(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite a senha: ");
        String pwd = s.nextLine();
        return this.validarAcesso(pwd);
    }
    
}
