/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author maria
 */
public class Poupanca extends Conta {
    
    public Poupanca(Gerente g) {
        super(g);
    }
    
    public Poupanca(String numero, Pessoa titular, Gerente ger, Data cria) {
        super(numero, titular, ger, cria);
        System.out.println("Nova Poupanca criada no sistema.");
    }
    
    public void rendimento(double juros) {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * juros) / 100);
    }
    
    public void extrato() {
        System.out.println("***EXTRATO DA POUPANCA***");
        super.extrato();
    }
}
