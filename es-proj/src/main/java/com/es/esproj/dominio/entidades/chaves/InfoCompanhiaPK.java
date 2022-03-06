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
public class InfoCompanhiaPK implements Serializable {

    private String companhia;
    private String informacao;

}
