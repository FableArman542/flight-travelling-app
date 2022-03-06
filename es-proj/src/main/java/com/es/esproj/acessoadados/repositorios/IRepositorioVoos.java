package com.es.esproj.acessoadados.repositorios;

import com.es.esproj.dominio.entidades.voos.InfoVoo;

import java.util.List;

public interface IRepositorioVoos {

    public List<InfoVoo> obterVoos(InfoVoo infoVoo);

}
