/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 *
 * @author estagiario
 */
public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Teste";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");
        
        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), 
                new EnviarEmailPedido(),
                new LogDePedido()
            ));
        handler.execute(gerador);
        
        
    }
}
