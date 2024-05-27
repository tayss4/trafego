package br.com.fiap.trafego.controller;

import br.com.fiap.trafego.model.Registro;
import br.com.fiap.trafego.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @PostMapping("/registros")
    @ResponseStatus(HttpStatus.CREATED)
    public Registro salvar(@RequestBody Registro registro){
        return registroService.salvarRegistro(registro);
    }

    @GetMapping("/registros")
    @ResponseStatus(HttpStatus.OK)
    public List<Registro> listarTodos(){
        return registroService.listarTodos();
    }

    @GetMapping("/registros/{id}")
    public Registro buscarPorId(@PathVariable Long id){
        return registroService.buscarPorId(id);
    }

    @DeleteMapping("/registros/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        registroService.excluir(id);
    }

    @PutMapping("/registros")
    @ResponseStatus(HttpStatus.OK)
    public Registro atualizar(@RequestBody Registro registro){
        return registroService.atualizar(registro);
    }

}
