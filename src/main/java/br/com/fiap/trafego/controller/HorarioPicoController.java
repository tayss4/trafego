package br.com.fiap.trafego.controller;

import br.com.fiap.trafego.model.HorarioPico;
import br.com.fiap.trafego.service.HorarioPicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HorarioPicoController {

    @Autowired
    private HorarioPicoService horarioPicoService;

    @PostMapping("/horariosPico")
    @ResponseStatus(HttpStatus.CREATED)
    public HorarioPico salvar(@RequestBody HorarioPico horarioPico){
        return horarioPicoService.salvarHorarioPico(horarioPico);
    }

    @GetMapping("/horariosPico")
    @ResponseStatus(HttpStatus.OK)
    public List<HorarioPico> listarTodos(){
        return horarioPicoService.listarTodos();
    }

    @GetMapping("/horariosPico/{id}")
    public HorarioPico buscarPorId(@PathVariable Long id){
        return horarioPicoService.buscarPorId(id);
    }

    @DeleteMapping("/horariosPico/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        horarioPicoService.excluir(id);
    }

    @PutMapping("/horariosPico")
    @ResponseStatus(HttpStatus.OK)
    public HorarioPico atualizar(@RequestBody HorarioPico horarioPico){
        return horarioPicoService.atualizar(horarioPico);
    }

}
