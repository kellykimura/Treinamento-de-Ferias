/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.Conta;
import service.PixService;
/**
 *
 * @author kelly
 */
public class PixController {
    
    private PixService service;
    private Conta origem;
    
    public PixController (PixService service, Conta origem){
        this.service = service;
        this.origem = origem;
    }
    
    public boolean enviarPix(String chaveDestino, double valor){
        return service.transacaoPix(chaveDestino, valor, origem);
    }
}
