package com.taskme.gv.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "personalinstance")
public class PersonalInstance {

    private String titulo;
    private String subtitulo;
    private String descricaoInicial;
    private String descricaoCompleta;

}
