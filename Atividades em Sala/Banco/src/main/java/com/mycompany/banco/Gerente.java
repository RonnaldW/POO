/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */
public class Gerente extends Pessoa{
    String mat;
    String senha;
    
    public Gerente(String nome, String cpf, Data d, char s, String mat, String p){
        super(nome, d, s, cpf); // Ordem correta dos parâmetros
        this.mat = mat;
        this.senha = p;
    }
    
    boolean validarAcesso(String s){
        return s.equals(this.senha);
    }
    
}
