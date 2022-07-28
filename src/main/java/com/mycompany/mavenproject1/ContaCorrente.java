/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author maria
 */

public class ContaCorrente extends Conta {
    private double limite;
    
    public ContaCorrente(Gerente g) {
        super(g);                                                                                               
        this.limite = 200.0;
    }
    
    public ContaCorrente(String numero, Pessoa titular, Gerente ger, Data cria){
        super(numero, titular, ger, cria);
        this.limite = 200.0;
        System.out.println("Nova conta corrente criada no sistema.");
    }
    
    public void chequeEspecial (double juro){
        if(this.getSaldo() < 0){  
            this.setSaldo(this.getSaldo() + (juro * this.getSaldo()) / 100);
        }
    }
    
    protected double disponivel(){
        return this.getSaldo() + this.getLimite();
    }
    
    public void extrato() {
        System.out.println("***EXTRATO DA CONTA-CORRENTE***");
        super.extrato();
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(String pwd, double limite) {
        /*recebe a senha do gerente*/
        if(this.getGer().validarAcesso(pwd)) {
            this.limite = limite;
        }  
    }
            
}
