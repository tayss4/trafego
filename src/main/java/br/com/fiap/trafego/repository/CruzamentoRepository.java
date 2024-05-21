package br.com.fiap.trafego.repository;

import br.com.fiap.trafego.model.Cruzamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruzamentoRepository extends JpaRepository<Cruzamento, Long> {
}
