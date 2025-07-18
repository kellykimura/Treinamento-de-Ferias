/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author kelly
 */
public class Cliente {
    
    private String titular;
    private String chavePix;
    
    // Método construtor
    public Cliente (String titular, String chavePix) {
        this.titular = titular;
        this.chavePix = chavePix;
    }

    // Getters and Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    
    
}
