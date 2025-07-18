/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Pix;
import entity.Conta;
import java.util.List;


/**
 *
 * @author kelly
 */
public class PixService {
    
    private List<Conta> contas;
    private ContaService contaService;
    private LogService logService;
    
    public PixService(List<Conta> contasDisponiveis){
        this.contas = contasDisponiveis;
        this.contaService = new ContaService();
        this.logService = new LogService();
    }
    
    public boolean transacaoPix (String chaveDestino, double valor, Conta origem) {
        Conta destino = encontrarContaPorChave(chaveDestino);
        if (destino == null) {
            logService.registrar("Erro: chave " + chaveDestino + " não encontrada.");
            return false;
        }
        
        double saldoOrigemAntes = origem.getSaldo();
        double saldoDestinoAntes = destino.getSaldo();
        
        boolean sucesso = contaService.debitar(origem, valor);
        if (!sucesso) {
            logService.registrar("Erro: saldo insuficiente para enviar R$" + valor + " de " + origem.getCliente().getTitular());
            return false;
        }
        
        contaService.creditar(destino, valor);
        
        double saldoOrigemDepois = origem.getSaldo();
        double saldoDestinoDepois = destino.getSaldo();
        
        logService.registrar("PIX enviado de " + origem.getCliente().getTitular() + " para " + destino.getCliente().getTitular() + " no valor de R$" + valor);
        logService.registrar("Saldo de " + origem.getCliente().getTitular() + ": antes R$" + saldoOrigemAntes + ", depois R$" + saldoOrigemDepois);
        logService.registrar("Saldo de " + destino.getCliente().getTitular() + ": antes R$" + saldoDestinoAntes + ", depois R$" + saldoDestinoDepois);
        
        return true;
    }
    
    private Conta encontrarContaPorChave(String chave){
        for (Conta conta : contas){
            if(conta.getCliente().getChavePix().equalsIgnoreCase(chave)){
                return conta;
            }
        }
        return null;
    }
}
