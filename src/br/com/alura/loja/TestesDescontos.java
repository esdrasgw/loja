/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import java.math.BigDecimal;
import br.com.alura.loja.orcamento.Orcamento;

/**
 *
 * @author estagiario
 */
public class TestesDescontos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        
        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }
}
