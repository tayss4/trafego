package br.com.fiap.trafego.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name ="T_HORARIO_PICO")
public class HorarioPico {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_HORARIO_PICO")
    @SequenceGenerator(
            name = "SEQ_HORARIO_PICO",
            sequenceName = "SEQ_HORARIO_PICO")
    @Column(name ="id_pico")
    private Long id;

    @Column(name ="ds_hora_inicio")
    private LocalTime horaInicio;

    @Column(name ="ds_hora_termino")
    private LocalTime horaTermino;

    @ManyToOne
    @JoinColumn(name ="id_cruzamento")
    private Cruzamento cruzamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(LocalTime horaTermino) {
        this.horaTermino = horaTermino;
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
        HorarioPico that = (HorarioPico) o;
        return Objects.equals(id, that.id) && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(horaTermino, that.horaTermino) && Objects.equals(cruzamento, that.cruzamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, horaInicio, horaTermino, cruzamento);
    }

}
