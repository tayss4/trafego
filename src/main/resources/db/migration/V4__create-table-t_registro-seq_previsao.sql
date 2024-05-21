CREATE SEQUENCE SEQ_REGISTRO
  START WITH 1
  INCREMENT BY 1
  NOCACHE
  NOCYCLE;

CREATE TABLE T_REGISTRO (
    id_registro INTEGER DEFAULT SEQ_REGISTRO.NEXTVAL NOT NULL,
    dt_hora_abertura TIMESTAMP,
    dt_hora_fechamento TIMESTAMP,
    nr_carros NUMBER(6),
    id_cruzamento NUMBER(6),
    CONSTRAINT id_registro_pk PRIMARY KEY (id_registro),
    CONSTRAINT id_cruzamento_fk FOREIGN KEY (id_cruzamento) REFERENCES T_CRUZAMENTO (id_cruzamento)
);