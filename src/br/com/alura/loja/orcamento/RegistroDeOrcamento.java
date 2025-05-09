/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import java.util.Map;

/**
 *
 * @author estagiario
 */
public class RegistroDeOrcamento {
    
    private HttpAdapter http;
    
    public RegistroDeOrcamento(HttpAdapter http) {
        super();
        this.http = http;
    }
    
    public void registrar(Orcamento orcamento) {
        
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado");
        }
        
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens());
        
        http.post(url, dados);
    }
}
