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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dtNasc
     */
    public Data getDtNasc() {
        return dtNasc;
    }

    /**
     * @param dtNasc the dtNasc to set
     */
    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    protected String nome ;
    protected Data dtNasc ;
    protected char sexo ;
    protected String cpf ;
    
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
        int idade = dataAtual.getAno() - this.getDtNasc().getAno();

        if (dataAtual.getMes() < this.getDtNasc().getMes() || (dataAtual.getMes() == this.getDtNasc().getMes() && dataAtual.getDia() < this.getDtNasc().getDia())) {
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

