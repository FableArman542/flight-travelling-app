package acessoadados.repositorio.repositoriosImpl;
import acessoadados.repositorio.IRepositorioListaDeDesejos;
import dominio.entidades.ListaDesejos;
import dominio.entidades.chaves.ListaDesejosPK;

import java.util.ArrayList;
import java.util.List;

public class RepositorioListaDeDesejosTeste implements IRepositorioListaDeDesejos {

    @Override
    public List<ListaDesejos> obterListaDeDesejos(String nomeUtilizador) {

        List<ListaDesejos> listaDesejos = new ArrayList<>();
        listaDesejos.add(new ListaDesejos(new ListaDesejosPK(nomeUtilizador, "Islândia", "Reykjavík")));
        listaDesejos.add(new ListaDesejos(new ListaDesejosPK(nomeUtilizador, "EUA", "Nova Iorque")));

        return listaDesejos;
    }
}
