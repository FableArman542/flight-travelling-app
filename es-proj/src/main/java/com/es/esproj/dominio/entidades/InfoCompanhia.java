package com.es.esproj.dominio.entidades;
import com.es.esproj.dominio.entidades.chaves.InfoCompanhiaPK;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "infocompanhias")
public class InfoCompanhia {

    @EmbeddedId
    private InfoCompanhiaPK infoCompanhiaPK;

}
