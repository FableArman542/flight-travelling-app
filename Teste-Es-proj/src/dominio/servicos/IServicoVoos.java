package dominio.servicos;
import dominio.entidades.voos.InfoVoo;

import java.util.List;

public interface IServicoVoos {

    public List<InfoVoo> obterVoos(InfoVoo infoVoo);

}
