import React, { useState, useEffect } from "react";
import InfoVooDTO from "../dto/InfoVooDTO";
import ItenerarioDTO from "../dto/ItenerarioDTO";
import SegmentoDTO from "../dto/SegmentoDTO";
import DestinoDTO from "../dto/DestinoDTO";
import DestinoPKDTO from "../dto/chaves/DestinoPKDTO";
import VistaVoos from "../vistas/vistaVoos";

const ControladorVoos = (controladorPrincipal) => {

    const [voos, setVoos] = useState([]);

    // Detetar mudancas no estado das informacoes de voo
    useEffect(
        () => {
            obterVoos();
        },[controladorPrincipal.controladorPrincipal]
    );

    // Obter voos do backend
    function obterVoos () {
        let infoVoo = controladorPrincipal.controladorPrincipal;

        (async() => {
            const url = 'http://localhost:8080/voos/obter-voos';
            const response = await fetch(url, {
                method: 'POST',
                headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
                },
                body: JSON.stringify(infoVoo)
            });
            console.log(response.status);
            if (response.status == 200) {

                const data = await response.json();

                // Mapear resposta JSON em objetos
                let infos = []
                for (const [key, value] of Object.entries(data)) {
                    let itenerarios = [];

                    for (let i = 0; i < value.itenerarios.length; ++i) {
                        let segmentos = []
                        for (let j = 0; j < value.itenerarios[i].segmentos.length; ++j) {
                            segmentos.push(new SegmentoDTO(value.itenerarios[i].segmentos[j].destinoPartida,
                                        value.itenerarios[i].segmentos[j].destinoChegada,
                                        value.itenerarios[i].segmentos[j].dataPartida,
                                        value.itenerarios[i].segmentos[j].dataChegada,
                                        value.itenerarios[i].segmentos[j].duracao,
                                        value.itenerarios[i].segmentos[j].companhia));
                        }
                        itenerarios.push(new ItenerarioDTO(value.itenerarios[i].duracao, segmentos));
                    }

                    let infoRetornada = new InfoVooDTO(new DestinoDTO(new DestinoPKDTO(value.destinoChegada.destinoPK.pais, value.destinoChegada.destinoPK.localidade)),
                                                    new DestinoDTO(new DestinoPKDTO(value.destinoPartida.destinoPK.pais, value.destinoPartida.destinoPK.localidade)),
                                                    value.dataPartida, value.dataChegada,
                                                    value.adultos, value.criancas,
                                                    value.preco,
                                                    itenerarios);
                    infos.push(infoRetornada);
                }
                setVoos(infos);
                console.log(infos);
            }
        })();
        
        return // Voos
    }

    return (
        <div>
            <VistaVoos controlador={ voos }/>
        </div>
    );

}


export default ControladorVoos;