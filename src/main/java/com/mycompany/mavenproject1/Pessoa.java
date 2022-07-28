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
public class Pessoa {
    protected String nome,cpf;
    protected Data dtNasc;
    protected char sexo;
    
    public Pessoa() {
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o nome: ");
        this.setNome(s.nextLine());
        
        System.out.printf("Digite a data de nascimento: ");
        this.setDtNasc(new Data());
        
        System.out.printf("Digite o sexo: ");
        this.setSexo(s.nextLine().charAt(0));
        
        System.out.printf("Digite o CPF: ");
        this.setCpf(s.nextLine());
    }
    
    public Pessoa(String n, Data dt, char s, String c){
        System.out.println("Nova pessoa criada no sistema.");
        this.nome = n;
        this.dtNasc = dt;
        this.sexo = s;
        this.cpf = c;
    }
    
    public int calculaIdade(int dia, int mes, int ano){
        if(this.getDtNasc().getMes() < mes){
            return ano - this.getDtNasc().getAno();
        }
        
        if(this.getDtNasc().getMes() > mes){
            return ano - this.getDtNasc().getAno() - 1;
        }
        
        if(this.getDtNasc().getDia() <= dia){
            return ano - this.getDtNasc().getAno();
        }
        return ano - this.getDtNasc().getAno() - 1;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
