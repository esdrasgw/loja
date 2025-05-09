/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

/**
 *
 * @author estagiario
 */
public class LogDePedido implements AcaoAposGerarPedido {
    
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado   " + pedido);
    }
    
}
