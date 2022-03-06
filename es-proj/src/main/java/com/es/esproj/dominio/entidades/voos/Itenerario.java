package com.es.esproj.dominio.entidades.voos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Itenerario {

    private int duracao;
    private List<Segmento> segmentos;

}
