/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Conta;

/**
 *
 * @author kelly
 */
public class ContaService {
    
    public boolean debitar(Conta conta, double valor){
        if (valor <= 0 || conta.getSaldo() < valor){
            return false;
        }
        
        double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
        return true;
    }
    
    public void creditar(Conta conta, double valor){
        if (valor > 0) {
            double novoSaldo = conta.getSaldo() + valor;
            conta.setSaldo(novoSaldo);
        }
    }
}
