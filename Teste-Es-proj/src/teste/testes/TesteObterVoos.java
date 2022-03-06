package teste.testes;

import dominio.entidades.Destino;
import dominio.entidades.chaves.DestinoPK;
import dominio.entidades.voos.InfoVoo;
import dominio.servicos.servicosImpls.ServicoVoos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TesteObterVoos {

    private ServicoVoos servicoVoos;

    public TesteObterVoos(ServicoVoos servicoVoos) {
        this.servicoVoos = servicoVoos;
    }

    public boolean executarTeste() {
        try {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            InfoVoo infoVoo = new InfoVoo();
            Destino destinoChegada = new Destino(new DestinoPK("Espanha", "BCN"));
            Destino destinoPartida = new Destino(new DestinoPK("Portugal", "LIS"));
            infoVoo.setDestinoChegada(destinoChegada);
            infoVoo.setDestinoPartida(destinoPartida);
            Date dataPartida = formatter.parse("2022-04-01");
            Date dataChegada = formatter.parse("2022-05-01");
            infoVoo.setDataPartida(dataPartida);
            infoVoo.setDataChegada(dataChegada);
            infoVoo.setAdultos(1);
            infoVoo.setCriancas(0);

            List<InfoVoo> voos = obterVoos(infoVoo);
            if (voos.size() == 1 &&
                    voos.get(0).getDestinoChegada().equals(destinoChegada) &&
                    voos.get(0).getDestinoPartida().equals(destinoPartida) &&
                    voos.get(0).getDataPartida().equals(dataPartida) &&
                    voos.get(0).getDataChegada().equals(dataChegada) &&
                    voos.get(0).getAdultos() == 1 &&
                    voos.get(0).getCriancas() == 0 &&
                    voos.get(0).getPreco() == 90 &&
                    voos.get(0).getItenerarios().size() == 1 &&
                    voos.get(0).getItenerarios().get(0).getDuracao() == 2 &&
                    voos.get(0).getItenerarios().get(0).getSegmentos().size() == 2) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public List<InfoVoo> obterVoos(InfoVoo infoVoo) {
        return servicoVoos.obterVoos(infoVoo);
    }
}
