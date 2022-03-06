package acessoadados.repositorio;
import dominio.entidades.ListaDesejos;
import java.util.List;

public interface IRepositorioListaDeDesejos {

    public List<ListaDesejos> obterListaDeDesejos(String nomeUtilizador);

}
