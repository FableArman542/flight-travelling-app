package com.es.esproj.dominio.entidades;
import com.es.esproj.dominio.entidades.chaves.DestinoPK;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="destino")
public class Destino {

    @EmbeddedId
    private DestinoPK destinoPK;

}
