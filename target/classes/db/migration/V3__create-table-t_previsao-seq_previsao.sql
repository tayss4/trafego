CREATE SEQUENCE SEQ_PREVISAO
  START WITH 1
  INCREMENT BY 1
  NOCACHE
  NOCYCLE;

CREATE TABLE T_PREVISAO (
    id_previsao INTEGER DEFAULT SEQ_PREVISAO.NEXTVAL NOT NULL,
    ds_hora TIMESTAMP,
    nr_carros TIMESTAMP,
    ds_melhor_alternativa BOOLEAN,
    id_cruzamento NUMBER(6),
    CONSTRAINT id_previsao_pk PRIMARY KEY (id_previsao),
    CONSTRAINT id_cruzamento_fk FOREIGN KEY (id_cruzamento) REFERENCES T_CRUZAMENTO (id_cruzamento)
);