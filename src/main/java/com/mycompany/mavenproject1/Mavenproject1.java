/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author maria
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        /*
        Data data1 = new Data(24,9,2004);
        Data data2 = new Data(13,4,2004);
        
        Pessoa p1 = new Pessoa("Maria", data1, 'F', "111.111.111-11");   
        Pessoa p2 = new Pessoa("Joao", data2, 'M', "222.222.222-22");
        
        Gerente g = new Gerente("Marcos", new Data(29,5,1971), 'M', "555.555.5", "99999", "115466");
        Gerente g2 = new Gerente("Luiza", new Data(9,5,1980), 'F', "777.777.77", "112233", "4455ml");
        
        ContaCorrente c1 = new ContaCorrente("1111-1", p1, g, new Data(25,9,2020));
        ContaCorrente c2 = new ContaCorrente("2222-22", p2, g2, new Data(25,9,2020));
        
        Poupanca pc1 = new Poupanca("2121-21", p1, g, new Data(4,6,2021));
        Poupanca pc2 = new Poupanca("2121-21", p2, g2, new Data(4,6,2021));
        
        g.validarAcesso("115466");
        g2.validarAcesso("5468");
        c1.extrato();
        c1.sacar(150);
        c1.disponivel();
        c1.chequeEspecial(0.1);
        c2.extrato();
        pc1.extrato();
        pc2.extrato();
        pc1.sacar(90);
        pc1.disponivel();
        pc1.depositar(50);
        pc1.rendimento(0.2);
        
        c1.depositar(80);
        
        
        for(int i = 1; i <= 120; i+=1){
            c1.chequeEspecial(0.5);
            
            if(i%30 == 0){
                System.out.println("Saldo apos " + i + " dias: " + c1.saldo);
            }    
        }
        
        data1.imprimir();
        
        System.out.println(p1.nome + " possui " + p1.calculaIdade(18, 7, 2022) + " anos de idade.");
        System.out.println(p2.nome + " possui " + p2.calculaIdade(18, 7, 2022) + " anos de idade.");
        */
        
        Gerente g = new Gerente();
        
        ContaCorrente c1 = new ContaCorrente(g);
        Poupanca p1 = new Poupanca(g);
        
        c1.extrato();
        p1.extrato();
        
        c1.sacar(200);
        p1.depositar(50);
        p1.transferir(30, c1);
        
        c1.extrato();
        p1.extrato();
        
    }
}
