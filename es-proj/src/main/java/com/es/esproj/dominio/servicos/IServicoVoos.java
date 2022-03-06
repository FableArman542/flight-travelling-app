package com.es.esproj.dominio.servicos;

import com.es.esproj.dominio.entidades.voos.InfoVoo;

import java.util.List;

public interface IServicoVoos {

    public List<InfoVoo> obterVoos(InfoVoo infoVoo);

}
