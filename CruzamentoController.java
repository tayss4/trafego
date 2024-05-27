package br.com.fiap.trafego.controller;

import br.com.fiap.trafego.model.Cruzamento;
import br.com.fiap.trafego.service.CruzamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CruzamentoController {

    @Autowired
    private CruzamentoService cruzamentoService;

    @PostMapping("/cruzamentos")
    @ResponseStatus(HttpStatus.CREATED)
    public Cruzamento salvar(@RequestBody Cruzamento cruzamento){
        return cruzamentoService.salvarCruzamento(cruzamento);
    }

    @GetMapping("/cruzamentos")
    @ResponseStatus(HttpStatus.OK)
    public List<Cruzamento> listarTodos(){
        return cruzamentoService.listarTodos();
    }

    @GetMapping("/cruzamentos/{id}")
    public Cruzamento buscarPorId(@PathVariable Long id){
    	try {
    		Cruzamento cruzamento = cruzamentoService.buscarPorId(id);
    		return cruzamento;
    	} catch (Exception e) {
    		ErrorController.defaultErrorMsg();
    	}
        return cruzamentoService.buscarPorId(id);
    }

    @DeleteMapping("/cruzamentos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        cruzamentoService.excluir(id);
    }

    @PutMapping("/cruzamentos")
    @ResponseStatus(HttpStatus.OK)
    public Cruzamento atualizar(@RequestBody Cruzamento cruzamento){
        return cruzamentoService.atualizar(cruzamento);
    }
    
    @PutMapping("/error")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String errou() {
    	return ErrorController.defaultErrorMsg();
    }
    

}
