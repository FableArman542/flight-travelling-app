package dominio.servicos.servicosImpls;
import acessoadados.repositorio.IRepositorioVoos;
import acessoadados.repositorio.repositoriosImpl.RepositorioVoosTeste;
import dominio.entidades.voos.InfoVoo;
import dominio.servicos.IServicoVoos;

import java.util.List;

public class ServicoVoos implements IServicoVoos {

    private final IRepositorioVoos repVoos;

    public ServicoVoos() {
        this.repVoos = new RepositorioVoosTeste();
    }

    @Override
    public List<InfoVoo> obterVoos(InfoVoo infoVoo) {
        return repVoos.obterVoos(infoVoo);
    }
}
