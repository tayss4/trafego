package br.com.fiap.trafego.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ErrorController {
    public static String defaultErrorMsg() {
    	String retorno="<html>\\n" + "<header><title>Welcome</title></header>\n" + 
    			 "<body>\n" + "Suposto erro\n" + "</body>\n" + "</html>";
    	return retorno;
    }

}
