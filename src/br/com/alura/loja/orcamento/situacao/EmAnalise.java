/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author estagiario
 */
public class EmAnalise extends SituacaoOrcamento{
    
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
    
    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }
    
    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
