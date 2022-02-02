import VistaDestaques from "../vistas/vistaDestaques";
import VistaListaDesejos from "../vistas/vistaListaDesejos";
import VistaInfoCompanhia from "../vistas/vistaInfoCompahias";
import React, { useEffect } from 'react';
import DestinoDTO from '../dto/DestinoDTO';
import DestinoPKDTO from '../dto/chaves/DestinoPKDTO';
import ListaDesejosDTO from '../dto/ListaDesejosDTO';
import ListaDesejosPKDTO from "../dto/chaves/ListaDesejosPKDTO";
import InfoCompanhiaDTO from "../dto/InfoCompanhiaDTO";
import InfoCompanhiaPKDTO from "../dto/chaves/InfoCompanhiaPKDTO";

const ControladorSistema = (controladorPrincipal) => {

    let vistaInfoCompanhia = <VistaInfoCompanhia obterInfoCompanhias={obterInfoCompanhias} />;
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

        return listasDesejos;
    }

    async function obterInfoCompanhias() {
        let infoCompanhias = [];
        const url = 'http://127.0.0.1:8080/sistema/infocompanhias';

        const response = await fetch(url);

        const data = await response.json();
        console.log(data);
        if (response.status == 200) {
            for (const [key, value] of Object.entries(data)) {
                let ld = new InfoCompanhiaDTO(new InfoCompanhiaPKDTO(value.infoCompanhiaPK.companhia, value.infoCompanhiaPK.informacao));
                infoCompanhias.push(ld);
            }
        }

        return infoCompanhias;
    }

    return (
        <div>
            { controladorPrincipal.controladorPrincipal == 'destaques' && vistaDestaques }
            { controladorPrincipal.controladorPrincipal == 'desejos' && vistaListaDesejos }
            { controladorPrincipal.controladorPrincipal == 'companhias' && vistaInfoCompanhia }

        </div>
    );

}

export default ControladorSistema;