import VistaDestaques from "../vistas/vistaDestaques";
import VistaListaDesejos from "../vistas/vistaListaDesejos";
import React, { useEffect } from 'react';
import DestinoDTO from '../dto/DestinoDTO';
import DestinoPKDTO from '../dto/chaves/DestinoPKDTO';
import ListaDesejosDTO from '../dto/ListaDesejosDTO';
import ListaDesejosPKDTO from "../dto/chaves/ListaDesejosPKDTO";

const ControladorSistema = (controladorPrincipal) => {

    let vistaDestaques = <VistaDestaques obterDestaques={obterDestinosDestaque} />;
    let vistaListaDesejos = <VistaListaDesejos obterListaDeDesejos={obterListaDeDesejos}/>;

    // On mount
    useEffect(
        () => {
            obterDestinosDestaque();
        },
        []
    );

    async function obterDestinosDestaque () {
        // let destinos = [new DestinoDTO("Portugal", "Lisboa"), new DestinoDTO("Espanha", "Madrid")];
        let destinos = [];
        const url = 'http://127.0.0.1:8080/sistema/destaques';

        const response = await fetch(url);
        console.log(response);
        const data = await response.json();

        if (response.status == 200) {
            for (const [key, value] of Object.entries(data)) {
                let destino = new DestinoDTO(new DestinoPKDTO(value.destinoPK.pais, value.destinoPK.localidade));
                destinos.push(destino);
            }
        }

        return destinos;
    }

    async function obterListaDeDesejos ( utilizador ) {

        let listasDesejos = [];
        const url = 'http://127.0.0.1:8080/sistema/listadesejos?utilizador=userteste';

        const response = await fetch(url);

        const data = await response.json();
        console.log(data);
        if (response.status == 200) {
            for (const [key, value] of Object.entries(data)) {
                let ld = new ListaDesejosDTO(new ListaDesejosPKDTO(value.listaDesejosPK.nomeutilizador, value.listaDesejosPK.pais, value.listaDesejosPK.localidade));
                listasDesejos.push(ld);
            }
        }

        // console.log("ajuda");
        // let lista = new ListaDesejosDTO([new DestinoDTO(new DestinoPKDTO("China", "Beijing")),
        //                                 new DestinoDTO(new DestinoPKDTO("Polonia", "Varsovia"))]);
        return listasDesejos;
    }

    return (
        <div>
            { controladorPrincipal.controladorPrincipal == false && vistaDestaques }
            { controladorPrincipal.controladorPrincipal == true && vistaListaDesejos }
        </div>
    );

}

export default ControladorSistema;