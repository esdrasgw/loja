/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author estagiario
 */
public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }
    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
