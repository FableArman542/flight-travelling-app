package acessoadados.repositorio.repositoriosImpl;

import acessoadados.repositorio.IRepositorioDestaques;
import dominio.entidades.Destaque;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDestaquesTeste implements IRepositorioDestaques {

    @Override
    public List<Destaque> obterDestinosDestaque() {

        List<Destaque> destaques = new ArrayList<>();
        destaques.add(new Destaque(0, "Inglaterra", "Londres"));
        destaques.add(new Destaque(1, "França", "Paris"));
        destaques.add(new Destaque(1, "Espanha", "Madrid"));

        return destaques;
    }
}
