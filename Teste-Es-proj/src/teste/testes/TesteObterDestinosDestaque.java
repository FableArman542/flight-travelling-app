package teste.testes;

import dominio.entidades.Destino;
import dominio.servicos.servicosImpls.ServicoSistema;

import java.util.List;

public class TesteObterDestinosDestaque {

    private ServicoSistema servicoSistema;

    public TesteObterDestinosDestaque(ServicoSistema servicoSistema) {
        this.servicoSistema = servicoSistema;
    }

    public boolean executarTeste() {
        List<Destino> destinos = obterDestinosDestaque();
        if (    destinos.size() == 3 &&
                destinos.get(0).getDestinoPK().getPais().equals("Inglaterra") &&
                destinos.get(0).getDestinoPK().getLocalidade().equals("Londres") &&
                destinos.get(1).getDestinoPK().getPais().equals("França") &&
                destinos.get(1).getDestinoPK().getLocalidade().equals("Paris") &&
                destinos.get(2).getDestinoPK().getPais().equals("Espanha") &&
                destinos.get(2).getDestinoPK().getLocalidade().equals("Madrid")) {
            return true;
        }
        return false;
    }

    public List<Destino> obterDestinosDestaque() {
        return servicoSistema.obterDestinosDestaque();
    }
}
