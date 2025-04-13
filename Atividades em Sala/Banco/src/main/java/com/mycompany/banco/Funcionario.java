/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author 20231bsi0538
 */
import java.util.Scanner;

public class Funcionario extends Pessoa{
    double salario;
    String mat;
    
    public Funcionario() {
        super(); // Chama o construtor padrão de Pessoa

        Scanner s = new Scanner(System.in);

        System.out.printf("Digite a matrícula: ");
        this.mat = s.nextLine();

        System.out.printf("Digite o salário: ");
        this.salario = s.nextDouble();
    }
    
    public Funcionario(String nome, Data dtNasc, char sexo, String cpf, String matricula, double salario){
        super(nome, dtNasc, sexo, cpf); // Ordem correta dos parâmetros
        this.mat = matricula;
        this.salario = salario;
    }
    
    double bonificacao() {
        return this.salario*0.1;
    }
}
