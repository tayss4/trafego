package br.com.fiap.trafego;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.fiap.trafego.repository.CruzamentoRepository;
import br.com.fiap.trafego.repository.HorarioPicoRepository;
import br.com.fiap.trafego.repository.PrevisaoRepository;
import br.com.fiap.trafego.repository.RegistroRepository;

@SpringBootApplication
public class TrafegoApplication {
	
	@Autowired
	private  CruzamentoRepository cruzamentoRepository;
	
	@Autowired
	private  HorarioPicoRepository horarioPicoRepository;
	
	@Autowired
	private  PrevisaoRepository previsaoRepository;
	
	@Autowired
	private  RegistroRepository registroRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrafegoApplication.class, args);
	}

}
