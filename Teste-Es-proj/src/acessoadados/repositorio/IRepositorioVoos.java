package acessoadados.repositorio;
import dominio.entidades.voos.InfoVoo;

import java.util.List;

public interface IRepositorioVoos {

    public List<InfoVoo> obterVoos(InfoVoo infoVoo);

}
