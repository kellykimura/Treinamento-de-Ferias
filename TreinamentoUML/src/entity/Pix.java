/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author kelly
 */
public class Pix {
    
    private Conta origem;
    private Conta destino;
    private double valor;
    
    // Método Construtor
    public Pix (Conta origem, Conta destino, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }
    
    // Getters
    public Conta getOrigem(){
        return origem;
    }
    
    public Conta getDestino(){
        return destino;
    }
    
    public double getValor(){
        return valor;
    }
}
