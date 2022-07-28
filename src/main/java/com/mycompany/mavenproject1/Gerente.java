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
class Gerente extends Pessoa {
    private String matricula,senha;
    
    public Gerente() {
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o numero de matricula do gerente: ");
        this.setMatricula(s.nextLine());
        
        System.out.println("Digite a senha: ");
        this.senha = s.nextLine();
    }
    
    public Gerente(String n, Data dt, char s, String c, String m, String se) {
        super(n, dt, s, c);
        this.setMatricula(m);
        this.senha = se;
        System.out.println("Novo gerente criada no sistema.");
    }
    
    public boolean validarAcesso(String sen) {
        return sen.equals(this.getSenha());
    }
    
    public boolean validarAcesso() {
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite a senha de acesso para o gerente: ");
        String pwd = s.nextLine();
        return this.validarAcesso(pwd);
    }
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected String getSenha() {
        return senha;
    }
    
    public void setSenha(String atual, String senha) {
        if(atual.equals(this.senha)) {
            this.senha = senha;
        }
    }
    
}
