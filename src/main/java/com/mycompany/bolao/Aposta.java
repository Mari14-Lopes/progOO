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
public class Aposta {
    private int n;
    private int[] numeros;
    private Jogador organizador;
    private Jogador jog1;
    private Jogador jog2;
    
    public Aposta() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite os dados do organizador");
        this.organizador = new Jogador();
        System.out.println("Digite os dados do jogador 1");
        this.jog1 = new Jogador();
        System.out.println("Digite os dados do jogador 2");
        this.jog2 = new Jogador();
        
        System.out.printf("Digite a quantidade de numeros que deseja apostar: ");
        this.n = s.nextInt();
        while(n < 6 || n > 15) {
            System.out.printf("ERRO! Digite a quantidade de numeros entre 6 e 15: ");
            this.n = s.nextInt();
        }
        
        this.numeros = new int[n];
        int i = 0;
        while(i < n) {
            System.out.printf("Digite o numero que deseja apostar: ");
            numeros[i] = s.nextInt();
            
            while(numeros[i] < 1 || numeros[i] > 60) {
                System.out.printf("ERRO! Digite numeros de 1 a 60: ");
                numeros[i] = s.nextInt();
            }
            for(int x = 0; x < i; x++) {
                if(numeros[x] == numeros[i]){
                    System.out.println("ERRO! Numero ja inserido anteriormente. Tente novamente. ");
                    i--;
                }
            }
            i++;
        }
        
    }        
    
    public boolean vencedora(int[] nums) {
        int cont = 0;
        for(int j = 0; j < this.getNumeros().length; j++) {
            for(int m = 0; m < nums.length; m++) {
                if(this.getNumeros()[j] == nums[m]) {
                    cont++;
                }
            }
        } 
        
        if(cont == 6) {
            System.out.println("VOCE VENCEU");
            return true;
        }
        System.out.println("VOCE PERDEU");
        return false;
    }
    
    public void exibirPremio(double valor) {
        double org = (0.1*valor) + (valor - (0.1*valor))/3;
        double jg = (valor - (0.1*valor))/3;
        
        System.out.println("Vencedore do premio de " + valor + " reais.");
        
        this.getOrganizador().listarDados();
        System.out.println("Premio: " + org);
        
        this.getJog1().listarDados();
        System.out.println("Premio: " + jg);
        
        this.getJog2().listarDados();
        System.out.println("Premio: " + jg);
    }
    
    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the numeros
     */
    public int[] getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the organizador
     */
    public Jogador getOrganizador() {
        return organizador;
    }

    /**
     * @param organizador the organizador to set
     */
    public void setOrganizador(Jogador organizador) {
        this.organizador = organizador;
    }

    /**
     * @return the jog1
     */
    public Jogador getJog1() {
        return jog1;
    }

    /**
     * @param jog1 the jog1 to set
     */
    public void setJog1(Jogador jog1) {
        this.jog1 = jog1;
    }

    /**
     * @return the jog2
     */
    public Jogador getJog2() {
        return jog2;
    }

    /**
     * @param jog2 the jog2 to set
     */
    public void setJog2(Jogador jog2) {
        this.jog2 = jog2;
    }

}