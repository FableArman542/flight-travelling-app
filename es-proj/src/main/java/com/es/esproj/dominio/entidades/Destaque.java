package com.es.esproj.dominio.entidades;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "destaques")
public class Destaque {

    @Id
    private Integer prioridade;

    @Column(name="pais_d")
    private String pais;

    @Column(name="localidade_d")
    private String localidade;

}
