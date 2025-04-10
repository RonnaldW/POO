/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */

//import java.time.LocalDate;

public class Banco {            
    public static void main(String[] args) {
        
        //Criando as datas de nascimento
        
        Data dtNasc1 = new Data(10, 8, 2002);
        Data dtNasc2 = new Data(14, 12, 1981);
        //Data dataAtual = new Data(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
        //Criando um objeto da classe Pessoa
    
        Pessoa p1 = new Pessoa("Ronnald", dtNasc1,'F',"123.456.789-00");
        
        //Criando outro objeto da classe Pessoa
        
        Pessoa p2 = new Pessoa("João", dtNasc2, 'M',"234.567.890-12");
        
        // Criando Gerente
        Gerente g = new Gerente("Fatima Bernades", "111.444.777.35", new Data(1, 1, 2001), 'M', "00001", "12345");
        //Criando um objeto da classe Conta
        
        ContaCorrente c1 = new ContaCorrente("1234-5", p1, new Data(9, 11, 2020), g);
        
        //Criando outro objeto da classe Conta
        ContaCorrente c2 = new ContaCorrente("2345-6", p2, new Data(9, 11, 2020), g);
        
        //Utilizando Metodos
        
        /*
        c1.extrato();
        c2.extrato();
        
        c1.sacar(30);
        c2.sacar(100);
        c2.depositar(50);
        c1.transferir(200, c2);
       
        System.out.println(c2.saldo);
        
        for (int i = 1; i <= 120; i += 1){
            c1.chequeEspecial(0.5);
            
            if( i %30 == 0){
                System.out.println("Saldo apos " +i+ " dias: " + c1.saldo);
            }
        }
        
        System.out.println(p1.nome + " tem " + p1.calcularIdade(dataAtual) + " anos.");
        System.out.println(p2.nome + " tem " + p2.calcularIdade(dataAtual) + " anos.");
        */
    }
}
