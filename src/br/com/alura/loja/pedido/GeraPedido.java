/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.pedido;

import java.math.BigDecimal;

/**
 *
 * @author estagiario
 */
public class GeraPedido {
    
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
