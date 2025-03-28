/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Ronnald
 */
public class Data {
    int dia;
    int mes;
    int ano;
    
    Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;    
    }
    
    void imprimir(){
        System.out.println(dia + "/" +mes+ "/" +ano);
    }
    
    
    
}
