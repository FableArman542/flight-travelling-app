package com.es.esproj.dominio.servicos.servicosImpls;

import com.es.esproj.dominio.entidades.voos.InfoVoo;
import com.es.esproj.dominio.servicos.IServicoVoos;
import com.es.esproj.acessoadados.repositorios.repositoriosImpl.RepositorioVoos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoVoos implements IServicoVoos {

    private final RepositorioVoos repVoos;

    public ServicoVoos() {
        this.repVoos = new RepositorioVoos();
    }

    @Override
    public List<InfoVoo> obterVoos(InfoVoo infoVoo) {
        return repVoos.obterVoos(infoVoo);
    }
}
