/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;
import java.math.BigDecimal;

/**
 *
 * @author estagiario
 */
public class TestesComposicao {
    
    public static void main(String[] args) {
        
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();
        
        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);
        
        OrcamentoProxy proxy = new OrcamentoProxy(novo);
        
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());

    }
}
