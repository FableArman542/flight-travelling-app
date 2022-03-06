package dominio.servicos;
import dominio.entidades.ListaDesejos;

import java.util.List;

public interface IServicoUtilizador {

    public List<ListaDesejos> obterListaDeDesejos(String utilizador);

}
