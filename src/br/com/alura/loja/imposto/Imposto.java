/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author estagiario
 */
public abstract class Imposto {
    
    private Imposto outro;
    
    public Imposto(Imposto outro) {
        this.outro = outro;
    }
    
    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
    
    public BigDecimal calcular (Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
        
        if (outro != null) {
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }
        
        return valorImposto.add(valorDoOutroImposto);
    } 
}
