package com.es.esproj.dominio.entidades.chaves;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class ListaDesejosPK implements Serializable {

    private String nomeutilizador;
    private String pais;
    private String localidade;

}
