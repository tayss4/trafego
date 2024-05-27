package br.com.fiap.trafego.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.trafego.model.Cruzamento;

@Repository
public interface CruzamentoRepository extends JpaRepository<Cruzamento, Long> {
}
