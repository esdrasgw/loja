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
public class Reprovado extends SituacaoOrcamento {
    
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
