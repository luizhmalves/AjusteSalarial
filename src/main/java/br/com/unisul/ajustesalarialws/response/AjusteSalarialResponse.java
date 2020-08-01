/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unisul.ajustesalarialws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luiz
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AjusteSalarialResponse {
    
    private String nomeFuncionario;
    
    private Double salarioAnterior;
    
    private Double salarioAjustado;
    
    
}
