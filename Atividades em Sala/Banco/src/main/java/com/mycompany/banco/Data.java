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

public class Data {
    int dia;
    int mes;
    int ano;
    
    
    Data(){
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o dia: ");
        this.dia = s.nextInt();
        
        System.out.printf("Digite o mês: ");
        this.mes = s.nextInt();
        
        System.out.printf("Digite o ano: ");
        this.ano = s.nextInt();
    }
    
    Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
        
    }
    
    void imprimir(){
        System.out.println(dia + "/" +mes+ "/" +ano);
    }
    
    boolean maior(Data d2) {
        if (this.ano > d2.ano) {
            return true; // A data atual é maior se o ano for maior
        }
        else if (this.ano == d2.ano && this.mes > d2.mes) {
            return true; // A data atual é maior se o mês for maior
        }
        else if (this.ano == d2.ano && this.mes == d2.mes && this.dia > d2.dia) {
            return true; // A data atual é maior se o dia for maior
        }
        else {
            return false;
        }
    }
    
}
