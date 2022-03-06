package com.es.esproj.fachada.controladores;

import com.es.esproj.dominio.entidades.voos.InfoVoo;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface IControladorVoos {

    /**
     * Obtencao de voos
     * @param infoVoo - informacao de pesquisa de voo
     * @return - Lista de voos
     */
    public ResponseEntity<List<InfoVoo>> obterVoos(InfoVoo infoVoo);

}
