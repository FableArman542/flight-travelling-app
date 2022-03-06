package com.es.esproj.dominio.entidades;
import com.es.esproj.dominio.entidades.chaves.ListaDesejosPK;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "listadesejos")
public class ListaDesejos {

    @EmbeddedId
    private ListaDesejosPK listaDesejosPK;

}
