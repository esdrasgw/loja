/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author estagiario
 */
public abstract class SituacaoOrcamento {
    
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
    
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }
    
    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }
    
    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }
}
