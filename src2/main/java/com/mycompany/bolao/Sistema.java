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
public class Sistema {
    private Aposta a;
    
    public Sistema() {
        this.a = new Aposta();
    }
    
    public void sorteio() {
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Digite o valor do premio: ");
        double premio = s.nextDouble();
        
        int[] sorteados;
        sorteados = new int[6];
        int i = 0;
        while(i < 6) {
            System.out.printf("Digite o numero sorteado: ");
            sorteados[i] = s.nextInt();
            
            while(sorteados[i] < 1 || sorteados[i] > 60) {
                System.out.printf("ERRO! Digite numeros de 1 a 60: ");
                sorteados[i] = s.nextInt();
            }
            for(int x = 0; x < i; x++) {
                if(sorteados[x] == sorteados[i]){
                    System.out.println("ERRO! Numero ja inserido anteriormente. Tente novamente.");
                    i--;
                }
            }
            i++;
        }
        
        if(getA().vencedora(sorteados)) {
            getA().exibirPremio(premio);
        }
        else{
            System.out.println("NAO HOUVE VENCEDORES");
        }
        
    }
       
    /**
     * @return the a
     */
    public Aposta getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Aposta a) {
        this.a = a;
    }

}