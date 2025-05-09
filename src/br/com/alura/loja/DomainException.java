/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.loja;

/**
 *
 * @author estagiario
 */
public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public DomainException(String mensagem) {
        super(mensagem);
    }
}
