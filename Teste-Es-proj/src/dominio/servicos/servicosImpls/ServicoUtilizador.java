package dominio.servicos.servicosImpls;
import acessoadados.repositorio.IRepositorioListaDeDesejos;
import acessoadados.repositorio.repositoriosImpl.RepositorioListaDeDesejosTeste;
import dominio.entidades.ListaDesejos;
import dominio.servicos.IServicoUtilizador;

import java.util.List;

public class ServicoUtilizador implements IServicoUtilizador {


    private IRepositorioListaDeDesejos repListaDesejos;

    public ServicoUtilizador () {
        this.repListaDesejos = new RepositorioListaDeDesejosTeste();
    }

    @Override
    public List<ListaDesejos> obterListaDeDesejos(String utilizador) {
        return repListaDesejos.obterListaDeDesejos(utilizador);
    }
}
