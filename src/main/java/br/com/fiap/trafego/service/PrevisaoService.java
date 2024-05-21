package br.com.fiap.trafego.service;

import br.com.fiap.trafego.model.Previsao;
import br.com.fiap.trafego.repository.PrevisaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrevisaoService {

    @Autowired
    private PrevisaoRepository previsaoRepository;

    public Previsao salvarPrevisao(Previsao previsao){
        return previsaoRepository.save(previsao);
    }

    public Previsao buscarPorId(Long id){
        Optional<Previsao> previsaoOptional =
                previsaoRepository.findById(id);

        if (previsaoOptional.isPresent()){
            return previsaoOptional.get();
        } else {
            throw new RuntimeException("Previsão não encontrada!");
        }
    }

    public List<Previsao> listarTodos(){
        return previsaoRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Previsao> previsaoOptional =
                previsaoRepository.findById(id);

        if (previsaoOptional.isPresent()){
            previsaoRepository.delete(previsaoOptional.get());
        } else {
            throw new RuntimeException("Previsão não encontrada!");
        }
    }

    public Previsao atualizar(Previsao previsao){
        Optional<Previsao> previsaoOptional =
                previsaoRepository.findById(previsao.getId());

        if (previsaoOptional.isPresent()){
            return previsaoRepository.save(previsao);
        } else {
            throw new RuntimeException("Previsão não encontrada!");
        }
    }

}
