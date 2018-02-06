/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "Calc")
@Stateless()
public class Calc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

   

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sum")
    public int Sum(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int total = n1+n2;
        return total;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Resta")
    public int Resta(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        int total = n1-n2;
        return total;
    }

   
}
