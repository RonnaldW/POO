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

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    private int dia;
    private int mes;
    private int ano;
    
    
    public Data(){
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o dia: ");
        this.dia = s.nextInt();
        
        System.out.printf("Digite o mês: ");
        this.mes = s.nextInt();
        
        System.out.printf("Digite o ano: ");
        this.ano = s.nextInt();
    }
    
    public Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
        
    }
    
    public void imprimir(){
        System.out.println(getDia() + "/" +getMes()+ "/" +getAno());
    }
    
    boolean maior(Data d2) {
        if (this.getAno() > d2.getAno()) {
            return true; // A data atual é maior se o ano for maior
        }
        else if (this.getAno() == d2.getAno() && this.getMes() > d2.getMes()) {
            return true; // A data atual é maior se o mês for maior
        }
        else if (this.getAno() == d2.getAno() && this.getMes() == d2.getMes() && this.getDia() > d2.getDia()) {
            return true; // A data atual é maior se o dia for maior
        }
        else {
            return false;
        }
    }
    
}
