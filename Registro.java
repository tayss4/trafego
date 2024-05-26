package br.com.fiap.trafego.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name ="T_REGISTRO")
public class Registro {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_REGISTRO")
    @SequenceGenerator(
            name = "SEQ_REGISTRO",
            sequenceName = "SEQ_REGISTRO")
    @Column(name ="id_registro")
    private Long id;

    @Column(name ="dt_hora_abertura")
    private LocalTime horaAbertura;

    @Column(name ="dt_hora_fechamento")
    private LocalTime horaFechamento;

    @Column(name ="nr_carros")
    private int numeroCarros;

    @ManyToOne
    @JoinColumn(name ="id_cruzamento")
    private Cruzamento cruzamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(LocalTime horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public LocalTime getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(LocalTime horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public int getNumeroCarros() {
        return numeroCarros;
    }

    public void setNumeroCarros(int numeroCarros) {
        this.numeroCarros = numeroCarros;
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
        Registro registro = (Registro) o;
        return numeroCarros == registro.numeroCarros && Objects.equals(id, registro.id) && Objects.equals(horaAbertura, registro.horaAbertura) && Objects.equals(horaFechamento, registro.horaFechamento) && Objects.equals(cruzamento, registro.cruzamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, horaAbertura, horaFechamento, numeroCarros, cruzamento);
    }

}
