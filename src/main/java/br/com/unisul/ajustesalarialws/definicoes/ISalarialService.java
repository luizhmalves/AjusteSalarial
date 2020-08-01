/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unisul.ajustesalarialws.definicoes;

import br.com.unisul.ajustesalarialws.request.AjusteSalarialRequest;
import br.com.unisul.ajustesalarialws.response.AjusteSalarialResponse;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Luiz
 */
@WebService
public interface ISalarialService {
    
    @WebMethod(operationName = "calcularAjusteSalarial")
    AjusteSalarialResponse CalcularAjusteSalarial(AjusteSalarialRequest request);
}
