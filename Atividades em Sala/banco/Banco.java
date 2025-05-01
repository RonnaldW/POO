/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ronnald
 */

public class Banco {
    public static void main(String[] args) {
       
        public static int menuInicial(){
            Scanner s = new Scanner(System.in);
            System.out.println("Bem vindo! Escolha uma opção.\n");
            System.out.println("1) Cadastro");
            System.out.println("2) Movimentação Financecira");
            System.out.println("0) Sair");
            
            return s.nextInt();
        }
        
        public static Pessoa escolherPessoa(ArrayList<Pessoa> p){
            Scanner s = new Scanner(System.in);
            int i = 1;
            System.out.println("Escolha o cliente da conta:");
            for (Pessoa tit : p){
                System.out.println(i + ")" + tit.getCpf() + " - " + tit.getNome());
                i++;
            }
            int index = s.nextInt();
            return p.get(index-1);
        }
       
        public static Gerente escolherGerente(ArrayList<Gerente> g){
            Scanner s = new Scanner(System.in);
            int i = 1;
            System.out.println("Escolha o Gerente da conta:");
            for (Gerente ger : g){
                System.out.println(i + ")" + ger.getCpf() + " - " + ger.getNome());
                i++;
            }
            int index = s.nextInt();
            return g.get(index-1);
        }
        
        public static Conta escolherConta(ArrayList<Conta> c){
            Scanner s = new Scanner(System.in);
            int i = 1;
            System.out.println("Escolha uma conta:");
            for (Conta cc : c){
                System.out.println(i + ")" + cc.getNumero() + " - " + cc.getTitular().getNome());
                i++;
            }
            int index = s.nextInt();
            return c.get(index-1);
        }
        
        public static void menuCadastro(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c){
            Scanner s = new Scanner(System.in);
            
            System.out.println("O que deseja cadastrar?");
            System.out.println("1) Novo cliente");
            System.out.println("2) Novo gerente");
            System.out.println("3) Nova conta corrente");
            System.out.println("4) Nova conta poupança");
            
            int op = s.nextInt();
            
            if (op == 1) p.add(new Pessoa());
            if (op == 2) p.add(new Gerente());
            if (op == 3){
                Pessoa tit = escolherPessoa(p);
                Gerente ger = escolherGerente(g);
                c.add(new ContaCorrente(tit, ger));
            } 
            if (op == 4) {
                Pessoa tit = escolherPessoa(p);
                Gerente ger = escolherGerente(g);
                c.add(new Poupanca(tit, ger));
            }
        }
        
        public static void menuMovimentacoes(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c){
            Scanner s = new Scanner(System.in);
            
            Conta conta = escolherConta(c);
            
            System.out.println("O que deseja realizar?");
            System.out.println("1) Extrato");
            System.out.println("2) Saque");
            System.out.println("3) Deposito");
            System.out.println("4) Transferencia");
            
            int op = s.nextInt();
            
            if (op == 1) conta.extrato();
            if (op == 2) conta.sacar();
            if (op == 3) conta.depositar();
            if (op == 4){
                System.out.println("Qual a conta destino?");
                Conta conta2 = escolherConta(c);
                conta.transferir(conta2);
            }
        }
        
        ArrayList<Pessoa> p = new ArrayList<>();
        ArrayList<Gerente> g = new ArrayList<>();
        ArrayList<Conta> c = new ArrayList<>();
        
        int op = menuInicial();
        while (op != 0){
            if(op == 1){
                menuCadastro(p, g, c);
            }
            else {
                menuMovimentacoes(p, g , c);
            }
            
            op = menuInicial();
            
        }
        
    }
}
