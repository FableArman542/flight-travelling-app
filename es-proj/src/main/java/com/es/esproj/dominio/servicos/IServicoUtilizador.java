package com.es.esproj.dominio.servicos;

import com.es.esproj.dominio.entidades.ListaDesejos;

import java.util.List;

public interface IServicoUtilizador {

    public List<ListaDesejos> obterListaDeDesejos(String utilizador);

}
