/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.http;

import java.util.Map;

/**
 *
 * @author estagiario
 */
public interface HttpAdapter {
    
    void post(String url, Map<String, Object> dados);
    
}
