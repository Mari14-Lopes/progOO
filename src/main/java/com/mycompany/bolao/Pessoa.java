/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolao;

/**
 *
 * @author maria
 */

import java.util.Scanner;
public class Pessoa {
    protected String nome;
    protected String cpf;
    
    public Pessoa() {
        Scanner s  = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        this.nome = s.nextLine();
        
        System.out.println("Digite o cpf: ");
        this.cpf = s.nextLine();
    }
    
    public void listarDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
    }
    
    
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
}
