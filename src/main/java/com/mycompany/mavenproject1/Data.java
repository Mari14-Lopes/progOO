/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author maria
 */

import java.util.Scanner;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o dia: ");
        this.dia = s.nextInt();
        
        System.out.printf("Digite o mes: ");
        this.mes = s.nextInt();
        
        System.out.printf("Digite o ano: ");
        this.ano = s.nextInt();
    }
    
    public Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
        System.out.println("Nova data criada no sistema.");
    }
    
    public void imprimir(){
        System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
    }
    
    public boolean maior(Data d2) {
        if(this.getAno() > d2.getAno()) {
            return true;
        }
        if(this.getAno() < d2.getAno()) {
            return false;
        }
        if(this.getMes() > d2.getMes()) {
            return true;
        }
        if(this.getMes() < d2.getMes()) {
            return false;
        }
        if(this.getDia() > d2.getDia()) {
            return true;
        }
        return false;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
