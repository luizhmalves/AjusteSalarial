/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unisul.ajustesalarialws.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luiz
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AjusteSalarialRequest {
    
    private String nomeFuncionario;
    
    private Double salarioAtual;
    
    private Double percentualAumento;

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(Double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public Double getPercentualAumento() {
        return percentualAumento;
    }

    public void setPercentualAumento(Double percentualAumento) {
        this.percentualAumento = percentualAumento;
    }
    
    
}
