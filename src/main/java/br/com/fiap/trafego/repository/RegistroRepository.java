package br.com.fiap.trafego.repository;

import br.com.fiap.trafego.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
}
