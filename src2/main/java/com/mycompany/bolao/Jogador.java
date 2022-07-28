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
public class Jogador extends Pessoa {
    private String pix;
    
    public Jogador() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o pix: ");
        this.pix = s.nextLine();
    }
    
    public void listarDados() {
        super.listarDados();
        System.out.println("Pix: " + this.getPix());
    }
    
    
    /**
     * @return the pix
     */
    public String getPix() {
        return pix;
    }

    /**
     * @param pix the pix to set
     */
    public void setPix(String pix) {
        this.pix = pix;
    }
}
