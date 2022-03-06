package com.es.esproj.fachada.controladores;

import com.es.esproj.dominio.entidades.Destino;
import com.es.esproj.dominio.entidades.InfoCompanhia;
import com.es.esproj.dominio.entidades.ListaDesejos;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IControladorSistema {

    /**
     * Obtencao dos destinos de destaque da aplicacao
     *
     * @return - Lista de destinos
     */
    public ResponseEntity<List<Destino>> obterDestinosDestaque();


    /**
     * Obtencao da lista de desjospara um utilizador
     *
     * @param utilizador
     * @return
     */
    public ResponseEntity<List<ListaDesejos>> obterListaDesejos(String utilizador);

    /**
     * Obtencao da lista de informacoes de companhias
     *
     * @return
     */
    public ResponseEntity<List<InfoCompanhia>> obterInfoCompanhias();

}
