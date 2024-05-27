package br.com.fiap.trafego.controller;

import br.com.fiap.trafego.model.Previsao;
import br.com.fiap.trafego.service.PrevisaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrevisaoController {

    @Autowired
    private PrevisaoService previsaoService;

    @PostMapping("/previsoes")
    @ResponseStatus(HttpStatus.CREATED)
    public Previsao salvar(@RequestBody Previsao previsao){
        return previsaoService.salvarPrevisao(previsao);
    }

    @GetMapping("/previsoes")
    @ResponseStatus(HttpStatus.OK)
    public List<Previsao> listarTodos(){
        return previsaoService.listarTodos();
    }

    @GetMapping("/previsoes/{id}")
    public Previsao buscarPorId(@PathVariable Long id){
        return previsaoService.buscarPorId(id);
    }

    @DeleteMapping("/previsoes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        previsaoService.excluir(id);
    }

    @PutMapping("/previsoes")
    @ResponseStatus(HttpStatus.OK)
    public Previsao atualizar(@RequestBody Previsao previsao){
        return previsaoService.atualizar(previsao);
    }

}
