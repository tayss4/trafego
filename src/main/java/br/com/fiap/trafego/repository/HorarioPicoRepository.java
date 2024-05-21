package br.com.fiap.trafego.repository;

import br.com.fiap.trafego.model.HorarioPico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioPicoRepository extends JpaRepository<HorarioPico, Long> {
}
