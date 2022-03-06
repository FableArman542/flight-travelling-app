package acessoadados.repositorio.repositoriosImpl;

import acessoadados.repositorio.IRepositorioVoos;
import dominio.entidades.voos.InfoVoo;
import dominio.entidades.voos.Itenerario;
import dominio.entidades.voos.Segmento;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepositorioVoosTeste implements IRepositorioVoos {

    @Override
    public List<InfoVoo> obterVoos(InfoVoo infoVoo) {
        try{
            SimpleDateFormat fDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            List<InfoVoo> voos = new ArrayList<>();
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            List<Itenerario> itenerarios = new ArrayList<>();
            List<Segmento> segmentos = new ArrayList<>();
            segmentos.add(new Segmento(
                    "LIS",
                    "BCN",
                    fDate.parse("2022-04-01T10:00:00"),
                    fDate.parse("2022-04-01T11:00:00"),
                    1,
                    "TAP"
            ));
            segmentos.add(new Segmento(
                    "BCN",
                    "LIS",
                    fDate.parse("2022-05-01T10:00:00"),
                    fDate.parse("2022-05-01T11:00:00"),
                    1,
                    "TAP"
            ));
            itenerarios.add(new Itenerario(
                    2,
                    segmentos
            ));
            InfoVoo voo = new InfoVoo(
                    infoVoo.getDestinoChegada(),
                    infoVoo.getDestinoPartida(),
                    infoVoo.getDataPartida(),
                    infoVoo.getDataChegada(),
                    infoVoo.getAdultos(),
                    infoVoo.getCriancas(),
                    90,
                    itenerarios
            );

            voos.add(voo);

            return voos;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

}
