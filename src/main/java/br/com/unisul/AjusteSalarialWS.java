package br.com.unisul;

import br.com.unisul.ajustesalarialws.response.AjusteSalarialResponse;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Luiz
 */
@WebService(serviceName = "AjusteSalarialWS")
@Stateless()
public class AjusteSalarialWS{

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcularAjusteSalarial")
    public AjusteSalarialResponse calcularAjusteSalarial(
            @WebParam(name = "nomeFuncionario") String nomeFuncionario, 
            @WebParam(name = "salarioAtual") Double salarioAtual, 
            @WebParam(name = "percentualAumento") Double percentualAumento) {
        AjusteSalarialResponse response = new AjusteSalarialResponse();
        
        //CALCULANDO O PERCENTUAL DE AJUSTE
        
       Double ajusteSalario = ((salarioAtual / 100) * percentualAumento);
        
        //SOMA O AJUSTE MAIS O SALÁRIO ATUAL
       
        Double novoSalario = ajusteSalario + salarioAtual;
        
        response.setNomeFuncionario(nomeFuncionario);
        response.setPercentualAumentoRecebido(percentualAumento);
        response.setSalarioAjustado(novoSalario);
        response.setSalarioAnterior(salarioAtual);
        
        return response;
    }
}
