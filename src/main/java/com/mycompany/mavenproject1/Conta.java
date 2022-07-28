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
public class Conta {
    protected String numero;
    protected Pessoa titular;
    protected double saldo;
    protected Data criacao;
    protected Gerente ger;
    
    public Conta(Gerente g) {
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o numero da conta: ");
        this.numero = s.nextLine();
        
        System.out.printf("Digite o nome do titular da conta: ");
        this.titular = new Pessoa();
        
        this.saldo  = 0;
        
        System.out.printf("Digite a data de criacao da conta: ");
        this.criacao = new Data();
        
        this.ger = g;
    }

    public Conta(String numero, Pessoa titular, Gerente g, Data cria) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.ger = g;
        this.criacao = cria;
        System.out.println("Nova conta adicionada ao sistema.");
    }
    
    public void depositar (double valor){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Deposito de " + valor + " para a conta " + this.getNumero() + " realizado com sucesso. Novo saldo disponivel: " + this.getSaldo());
    }
    
    protected double disponivel(){
        return this.getSaldo();
    }
    
    public void extrato(){
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Titular: " + this.getTitular().getCpf());
        System.out.println("Saldo disponivel para saque: " + this.disponivel());   
    }
    
    public boolean sacar(double valor){
        if(valor <= this.disponivel()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque na conta " + this.getNumero() + " realizado. Novo saldo disponivel: " + this.getSaldo());
            return true;
        }
        else{
            System.out.println("ERRO: Saque na conta " + this.getNumero() + " nao foi realizado. Valor disponivel: " + this.getSaldo());
            return false;
        }
    }
    
    public boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferencia de " + valor + " da conta " + this.getNumero() + " para a conta " + destino.getNumero() + " foi realizado com sucesso.");
            return true;
        }
        else {
            System.out.println("ERRO: Nao foi possivel transferir " + valor + " da conta " + this.getNumero() + " para a conta " + destino.getNumero() + ". Valor disponivel: " + this.disponivel());
            return false;
        }    
        
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getCriacao() {
        return criacao;
    }

    public void setCriacao(Data criacao) {
        this.criacao = criacao;
    }

    public Gerente getGer() {
        return ger;
    }

    public void setGer(Gerente ger) {
        this.ger = ger;
    }
    
}
