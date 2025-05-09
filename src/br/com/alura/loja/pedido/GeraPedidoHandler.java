/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author estagiario
 */
public class GeraPedidoHandler {
    
    private List<AcaoAposGerarPedido> acoes;
    
    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }
    
    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));
        
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
      
        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
