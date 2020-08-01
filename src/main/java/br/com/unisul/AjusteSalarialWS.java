/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unisul;

import br.com.unisul.ajustesalarialws.definicoes.ISalarialService;
import br.com.unisul.ajustesalarialws.request.AjusteSalarialRequest;
import br.com.unisul.ajustesalarialws.response.AjusteSalarialResponse;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Luiz
 */
@WebService(serviceName = "AjusteSalarialWS", endpointInterface = "br.com.unisul.ajustesalarialws.definicoes.ISalarialService")
@Stateless()
public class AjusteSalarialWS implements ISalarialService{
    
    
    @Override
    public AjusteSalarialResponse CalcularAjusteSalarial(AjusteSalarialRequest request) {
        
        AjusteSalarialResponse response = new AjusteSalarialResponse();
        
        //CALCULANDO O PERCENTUAL DE AJUSTE
        
        Double ajusteSalario = ((request.getSalarioAtual() / 100) * request.getPercentualAumento());
        
        //SOMA O AJUSTE MAIS O SALÁRIO ATUAL
        
        Double novoSalario = ajusteSalario + request.getSalarioAtual();
        
        response.setNomeFuncionario(request.getNomeFuncionario());
        response.setPercentualAumentoRecebido(request.getPercentualAumento());
        response.setSalarioAjustado(novoSalario);
        response.setSalarioAnterior(request.getSalarioAtual());
        
        return response;
        
    }
}
