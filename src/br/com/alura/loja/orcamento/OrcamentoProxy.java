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
public class OrcamentoProxy extends Orcamento {
    
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
    
    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            this.valor = orcamento.getValor();
        }
        
        return this.valor;
    }
}
