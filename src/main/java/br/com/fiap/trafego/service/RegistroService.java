package br.com.fiap.trafego.service;

import br.com.fiap.trafego.model.Registro;
import br.com.fiap.trafego.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    public Registro salvarRegistro(Registro registro){
        return registroRepository.save(registro);
    }

    public Registro buscarPorId(Long id){
        Optional<Registro> registroOptional =
                registroRepository.findById(id);

        if (registroOptional.isPresent()){
            return registroOptional.get();
        } else {
            throw new RuntimeException("Registro não encontrado!");
        }
    }

    public List<Registro> listarTodos(){
        return registroRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Registro> registroOptional =
                registroRepository.findById(id);

        if (registroOptional.isPresent()){
            registroRepository.delete(registroOptional.get());
        } else {
            throw new RuntimeException("Registro não encontrado!");
        }
    }

    public Registro atualizar(Registro registro){
        Optional<Registro> registroOptional =
                registroRepository.findById(registro.getId());

        if (registroOptional.isPresent()){
            return registroRepository.save(registro);
        } else {
            throw new RuntimeException("Registro não encontrado!");
        }
    }

}

