package br.com.fiap.trafego.repository;

import br.com.fiap.trafego.model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {
}
