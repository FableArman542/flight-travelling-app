package dominio.servicos.servicosImpls;
import acessoadados.repositorio.IRepositorioCompanhias;
import acessoadados.repositorio.IRepositorioDestaques;
import acessoadados.repositorio.repositoriosImpl.RepositorioCompanhiasTeste;
import acessoadados.repositorio.repositoriosImpl.RepositorioDestaquesTeste;
import dominio.entidades.Destaque;
import dominio.entidades.Destino;
import dominio.entidades.InfoCompanhia;
import dominio.entidades.chaves.DestinoPK;
import dominio.servicos.IServicoSistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ServicoSistema implements IServicoSistema {

    private IRepositorioDestaques repDestaques;
    private IRepositorioCompanhias repCompanhias;

    public ServicoSistema() {
        this.repDestaques = new RepositorioDestaquesTeste();
        this.repCompanhias = new RepositorioCompanhiasTeste();
    }

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
