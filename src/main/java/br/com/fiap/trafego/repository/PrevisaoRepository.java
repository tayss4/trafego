package br.com.fiap.trafego.repository;

import br.com.fiap.trafego.model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {
}
