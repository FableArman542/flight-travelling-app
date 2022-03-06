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
public class DestinoPK implements Serializable {

    private String pais; // Pais
    private String localidade; // Codigo IATA

}
