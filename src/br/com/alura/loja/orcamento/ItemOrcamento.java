/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

/**
 *
 * @author estagiario
 */
public class ItemOrcamento implements Orcavel {
    
    private BigDecimal valor;
    
    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }
    
    public BigDecimal getValor() {
        return valor;
    }
    
}
