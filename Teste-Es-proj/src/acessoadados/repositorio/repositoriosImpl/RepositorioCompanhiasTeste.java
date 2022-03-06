package acessoadados.repositorio.repositoriosImpl;

import acessoadados.repositorio.IRepositorioCompanhias;
import dominio.entidades.InfoCompanhia;
import dominio.entidades.chaves.InfoCompanhiaPK;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCompanhiasTeste implements IRepositorioCompanhias {

    @Override
    public List<InfoCompanhia> obterInfoCompanhias() {

        List<InfoCompanhia> informacoes = new ArrayList<>();
        informacoes.add(new InfoCompanhia(new InfoCompanhiaPK("Ryanair", "Proibidas malas acima de 15kg")));
        informacoes.add(new InfoCompanhia(new InfoCompanhiaPK("Wizz Air", "Restrições Covid-19 levantadas")));

        return informacoes;
    }
}
