package br.com.fiap.trafego.service;

import br.com.fiap.trafego.model.HorarioPico;
import br.com.fiap.trafego.repository.HorarioPicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioPicoService {

    @Autowired
    HorarioPicoRepository horarioPicoRepository;

    public HorarioPico salvarHorarioPico(HorarioPico horarioPico){
        return horarioPicoRepository.save(horarioPico);
    }

    public HorarioPico buscarPorId(Long id){
        Optional<HorarioPico> horarioPicoOptional =
                horarioPicoRepository.findById(id);

        if (horarioPicoOptional.isPresent()){
            return horarioPicoOptional.get();
        } else {
            throw new RuntimeException("Horário de Pico não encontrado!");
        }
    }

    public List<HorarioPico> listarTodos(){
        return horarioPicoRepository.findAll();
    }

    public void excluir(Long id){
        Optional<HorarioPico> horarioPicoOptional =
                horarioPicoRepository.findById(id);

        if (horarioPicoOptional.isPresent()){
            horarioPicoRepository.delete(horarioPicoOptional.get());
        } else {
            throw new RuntimeException("Horário de Pico não encontrado!");
        }
    }

    public HorarioPico atualizar(HorarioPico horarioPico){
        Optional<HorarioPico> horarioPicoOptional =
                horarioPicoRepository.findById(horarioPico.getId());

        if (horarioPicoOptional.isPresent()){
            return horarioPicoRepository.save(horarioPico);
        } else {
            throw new RuntimeException("Horário de Pico não encontrado!");
        }
    }

}

