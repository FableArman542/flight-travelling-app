package com.es.esproj.dominio.servicos.servicosImpls;

import com.es.esproj.acessoadados.repositorios.IRepositorioCompanhias;
import com.es.esproj.dominio.entidades.Destaque;
import com.es.esproj.dominio.entidades.Destino;
import com.es.esproj.dominio.entidades.InfoCompanhia;
import com.es.esproj.dominio.entidades.chaves.DestinoPK;
import com.es.esproj.dominio.servicos.IServicoSistema;
import com.es.esproj.acessoadados.repositorios.IRepositorioDestaques;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ServicoSistema implements IServicoSistema {

    @Autowired
    IRepositorioDestaques repDestaques;

    @Autowired
    IRepositorioCompanhias repCompanhias;

    @Override
    public List<Destino> obterDestinosDestaque() {

        List<Destaque> destaques = repDestaques.obterDestinosDestaque();
        List<Destino> destinos = new ArrayList<>();

        // Dar sort aos destaques por prioridade
        Collections.sort(destaques, new Comparator<Destaque>() {
            @Override
            public int compare(Destaque d1, Destaque d2) {
                return d1.getPrioridade() - d2.getPrioridade();
            }
        });

        for (Destaque d: destaques) {
            destinos.add(new Destino(new DestinoPK(d.getPais(), d.getLocalidade())));
        }
        return destinos;
    }

    @Override
    public List<InfoCompanhia> obterInfoCompanhias() {
        return repCompanhias.obterInfoCompanhias();
    }

}
