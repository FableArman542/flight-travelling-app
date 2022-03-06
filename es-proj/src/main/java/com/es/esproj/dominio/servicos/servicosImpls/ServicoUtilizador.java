package com.es.esproj.dominio.servicos.servicosImpls;

import com.es.esproj.acessoadados.repositorios.IRepositorioListaDeDesejos;
import com.es.esproj.dominio.entidades.ListaDesejos;
import com.es.esproj.dominio.servicos.IServicoUtilizador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoUtilizador implements IServicoUtilizador {

    @Autowired
    private IRepositorioListaDeDesejos repListaDesejos;

    @Override
    public List<ListaDesejos> obterListaDeDesejos(String utilizador) {
        return repListaDesejos.obterListaDeDesejos(utilizador);
    }
}
