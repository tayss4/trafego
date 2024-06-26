package br.com.fiap.trafego.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.trafego.model.Cruzamento;
import br.com.fiap.trafego.repository.CruzamentoRepository;

@Service
public class CruzamentoService {

    @Autowired
    CruzamentoRepository cruzamentoRepository;

    public Cruzamento salvarCruzamento(Cruzamento cruzamento){
        return cruzamentoRepository.save(cruzamento);
    }

    public Cruzamento buscarPorId(Long id){
        Optional<Cruzamento> cruzamentoOptional =
                cruzamentoRepository.findById(id);
        
	        if (cruzamentoOptional.isPresent()) return cruzamentoOptional.get();
	            
	      return null;
    }

    public List<Cruzamento> listarTodos(){
        return cruzamentoRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Cruzamento> cruzamentoOptional =
                cruzamentoRepository.findById(id);

        if (cruzamentoOptional.isPresent()){
            cruzamentoRepository.delete(cruzamentoOptional.get());
        } else {
            throw new RuntimeException("Cruzamento não encontrado!");
        }
    }

    public Cruzamento atualizar(Cruzamento cruzamento){
        Optional<Cruzamento> cruzamentoOptional =
                cruzamentoRepository.findById(cruzamento.getId());

        if (cruzamentoOptional.isPresent()){
            return cruzamentoRepository.save(cruzamento);
        } else {
            throw new RuntimeException("Cruzamento não encontrado!");
        }
    }
    
    
}
