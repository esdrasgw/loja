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
public class CalculadoraDeDescontos {
    
    public BigDecimal calcular(Orcamento orcamento){
        
        Desconto cadeiaDeDescontos = new DescontoMaisDeCinco(new DescontoMaiorQueQuinhentos(new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
    
}
