package br.com.fiap.trafego.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name ="T_PREVISAO")
public class Previsao {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_PREVISAO")
    @SequenceGenerator(
            name = "SEQ_PREVISAO",
            sequenceName = "SEQ_PREVISAO")
    @Column(name ="id_previsao")
    private Long id;

    @Column(name ="ds_hora")
    private LocalTime hora;

    @Column(name ="nr_carros")
    private int numeroCarros;

    @Column(name ="ds_melhor_alternativa")
    private boolean melhorAlternativa;

    @ManyToOne
    @JoinColumn(name ="id_cruzamento")
    private Cruzamento cruzamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getNumeroCarros() {
        return numeroCarros;
    }

    public void setNumeroCarros(int numeroCarros) {
        this.numeroCarros = numeroCarros;
    }

    public boolean isMelhorAlternativa() {
        return melhorAlternativa;
    }

    public void setMelhorAlternativa(boolean melhorAlternativa) {
        this.melhorAlternativa = melhorAlternativa;
    }

    public Cruzamento getCruzamento() {
        return cruzamento;
    }

    public void setCruzamento(Cruzamento cruzamento) {
        this.cruzamento = cruzamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Previsao previsao = (Previsao) o;
        return numeroCarros == previsao.numeroCarros && melhorAlternativa == previsao.melhorAlternativa && Objects.equals(id, previsao.id) && Objects.equals(hora, previsao.hora) && Objects.equals(cruzamento, previsao.cruzamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hora, numeroCarros, melhorAlternativa, cruzamento);
    }

}
