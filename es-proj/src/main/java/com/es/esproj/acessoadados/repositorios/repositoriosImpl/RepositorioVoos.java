package com.es.esproj.acessoadados.repositorios.repositoriosImpl;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.es.esproj.dominio.entidades.voos.InfoVoo;
import com.es.esproj.dominio.entidades.voos.Itenerario;
import com.es.esproj.dominio.entidades.voos.Segmento;
import com.es.esproj.external.AmadeusConnect;
import com.es.esproj.acessoadados.repositorios.IRepositorioVoos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class RepositorioVoos implements IRepositorioVoos {

    @Override
    public List<InfoVoo> obterVoos(InfoVoo infoVoo) {
        try {
            SimpleDateFormat fDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            List<InfoVoo> voos = new ArrayList<>();

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            FlightOfferSearch f[] = AmadeusConnect.INSTANCE.flights(infoVoo.getDestinoPartida().getDestinoPK().getLocalidade(),
                    infoVoo.getDestinoChegada().getDestinoPK().getLocalidade(),
                    formatter.format(infoVoo.getDataPartida()),
                    String.valueOf(infoVoo.getAdultos()),
                    formatter.format(infoVoo.getDataChegada()));

            for (int i = 0; i < f.length; ++i) {

                List<Itenerario> itenerarios = new ArrayList<>();
                for (int j = 0; j < f[i].getItineraries().length; ++j) {
                    List<Segmento> segmentos = new ArrayList<>();
                    for (int k = 0; k < f[i].getItineraries()[j].getSegments().length; ++ k) {
                        segmentos.add(new Segmento(
                                f[i].getItineraries()[j].getSegments()[k].getDeparture().getIataCode(),
                                f[i].getItineraries()[j].getSegments()[k].getArrival().getIataCode(),
                                fDate.parse(f[i].getItineraries()[j].getSegments()[k].getDeparture().getAt()),
                                fDate.parse(f[i].getItineraries()[j].getSegments()[k].getArrival().getAt()),
                                1,//f[i].getItineraries()[j].getSegments()[k].getDuration()
                                f[i].getItineraries()[j].getSegments()[k].getCarrierCode()
                        ));
                    }
                    itenerarios.add(new Itenerario(
                            1,//f[i].getItineraries()[j].getDuration(),
                            segmentos
                    ));
                }

                InfoVoo voo = new InfoVoo(
                        infoVoo.getDestinoChegada(),
                        infoVoo.getDestinoPartida(),
                        infoVoo.getDataPartida(),
                        infoVoo.getDataChegada(),
                        infoVoo.getAdultos(),
                        infoVoo.getCriancas(),
                        (float)f[i].getPrice().getTotal(),
                        itenerarios
                );
                voos.add(voo);
            }

            return voos;

        } catch (ResponseException | ParseException e) { e.printStackTrace(); }


        return null;
    }

}
