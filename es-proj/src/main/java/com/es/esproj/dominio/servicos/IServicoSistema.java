package com.es.esproj.dominio.servicos;

import com.es.esproj.dominio.entidades.Destino;
import com.es.esproj.dominio.entidades.InfoCompanhia;

import java.util.List;

public interface IServicoSistema {

    public List<Destino> obterDestinosDestaque();

    public List<InfoCompanhia> obterInfoCompanhias();

}
