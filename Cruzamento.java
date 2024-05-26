package br.com.fiap.trafego.model;


import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name ="T_CRUZAMENTO")
public class Cruzamento {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_CRUZAMENTO")
    @SequenceGenerator(
            name = "SEQ_CRUZAMENTO",
            sequenceName = "SEQ_CRUZAMENTO")
    @Column(name ="id_cruzamento")
    private Long id;

    @Column(name ="ds_logradouro_1")
    private String logradouro1;

    @Column(name ="ds_logradouro_2")
    private String logradouro2;

    public String getLogradouro1() {
        return logradouro1;
    }

    public void setLogradouro1(String logradouro1) {
        this.logradouro1 = logradouro1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro2() {
        return logradouro2;
    }

    public void setLogradouro2(String logradouro2) {
        this.logradouro2 = logradouro2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cruzamento that = (Cruzamento) o;
        return Objects.equals(id, that.id) && Objects.equals(logradouro1, that.logradouro1) && Objects.equals(logradouro2, that.logradouro2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logradouro1, logradouro2);
    }

}