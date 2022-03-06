package dominio.servicos;
import dominio.entidades.Destino;
import dominio.entidades.InfoCompanhia;
import java.util.List;

public interface IServicoSistema {

    public List<Destino> obterDestinosDestaque();

    public List<InfoCompanhia> obterInfoCompanhias();

}
