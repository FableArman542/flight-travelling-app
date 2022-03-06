package teste.testes;

import dominio.entidades.InfoCompanhia;
import dominio.servicos.servicosImpls.ServicoSistema;

import java.util.List;

public class TesteObterInfoCompanhias {

    private ServicoSistema servicoSistema;

    public TesteObterInfoCompanhias (ServicoSistema servicoSistema) {
        this.servicoSistema = servicoSistema;
    }

    public boolean executarTeste() {
        List<InfoCompanhia> infoCompanhias = obterInfoCompanhias();
        if (    infoCompanhias.size() == 2 &&
                infoCompanhias.get(0).getInfoCompanhiaPK().getCompanhia().equals("Ryanair") &&
                infoCompanhias.get(0).getInfoCompanhiaPK().getInformacao().equals("Proibidas malas acima de 15kg") &&
                infoCompanhias.get(1).getInfoCompanhiaPK().getCompanhia().equals("Wizz Air") &&
                infoCompanhias.get(1).getInfoCompanhiaPK().getInformacao().equals("Restrições Covid-19 levantadas")) {
            return true;
        }
        return false;
    }

    public List<InfoCompanhia> obterInfoCompanhias() {
        return servicoSistema.obterInfoCompanhias();
    }
}
