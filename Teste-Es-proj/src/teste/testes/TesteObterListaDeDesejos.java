package teste.testes;

import dominio.entidades.ListaDesejos;
import dominio.servicos.servicosImpls.ServicoUtilizador;

import java.util.List;

public class TesteObterListaDeDesejos {

    private ServicoUtilizador servicoUtilizador;

    public TesteObterListaDeDesejos(ServicoUtilizador servicoUtilizador) {
        this.servicoUtilizador = servicoUtilizador;
    }

    public boolean executarTeste() {
        String nomeUtilizador = "Utilizador Teste";
        List<ListaDesejos> listasDesejos = obterListaDeDesejos(nomeUtilizador);

        if (listasDesejos.size() == 2 &&
                listasDesejos.get(0).getListaDesejosPK().getNomeutilizador().equals(nomeUtilizador) &&
                listasDesejos.get(0).getListaDesejosPK().getPais().equals("Islândia") &&
                listasDesejos.get(0).getListaDesejosPK().getLocalidade().equals("Reykjavík") &&
                listasDesejos.get(1).getListaDesejosPK().getNomeutilizador().equals(nomeUtilizador) &&
                listasDesejos.get(1).getListaDesejosPK().getPais().equals("EUA") &&
                listasDesejos.get(1).getListaDesejosPK().getLocalidade().equals("Nova Iorque")) {
            return true;
        }
        return false;
    }

    public List<ListaDesejos> obterListaDeDesejos(String nomeUtilizador) {
        return servicoUtilizador.obterListaDeDesejos(nomeUtilizador);
    }
}
