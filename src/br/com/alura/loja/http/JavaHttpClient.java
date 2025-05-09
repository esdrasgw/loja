/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 *
 * @author estagiario
 */
public class JavaHttpClient implements HttpAdapter {
    
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
        }
    }
}
